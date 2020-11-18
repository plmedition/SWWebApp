package com.example.swapp.service.dto;

import java.net.URI;
import java.util.Date;

/**
 * DTO to encapsulate the {@link com.example.swapp.People} attributes that will be exposed in the API
 */
public class PeopleDTO extends ObjectDTO {

    private String height;
    private String mass;
    private URI url;

    public PeopleDTO(String name, Date created, String height, String mass, URI url) {
        super(name, created);
        this.height = height;
        this.mass = mass;
        this.url = url;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }
}
