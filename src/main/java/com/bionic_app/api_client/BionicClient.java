package com.bionic_app.api_client;

import com.bionic_app.classes.models.FlaggedData;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.net.MalformedURLException;

public class BionicClient {

    public BionicClient() {
        this.settings = new Settings();
        this.requester = new Requester(this.settings);
    }

    public BionicClient(String clientId)
    {
        this.settings = new Settings(clientId);
        this.requester = new Requester(this.settings);
    }

    private Settings settings;
    private Requester requester;

    public void report(FlaggedData data)
    {
        data.setClientKey(this.settings.getClientKey());
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

    public void setServerUrl(String serverUrl) throws MalformedURLException {
        this.settings.setServerUrl(serverUrl);
        this.requester.setUrl();
    }

    public void setDebug(boolean debug)
    {
        this.settings.setDebug(debug);
    }

    public void setClientKey(String clientKey)
    {
        this.settings.setClientKey(clientKey);
    }
}
