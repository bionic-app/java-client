package com.bionic_app.classes;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.HttpsURLConnection;

public class Requester
{
    String apiUrl;
    URL url;
    String charset = StandardCharsets.UTF_8.name();


    public Requester()
    {
        this.apiUrl = "https://flags.bionic-app.com";
        try {
            this.url = new URL(this.apiUrl);
        } catch (MalformedURLException e) {
            //should never get hit as this constructor hardcodes the url
            e.printStackTrace();
        }
    }

    public Requester(String apiUrl) throws MalformedURLException {
        this.apiUrl = apiUrl;
        this.url = new URL(this.apiUrl);
    }

    public void setApiUrl(String apiUrl) throws MalformedURLException {
        this.apiUrl = apiUrl;
        this.url = new URL(this.apiUrl);
    }

    //this returns void because we don't care
    public void post(String json) throws IOException {
        HttpsURLConnection req = (HttpsURLConnection)url.openConnection();
        req.setRequestMethod("POST");
        req.setRequestProperty("Accept", "application/json");
        req.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

        req.setDoOutput(true);

        OutputStreamWriter wr = new OutputStreamWriter(req.getOutputStream());
        wr.write(json);

        req.disconnect();

    }


}
