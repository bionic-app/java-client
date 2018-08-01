package com.bionic_app.classes;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class Serializer
{
    public Serializer()
    {
        this.serializer = new ObjectMapper();
        this.serializer.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    private ObjectMapper serializer;


    public ObjectMapper getSerializer()
    {
        return this.serializer;
    }
}
