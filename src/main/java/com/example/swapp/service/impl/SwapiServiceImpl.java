package com.example.swapp.service.impl;

import com.example.swapp.service.SwapiService;
import com.example.swapp.service.dto.*;
import com.example.swapp.service.dto.mapper.PeopleMapper;
import com.example.swapp.service.dto.mapper.StarshipMapper;
import com.example.swapp.service.search.params.ParamNameEnum;
import com.example.swapp.service.search.params.SearchParams;
import com.example.swapp.service.search.params.OrderEnum;
import com.example.swapp.swapi.response.PeopleApiResponse;
import com.example.swapp.swapi.response.StarshipApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SwapiServiceImpl implements SwapiService {

    @Value("${swapi.people.url:https://swapi.dev/api/people/}")
    private String SWAPI_PEOPLE_URL;

    @Value("${swapi.starship.url:https://swapi.dev/api/starships/}")
    private String SWAPI_STARSHIP_URL;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private PeopleMapper peopleMapper;

    @Autowired
    private StarshipMapper starshipMapper;

    @Override
    public List<PeopleDTO> retrievePeople(SearchParams searchParams) {
        List<PeopleDTO> peopleDTOList = new ArrayList<>();
        try {
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(SWAPI_PEOPLE_URL, String.class);
            PeopleApiResponse peopleApiResponse = objectMapper.readValue(responseEntity.getBody(), PeopleApiResponse.class);
            peopleDTOList = peopleMapper.mapToListPeopleDTO(peopleApiResponse.getResults());
            if(searchParams != null) {
                return (List<PeopleDTO>) sortPeopleDTO(searchParams, peopleDTOList);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return peopleDTOList;
    }

    @Override
    public List<StarshipDTO> retrieveStarships(SearchParams searchParams) {
        List<StarshipDTO> starshipDTOList = new ArrayList<>();
        try {
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(SWAPI_STARSHIP_URL, String.class);
            StarshipApiResponse starshipApiResponse = objectMapper.readValue(responseEntity.getBody(), StarshipApiResponse.class);
            starshipDTOList = starshipMapper.mapToListPeopleDTO(starshipApiResponse.getResults());
            if(searchParams != null) {
                return (List<StarshipDTO>) sortPeopleDTO(searchParams, starshipDTOList);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return starshipDTOList;
    }

    private List<? extends ObjectDTO> sortPeopleDTO(SearchParams searchParams, List<? extends ObjectDTO> dtoList) {
            if (ParamNameEnum.NAME.equals(ParamNameEnum.valueOf(searchParams.getParamName())) && OrderEnum.ASC.equals(OrderEnum.valueOf(searchParams.getOrder()))) {
                Collections.sort(dtoList, new NameComparator());
            } else if (ParamNameEnum.NAME.equals(ParamNameEnum.valueOf(searchParams.getParamName())) && OrderEnum.DESC.equals(OrderEnum.valueOf(searchParams.getOrder()))){
                Collections.sort(dtoList, Collections.reverseOrder(new NameComparator()));
            } else if (ParamNameEnum.CREATED.equals(ParamNameEnum.valueOf(searchParams.getParamName())) && OrderEnum.ASC.equals(OrderEnum.valueOf(searchParams.getOrder()))){
                Collections.sort(dtoList, new DateComparator());
            } else if (ParamNameEnum.CREATED.equals(ParamNameEnum.valueOf(searchParams.getParamName())) && OrderEnum.DESC.equals(OrderEnum.valueOf(searchParams.getOrder()))) {
                Collections.sort(dtoList, Collections.reverseOrder(new DateComparator()));
            }
        return dtoList;
    }

}
