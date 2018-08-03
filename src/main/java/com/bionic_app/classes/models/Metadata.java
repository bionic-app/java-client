package com.bionic_app.classes.models;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Metadata {

    public Metadata() {
    }

    public Metadata(Map<String, String> metadata)
    {
        this.metadata = metadata;
    }

    private Map<String, String> metadata = new HashMap<>();

    Logger logger = Logger.getLogger(Metadata.class.getName());

    public void setItem(String key, String val)
    {
        if (this.metadata.size() <= 10) {
            this.metadata.put(key, val);
        } else {
            this.logger.log(Level.WARNING, "Cannot add more than 10 items to metadata map object");
        }
    }

    public void dropItem(String key)
    {

        this.metadata.remove(key);
    }

    public Map<String, String> getMetadata()
    {
        return this.metadata;
    }
}
