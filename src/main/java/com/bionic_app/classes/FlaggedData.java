package com.bionic_app.classes;

import com.bionic_app.classes.models.*;


public class FlaggedData {
    public FlaggedData(
            String clientKey,
            String typeId,
            String categoryId,
            Content flaggedContent,
            DataContext context,
            Metadata metadata,
            User flaggedUser,
            User reportingUser
            )
    {
        this.clientKey = clientKey;
        this.typeId = typeId;
        this.categoryId = categoryId;
        this.flaggedContent = flaggedContent;
        this.context = context;
        this.metadata = metadata;
        this.flaggedUser = flaggedUser;
        this.reportingUser = reportingUser;
    }



    private String clientKey;
    private String typeId;
    private String categoryId;
    private Content flaggedContent;
    private DataContext context;
    private Metadata metadata;
    private User flaggedUser;
    private User reportingUser;

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
