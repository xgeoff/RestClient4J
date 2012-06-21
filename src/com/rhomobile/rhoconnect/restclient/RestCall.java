/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rhomobile.rhoconnect.restclient;

import java.io.InputStream;
import java.util.Map;

/**
 *
 * @author gporemba
 */
public interface RestCall {
    
    RestResponse get(Map<String, String> params);
    RestResponse post(InputStream content, Map<String, String> params);
    RestResponse post(String content, Map<String, String> params);
    RestResponse put(InputStream content, Map<String, String> params);
    RestResponse put(String content, Map<String, String> params);
    RestResponse delete();
    
}
