package com.example.swapp.controller;

import com.example.swapp.service.SwapiService;
import com.example.swapp.service.dto.PeopleDTO;
import com.example.swapp.service.dto.StarshipDTO;
import com.example.swapp.service.search.params.ParamNameEnum;
import com.example.swapp.service.search.params.SearchParams;
import com.example.swapp.service.search.params.SortCriteriaEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SWWebAppController {

    @Autowired
    SwapiService swapiService;

    @GetMapping("/people")
    public List<PeopleDTO> getPeople(@RequestParam(value = "paramName", required = false) String paramName,
                                     @RequestParam(value = "order", required = false) String order) {
        SearchParams searchParams = initializeSearchParams(paramName, order);
        return swapiService.getPeople(searchParams);
    }

    @GetMapping("/starships")
    public List<StarshipDTO> getStarships(@RequestParam(value = "paramName", required = false) String paramName,
                                          @RequestParam(value = "order", required = false) String order) {
        SearchParams searchParams = initializeSearchParams(paramName, order);
        return swapiService.getStarships(searchParams);
    }

    private SearchParams initializeSearchParams(String paramName, String order){
        SearchParams searchParams = new SearchParams();
        searchParams.setParamNameEnum(paramName == null?null: ParamNameEnum.valueOf(paramName.toUpperCase()));
        searchParams.setSortCriteriaEnum(order == null?null: SortCriteriaEnum.valueOf(order.toUpperCase()));
        return searchParams;
    }
}