package com.example.swapp.service.impl;

import com.example.swapp.service.SwapiService;
import com.example.swapp.service.dto.*;
import com.example.swapp.service.search.params.OrderEnum;
import com.example.swapp.service.search.params.ParamNameEnum;
import com.example.swapp.service.search.params.SearchParams;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ContextConfiguration()
@SpringBootTest
public class SwapiServiceImplTest {

    @Autowired
    public SwapiService swapiService;

    @Test
    void retrieveAllPeopleTest() {
        List<PeopleDTO> peopleDTOList = swapiService.retrievePeople(null);
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
    }

    @Test
    void retrieveAllStarshipsTest() {
        List<StarshipDTO> starshipDTOList = swapiService.retrieveStarships(null);
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
    }

    @Test
    void retrievePeopleSortByNameAscTest() {
        List<PeopleDTO> peopleDTOList = swapiService.retrievePeople(new SearchParams(ParamNameEnum.NAME.name(), OrderEnum.ASC.name()));
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
        assertTrue(isPeopleDTOListSorted(peopleDTOList, new NameComparator(), true, false), "The list is not asc sorted by name.");
    }

    @Test
    void retrievePeopleSortByNameDescTest() {
        List<PeopleDTO> peopleDTOList = swapiService.retrievePeople(new SearchParams(ParamNameEnum.NAME.name(), OrderEnum.DESC.name()));
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
        assertTrue(isPeopleDTOListSorted(peopleDTOList, new NameComparator(), false, true), "The list is not desc sorted by name.");
    }

    @Test
    void retrievePeopleSortByCreatedAscTest() {
        List<PeopleDTO> peopleDTOList = swapiService.retrievePeople(new SearchParams(ParamNameEnum.CREATED.name(), OrderEnum.ASC.name()));
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
        assertTrue(isPeopleDTOListSorted(peopleDTOList, new DateComparator(), true, false), "The list is not asc sorted by created.");
    }

    @Test
    void retrievePeopleSortByCreatedDescTest() {
        List<PeopleDTO> peopleDTOList = swapiService.retrievePeople(new SearchParams(ParamNameEnum.CREATED.name(), OrderEnum.DESC.name()));
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
        assertTrue(isPeopleDTOListSorted(peopleDTOList, new DateComparator(), false, true), "The list is not desc sorted by created.");
    }

    @Test
    void retrieveStarshipSortByNameAscTest() {
        List<StarshipDTO> starshipDTOList = swapiService.retrieveStarships(new SearchParams(ParamNameEnum.NAME.name(), OrderEnum.ASC.name()));
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
        assertTrue(isStarshipDTOListSorted(starshipDTOList, new NameComparator(), true, false), "The list is not asc sorted by name.");
    }

    @Test
    void retrieveStarshipSortByNameDescTest() {
        List<StarshipDTO> starshipDTOList = swapiService.retrieveStarships(new SearchParams(ParamNameEnum.NAME.name(), OrderEnum.DESC.name()));
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
        assertTrue(isStarshipDTOListSorted(starshipDTOList, new NameComparator(), false, true), "The list is not desc sorted by name.");
    }

    @Test
    void retrieveStarshipSortByCreatedAscTest() {
        List<StarshipDTO> starshipDTOList = swapiService.retrieveStarships(new SearchParams(ParamNameEnum.CREATED.name(), OrderEnum.ASC.name()));
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
        assertTrue(isStarshipDTOListSorted(starshipDTOList, new DateComparator(), true, false), "The list is not asc sorted by created.");
    }

    @Test
    void retrieveStarshipSortByCreatedDescTest() {
        List<StarshipDTO> starshipDTOList = swapiService.retrieveStarships(new SearchParams(ParamNameEnum.CREATED.name(), OrderEnum.DESC.name()));
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
        assertTrue(isStarshipDTOListSorted(starshipDTOList, new DateComparator(), false, true), "The list is not desc sorted by created.");
    }

    private boolean isPeopleDTOListSorted(List<PeopleDTO> peopleDTOList, Comparator<ObjectDTO> comparator, boolean asc, boolean desc) {
        Iterator<PeopleDTO> iter = peopleDTOList.iterator();
        ObjectDTO current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (asc && comparator.compare(previous, current) > 0) {
                return false;
            } else if (desc && comparator.compare(previous, current) <= 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    private boolean isStarshipDTOListSorted(List<StarshipDTO> peopleDTOList, Comparator<ObjectDTO> comparator, boolean asc, boolean desc) {
        Iterator<StarshipDTO> iter = peopleDTOList.iterator();
        StarshipDTO current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (asc && comparator.compare(previous, current) > 0) {
                return false;
            } else if (desc && comparator.compare(previous, current) <= 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

}