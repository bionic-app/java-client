package com.bionic_app.classes.models;

import com.bionic_app.classes.models.*;


public class FlaggedData extends Serializable {

    //required params constructor
    public FlaggedData(
            String clientKey,
            Content content
    )
    {
        super();
        this.clientKey = clientKey;
        this.content = content;
    }

    public FlaggedData(
            String clientKey,
            Content content,
            String typeId,
            String categoryId,
            User flaggedUser,
            User reportingUser,
            DataContext context,
            Metadata metadata
    )
    {
        super();
        this.clientKey = clientKey;
        this.typeId = typeId;
        this.categoryId = categoryId;
        this.content = content;
        this.flaggedUser = flaggedUser;
        this.reportingUser = reportingUser;
        this.context = context;
        this.metadata = metadata;
    }



    private String clientKey;
    private String typeId;
    private String categoryId;
    private Content content;
    private DataContext context;
    private Metadata metadata;
    private User flaggedUser;
    private User reportingUser;

    //METHODS

    //GETTERS & SETTERS

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public DataContext getContext() {
        return context;
    }

    public void setContext(DataContext context) {
        this.context = context;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public User getFlaggedUser() {
        return flaggedUser;
    }

    public void setFlaggedUser(User flaggedUser) {
        this.flaggedUser = flaggedUser;
    }

    public User getReportingUser() {
        return reportingUser;
    }

    public void setReportingUser(User reportingUser) {
        this.reportingUser = reportingUser;
    }

}
