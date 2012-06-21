/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rhomobile.rhoconnect.restclient;

import java.net.MalformedURLException;
import java.util.Map;

/**
 *
 * @author gporemba
 */
public class RestClient4J {
    
    public static RestResponse get(String url, Map<String, String> params) throws MalformedURLException {
        RestClient rc = new RestClient(url);
        return rc.get(params);
    }
    
    public static RestResponse post(String url, String content, Map<String, String> params) throws MalformedURLException {
        RestClient rc = new RestClient(url);
        return rc.post(content, params);
    }
    
    public static RestResponse put(String url, String content, Map<String, String> params) throws MalformedURLException {
        RestClient rc = new RestClient(url);
        return rc.put(content, params);
    }
    
    public static RestResponse delete(String url) throws MalformedURLException {
        RestClient rc = new RestClient(url);
        return rc.delete();
    }
    
}
