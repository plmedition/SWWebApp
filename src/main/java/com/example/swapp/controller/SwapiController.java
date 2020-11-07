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
public class SwapiController {

    @Autowired
    SwapiService swapiService;

    @GetMapping("/people")
    public List<PeopleDTO> getPeople(@RequestParam(value = "paramName") String paramName,
                                     @RequestParam(value = "order") String order) {
        SearchParams searchParams = new SearchParams(ParamNameEnum.valueOf(paramName.toUpperCase()),
                SortCriteriaEnum.valueOf(order.toUpperCase()));
        return swapiService.getPeople(searchParams);
    }

    @GetMapping("/starships")
    public List<StarshipDTO> getStarships(@RequestParam(value = "paramName") String paramName,
                                          @RequestParam(value = "order") String order) {
        SearchParams searchParams = new SearchParams(ParamNameEnum.valueOf(paramName), SortCriteriaEnum.valueOf(order));
        return swapiService.getStarships(searchParams);
    }
}
