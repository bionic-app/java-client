package com.bionic_app.api_client;

public class Settings {

    public Settings()
    {

    }

    public Settings(String clientKey)
    {
        this.clientKey = clientKey;
    }

    private boolean debug = false;
    private String serverUrl = "https://flags.bionic-app.com";
    private String clientKey;

    protected boolean isDebug() {
        return debug;
    }

    protected void setDebug(boolean debug) {
        this.debug = debug;
    }

    protected String getServerUrl() {
        return serverUrl;
    }

    protected void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    protected String getClientKey() {
        return clientKey;
    }

    protected void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

}
