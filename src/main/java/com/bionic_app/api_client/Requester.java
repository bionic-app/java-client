package com.bionic_app.api_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

import javax.net.ssl.HttpsURLConnection;

import com.bionic_app.api_client.Settings;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class Requester
{
    URL url;
    Settings settings;
    Logger logger;
    Serializer serializer;

    public Requester(Settings settings)
    {
        this.settings = settings;
        this.logger = Logger.getLogger(Requester.class.getName());
        this.serializer = new Serializer();
        try {
            this.setUrl();
        } catch (MalformedURLException e) {
            //should never get hit as this constructor hardcodes the url
            e.printStackTrace();
        }
    }

    protected void setUrl() throws MalformedURLException {

        this.url = new URL(this.settings.getServerUrl());
    }

    public URL getUrl() {
        return this.url;
    }

    //this returns void because we don't care if it's a success or not in production...
    //Turn on debug in settings to log responses
    public void post(String json) throws IOException {
        logger.info("started request to bionic");
        ObjectMapper mapper = this.serializer.getMapper();
        Object js = mapper.readValue(json, Object.class);
        logger.info("JSON data: " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(js));
        HttpsURLConnection req = (HttpsURLConnection)url.openConnection();
        req.setRequestMethod("POST");
        req.setRequestProperty("Content-Type", "application/json");

        req.setDoOutput(true);

        OutputStreamWriter wr = new OutputStreamWriter(req.getOutputStream());
        wr.write(json);

        int status = req.getResponseCode();
        logger.info(Integer.toString(status));

        if (status == 400) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(req.getErrorStream())
            );
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            logger.info(content.toString());
        }

        req.disconnect();

    }


}
