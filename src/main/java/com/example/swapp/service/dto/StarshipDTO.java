package com.example.swapp.service.dto;

import java.util.Date;

public class StarshipDTO extends ObjectDTO {

    private String model;
    private String manufacturer;
    private String length;

    public StarshipDTO(String name, Date created, String model, String manufacturer, String length) {
        this.name = name;
        this.created = created;
        this.model = model;
        this.manufacturer = manufacturer;
        this.length = length;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
