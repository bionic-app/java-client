package com.bionic_app.classes.models;

import com.bionic_app.classes.models.*;


public class FlaggedData extends Serializable {

    //required params constructor
    public FlaggedData(
            String clientKey,
            Content flaggedContent
    )
    {
        super();
        this.clientKey = clientKey;
        this.flaggedContent = flaggedContent;
    }

    public FlaggedData(
            String clientKey,
            Content flaggedContent,
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
        this.flaggedContent = flaggedContent;
        this.flaggedUser = flaggedUser;
        this.reportingUser = reportingUser;
        this.context = context;
        this.metadata = metadata;
    }



    private String clientKey;
    private String typeId;
    private String categoryId;
    private Content flaggedContent;
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

    public Content getFlaggedContent() {
        return flaggedContent;
    }

    public void setFlaggedContent(Content flaggedContent) {
        this.flaggedContent = flaggedContent;
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
