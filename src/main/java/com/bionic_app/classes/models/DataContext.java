package com.bionic_app.classes.models;

public class DataContext {

    public DataContext(String id, String content) {
        this.id = id;
        this.content = content;
    }
    public DataContext(String id, String content, String link) {
        this.id = id;
        this.content = content;
        this.link = link;
    }

    private String id;
    private String content;
    private String link;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
