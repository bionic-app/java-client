package com.bionic_app.classes.models;

public class Content {

    public Content(String id, String contentType, String content, String reporterComments)
    {
        this.id = id;
        this.contentType = contentType;
        this.content = content;
        this.reporterComments = reporterComments;
    }

    private String id;
    private String contentType;
    private String content;
    private String reporterComments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
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
