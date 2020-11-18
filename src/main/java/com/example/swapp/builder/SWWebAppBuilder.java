package com.example.swapp.builder;

import com.example.swapp.exception.ErrorDTO;
import com.example.swapp.service.dto.PeopleDTO;
import com.example.swapp.service.dto.StarshipDTO;
import com.example.swapp.service.search.params.SearchParams;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SWWebAppBuilder {

    public SearchParams buildSearchParams(String paramName, String order) {
        return new SearchParams(paramName != null ? paramName.toUpperCase() : null,
                                order != null ? order.toUpperCase() : null);
    }

    public ResponseEntity<ErrorDTO> buildErrorDto(String message) {

        ErrorDTO errorDTO = new ErrorDTO(message);

        return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<PeopleDTO>> buildPeopleResponse(List<PeopleDTO> peopleDTOList) {
        return new ResponseEntity<List<PeopleDTO>>(peopleDTOList, HttpStatus.OK);
    }

    public ResponseEntity<List<StarshipDTO>> buildStarshipResponse(List<StarshipDTO> starshipDTOList) {
        return new ResponseEntity<List<StarshipDTO>>(starshipDTOList, HttpStatus.OK);
    }

}
