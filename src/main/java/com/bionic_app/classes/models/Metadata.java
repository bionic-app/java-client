package com.bionic_app.classes.models;

import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Metadata {
    Map<String, String> metadata;
    Logger logger = Logger.getLogger(Metadata.class.getName());

    public void setItem(String key, String val)
    {
        if (metadata.size() <= 10) {
            metadata.put(key, val);
        } else {
            this.logger.log(Level.WARNING, "Cannot add more than 10 items to metadata map object");
        }
    }

    public void dropItem(String key)
    {
        metadata.remove(key);
    }
}
