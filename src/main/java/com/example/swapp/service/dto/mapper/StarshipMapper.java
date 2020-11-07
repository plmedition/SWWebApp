package com.example.swapp.service.dto.mapper;

import com.example.swapp.People;
import com.example.swapp.Starship;
import com.example.swapp.service.dto.PeopleDTO;
import com.example.swapp.service.dto.StarshipDTO;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class StarshipMapper {

    public StarshipDTO mapToStarshipDTO(Starship starship) {
        return new StarshipDTO(starship.getName(), starship.getCreated(), starship.getModel(), starship.getManufacturer(), starship.getLength());
    }

    public List<StarshipDTO> mapToListPeopleDTO(List<Starship> starshipList) {
        List<StarshipDTO> starshipDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(starshipList)) {
            for (Starship starship : starshipList) {
                starshipDTOList.add(mapToStarshipDTO(starship));
            }
        }
        return starshipDTOList;
    }

}
