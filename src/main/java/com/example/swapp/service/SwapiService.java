package com.example.swapp.service;

import com.example.swapp.People;
import com.example.swapp.Starship;
import com.example.swapp.service.dto.PeopleDTO;
import com.example.swapp.service.dto.StarshipDTO;
import com.example.swapp.service.search.params.SearchParams;

import java.util.List;

public interface SwapiService {


    List<PeopleDTO> getPeople(SearchParams searchParams);
    
    List<StarshipDTO> getStarships(SearchParams searchParams);

}
