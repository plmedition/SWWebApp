package com.example.swapp.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Comparator;
import java.util.Date;

public class ObjectDTO {

    protected String name;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    protected Date created;

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

    public static class NameComparator implements Comparator<ObjectDTO> {
        @Override
        public int compare(ObjectDTO o1, ObjectDTO o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static class DateComparator implements Comparator<ObjectDTO> {
        @Override
        public int compare(ObjectDTO o1, ObjectDTO o2) {
            return o1.created.compareTo(o2.created);
        }
    }
}
