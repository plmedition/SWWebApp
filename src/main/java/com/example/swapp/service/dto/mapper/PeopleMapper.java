package com.example.swapp.service.dto.mapper;

import com.example.swapp.People;
import com.example.swapp.service.dto.PeopleDTO;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleMapper {

    public PeopleDTO mapToPeopleDTO(People people) {
        return new PeopleDTO(people.getName(), people.getCreated(), people.getHeight(), people.getMass(), people.getUrl());
    }

    public List<PeopleDTO> mapToListPeopleDTO(List<People> peopleList) {
        List<PeopleDTO> peopleDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(peopleList)) {
            for (People people : peopleList) {
                peopleDTOList.add(mapToPeopleDTO(people));
            }
        }
        return peopleDTOList;
    }
}
