package com.example.swapp.service.dto;

import java.net.URI;
import java.util.Date;

public class PeopleDTO extends ObjectDTO {

    private String height;
    private String mass;
    private URI url;

    public PeopleDTO(String name, Date created, String height, String mass, URI url) {
        this.name = name;
        this.created = created;
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
