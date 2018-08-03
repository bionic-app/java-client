package com.bionic_app.classes.models;

import com.bionic_app.classes.Serializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Type;

public class Serializable {

    public Serializable()
    {
        this.serializer = new Serializer();
    }

    private Serializer serializer;

    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = this.serializer.getMapper();
        return mapper.writeValueAsString(this);
    }
}
