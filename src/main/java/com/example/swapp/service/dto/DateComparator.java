package com.example.swapp.service.dto;

import java.util.Comparator;

/**
 * Implementation of {@link Comparator} to allow the service to sort by Date the {@link PeopleDTO} and {@link StarshipDTO}
 * This is the key for the open-closed principle
 */
public class DateComparator implements Comparator<ObjectDTO> {
    @Override
    public int compare(ObjectDTO o1, ObjectDTO o2) {
        return o1.created.compareTo(o2.created);
    }
}
