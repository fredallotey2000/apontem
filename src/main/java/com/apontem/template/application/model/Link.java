/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvirtual.api.model;

/**
 *
 * @author Bsystems
 */
public class Link {

    private String url;
    private String rel;

    public String getUrl() {
        return url;
    }

    public Link(String url, String rel) {
        this.url = url;
        this.rel = rel;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }   

}
