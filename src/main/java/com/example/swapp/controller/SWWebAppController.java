package com.example.swapp.controller;

import com.example.swapp.builder.SWWebAppBuilder;
import com.example.swapp.exception.SWWebAppException;
import com.example.swapp.service.SwapiService;
import com.example.swapp.service.dto.PeopleDTO;
import com.example.swapp.service.dto.StarshipDTO;
import com.example.swapp.service.search.params.SearchParams;
import com.example.swapp.validator.SWWebAppValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SWWebAppController {


    private SwapiService swapiService;
    private SWWebAppBuilder swWebAppBuilder;
    private SWWebAppValidator swWebAppValidator;

    @Autowired
    public SWWebAppController(SwapiService swapiService, SWWebAppBuilder swWebAppBuilder, SWWebAppValidator swWebAppValidator) {
        this.swapiService = swapiService;
        this.swWebAppBuilder = swWebAppBuilder;
        this.swWebAppValidator = swWebAppValidator;
    }

    @GetMapping("/people")
    public ResponseEntity<List<PeopleDTO>> getPeople(@RequestParam(value = "paramName", required = false) String paramName,
                                                     @RequestParam(value = "order", required = false) String order) throws SWWebAppException {

        SearchParams searchParams = swWebAppBuilder.buildSearchParams(paramName, order);
        swWebAppValidator.validateSearchParams(searchParams);
        List<PeopleDTO> peopleDTOList = swapiService.retrievePeople(searchParams);

        return swWebAppBuilder.buildPeopleResponse(peopleDTOList);
    }

    @GetMapping("/starships")
    public ResponseEntity<List<StarshipDTO>> getStarships(@RequestParam(value = "paramName", required = false) String paramName,
                                                          @RequestParam(value = "order", required = false) String order) throws SWWebAppException {

        SearchParams searchParams = swWebAppBuilder.buildSearchParams(paramName, order);
        swWebAppValidator.validateSearchParams(searchParams);
        List<StarshipDTO> starshipDTOList = swapiService.retrieveStarships(searchParams);

        return swWebAppBuilder.buildStarshipResponse(starshipDTOList);
    }


}