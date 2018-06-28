package com.bionic_app.classes;

import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class Requestor
{
    String flag_url;
    URL url;

    public Requestor()
    {
        this.flag_url = "https://stream.bionic-app.com";
    }

    public void setFlagUrl(String flag_url) {
        this.flag_url = flag_url;
    }
}
