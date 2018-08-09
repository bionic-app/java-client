package com.bionic_app.api_client;


import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class Serializer
{
    public Serializer()
    {
        this.mapper = new ObjectMapper();
        this.mapper.
                setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE).
                setSerializationInclusion(Include.NON_NULL);
    }

    private ObjectMapper mapper;


    public ObjectMapper getMapper()
    {
        return this.mapper;
    }
}
