/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rhomobile.rhoconnect.restclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gporemba
 */
public class RestResponseImpl implements RestResponse {
    
    InputStream response;
    int responseCode;
    StringWriter body;
    int responseData = 0;
    String contentType;
    Map<String, List<String>> headers;
    

    public RestResponseImpl(HttpURLConnection connection) {
        
        try {
            //connection.setDoInput(true);
            body = new StringWriter();
            
            responseCode = connection.getResponseCode();
            contentType = connection.getContentType();
            headers = connection.getHeaderFields();
            
            response = connection.getInputStream();
            responseData = response.read();

            while (responseData > -1) {
                body.append((char)responseData);
                responseData = response.read();
            }
            
            connection.disconnect();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    @Override
    public String body() {
        return body.toString();
        
    }
    
    

    @Override
    public int code() {
        return responseCode;
    }

    @Override
    public Map<String, List<String>> headers() {
        return headers;
    }

    @Override
    public String contentType() {
        return contentType;
    }
    
    
}
