package com.example.swapp.service;

import com.example.swapp.service.dto.PeopleDTO;
import com.example.swapp.service.dto.StarshipDTO;
import com.example.swapp.service.search.params.SearchParams;

import java.util.List;

public interface SwapiService {

    /**
     * Get a list of {@link PeopleDTO} based on the response of de swapi "/people" service
     *
     * @param searchParams Search criteria based on swapi "Name" or "Created" params
     * @return a list of {@link PeopleDTO}
     */
    List<PeopleDTO> retrievePeople(SearchParams searchParams);

    /**
     * Get a list of {@link StarshipDTO} based on the response of de swapi "/starships" service
     *
     * @param searchParams Search criteria based on swapi "Name" or "Created" params
     * @return a list of {@link StarshipDTO}
     */
    List<StarshipDTO> retrieveStarships(SearchParams searchParams);

}
