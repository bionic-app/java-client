package com.bionic_app.api_client;

import com.bionic_app.classes.*;
import com.bionic_app.classes.models.FlaggedData;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public class BionicClient {
    public BionicClient()
    {
        this.settings = new Settings();
        this.requester = new Requester();
    }

    private Settings settings;
    private Requester requester;

    public void report(FlaggedData data)
    {
        try {
            String serializedData = data.serialize();
            this.requester.post(serializedData);
        } catch (JsonProcessingException e) {
            //json serialization error
            e.printStackTrace();
        } catch (IOException e) {
            //request error
            e.printStackTrace();
        }

    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Requester getRequester() {
        return requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
    }


}
