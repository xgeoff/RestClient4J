/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rhomobile.rhoconnect.restclient;

import java.util.Map;

/**
 *
 * @author gporemba
 */
public interface RestResponse {
    public String body();
    public Map headers();
    public int code();
    public String contentType();
}
