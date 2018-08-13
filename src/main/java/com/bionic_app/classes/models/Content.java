package com.bionic_app.classes.models;

public class Content {

    public Content(String id, ContentType contentType, String content)
    {
        this.id = id;
        this.contentType = contentType;
        this.content = content;
    }

    public Content(String id, ContentType contentType, String content, String reporterComments)
    {
        this.id = id;
        this.contentType = contentType;
        this.content = content;
        this.reporterComments = reporterComments;
    }

    public enum ContentType {
        TEXT, IMAGE, VIDEO;
    }

    private String id;
    ContentType contentType;
    private String content;
    private String reporterComments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReporterComments() {
        return reporterComments;
    }

    public void setReporterComments(String reporterComments) {
        this.reporterComments = reporterComments;
    }
}
