package com.bionic_app.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.instanceOf;

import java.nio.file.*;
import java.io.IOException;

import com.bionic_app.api_client.Serializer;
import com.bionic_app.classes.models.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FlaggedDataTest
{
    private Content content;
    private FlaggedData flaggedData;
    private DataContext context;
    private Metadata metadata;
    private User flaggedUser;
    private User reportingUser;

    @Before
    public void setUp() {
        this.content = new Content("123", Content.ContentType.TEXT, "ldk", "ldkf");
        this.context = new DataContext("123", "bad", "https://my.link.com/123");
        this.reportingUser = new User("123");
        this.flaggedUser = new User("234");
        this.metadata = new Metadata();
        this.metadata.setItem("testKey", "testVal");

        this.flaggedData = new FlaggedData(
                "abc",
                this.content,
                "123",
                "234",
                this.flaggedUser,
                this.reportingUser,
                this.context,
                this.metadata
        );
    }

    @Test
    public void flaggedData_containsCorrectProperties()
    {
        assertThat(this.flaggedData, hasProperty("clientKey"));
        assertThat(this.flaggedData, hasProperty("typeId"));
        assertThat(this.flaggedData, hasProperty("categoryId"));
        assertThat(this.flaggedData, hasProperty("flaggedContent"));
        assertThat(this.flaggedData, hasProperty("flaggedUser"));
        assertThat(this.flaggedData, hasProperty("reportingUser"));
        assertThat(this.flaggedData, hasProperty("metadata"));
    }

    @Test
    public void flaggedData_returnsCorrectPropertyTypes()
    {
        assertThat(this.flaggedData.getClientKey(), instanceOf(String.class));
        assertThat(this.flaggedData.getTypeId(), instanceOf(String.class));
        assertThat(this.flaggedData.getCategoryId(), instanceOf(String.class));
        assertThat(this.flaggedData.getContent(), instanceOf(Content.class));
        assertThat(this.flaggedData.getFlaggedUser(), instanceOf(User.class));
        assertThat(this.flaggedData.getReportingUser(), instanceOf(User.class));
        assertThat(this.flaggedData.getContext(), instanceOf(DataContext.class));
        assertThat(this.flaggedData.getMetadata(), instanceOf(Metadata.class));
    }

    @Test
    public void flaggedDataSerializer_returnsCorrectObject()
    {
        Serializer serializer = new Serializer();
        ObjectMapper mapper = serializer.getMapper();
        try {
            String generatedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.flaggedData);
            String expectedJson = "";
            try {
                expectedJson = new String(Files.readAllBytes(Paths.get("src/test/java/com/bionic_app/helpers/flaggedData.json")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            assertEquals(expectedJson, generatedJson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void flaggedData_constructorOnlyRequiresClientKeyAndContent()
    {
        Content c = new Content("123", Content.ContentType.TEXT, "hello world");
        FlaggedData fg = new FlaggedData("abc", c);
        assertEquals(fg.getClientKey(), "abc");
        assertThat(fg.getContent(), instanceOf(Content.class));
    }
}