package com.example.swapp.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * DTO to encapsulate the common attributes for both {@link com.example.swapp.object.People} and {@link com.example.swapp.object.Starship}
 * attributes that will be exposed in the API
 */
public class ObjectDTO {

    protected String name;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    protected Date created;

    public ObjectDTO(String name, Date created) {
        this.name = name;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
