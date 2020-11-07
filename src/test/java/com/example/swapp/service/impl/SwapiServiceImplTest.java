package com.example.swapp.service.impl;

import com.example.swapp.service.SwapiService;
import com.example.swapp.service.dto.ObjectDTO;
import com.example.swapp.service.dto.PeopleDTO;
import com.example.swapp.service.dto.StarshipDTO;
import com.example.swapp.service.search.params.ParamNameEnum;
import com.example.swapp.service.search.params.SearchParams;
import com.example.swapp.service.search.params.SortCriteriaEnum;
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
/*@TestPropertySource(properties = {"swapi.people.url=https://swapi.dev/api/people/",
                                  "swapi.starship.url=https://swapi.dev/api/starships/"})*/
public class SwapiServiceImplTest {

   /* @TestConfiguration
    public static class SpringContext {
        @Bean
        public SwapiService swapiService() {
            return new SwapiServiceImpl();
        }

        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }

        @Bean
        public ObjectMapper objectMapper() {
            return new ObjectMapper();
        }

        @Bean
        public PeopleMapper peopleMapper() {
            return new PeopleMapper();
        }

        @Bean
        public StarshipMapper starshipMapper() {
            return new StarshipMapper();
        }
    }*/

    @Autowired
    public SwapiService swapiService;

    @Test
    void getAllPeople() {
        List<PeopleDTO> peopleDTOList = swapiService.getPeople(null);
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
    }

    @Test
    void getAllStarships() {
        List<StarshipDTO> starshipDTOList = swapiService.getStarships(null);
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
    }

    @Test
    void getPeopleSortByNameAsc() {
        List<PeopleDTO> peopleDTOList = swapiService.getPeople(new SearchParams(ParamNameEnum.NAME, SortCriteriaEnum.ASC));
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
        assertTrue(isPeopleDTOListSorted(peopleDTOList, new ObjectDTO.NameComparator(), true, false), "The list is not asc sorted by name.");
    }

    @Test
    void getPeopleSortByNameDesc() {
        List<PeopleDTO> peopleDTOList = swapiService.getPeople(new SearchParams(ParamNameEnum.NAME, SortCriteriaEnum.DESC));
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
        assertTrue(isPeopleDTOListSorted(peopleDTOList, new ObjectDTO.NameComparator(), false, true), "The list is not desc sorted by name.");
    }

    @Test
    void getPeopleSortByCreatedAsc() {
        List<PeopleDTO> peopleDTOList = swapiService.getPeople(new SearchParams(ParamNameEnum.CREATED, SortCriteriaEnum.ASC));
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
        assertTrue(isPeopleDTOListSorted(peopleDTOList, new ObjectDTO.DateComparator(), true, false), "The list is not asc sorted by created.");
    }

    @Test
    void getPeopleSortByCreatedDesc() {
        List<PeopleDTO> peopleDTOList = swapiService.getPeople(new SearchParams(ParamNameEnum.CREATED, SortCriteriaEnum.DESC));
        assertNotNull(peopleDTOList, "People list is null");
        assertTrue(!peopleDTOList.isEmpty(), "People list is empty.");
        assertTrue(isPeopleDTOListSorted(peopleDTOList, new ObjectDTO.DateComparator(), false, true), "The list is not desc sorted by created.");
    }

    @Test
    void getStarshipSortByNameAsc() {
        List<StarshipDTO> starshipDTOList = swapiService.getStarships(new SearchParams(ParamNameEnum.NAME, SortCriteriaEnum.ASC));
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
        assertTrue(isStarshipDTOListSorted(starshipDTOList, new ObjectDTO.NameComparator(), true, false), "The list is not asc sorted by name.");
    }

    @Test
    void getStarshipSortByNameDesc() {
        List<StarshipDTO> starshipDTOList = swapiService.getStarships(new SearchParams(ParamNameEnum.NAME, SortCriteriaEnum.DESC));
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
        assertTrue(isStarshipDTOListSorted(starshipDTOList, new ObjectDTO.NameComparator(), false, true), "The list is not desc sorted by name.");
    }

    @Test
    void getStarshipSortByCreatedAsc() {
        List<StarshipDTO> starshipDTOList = swapiService.getStarships(new SearchParams(ParamNameEnum.CREATED, SortCriteriaEnum.ASC));
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
        assertTrue(isStarshipDTOListSorted(starshipDTOList, new ObjectDTO.DateComparator(), true, false), "The list is not asc sorted by created.");
    }

    @Test
    void getStarshipSortByCreatedDesc() {
        List<StarshipDTO> starshipDTOList = swapiService.getStarships(new SearchParams(ParamNameEnum.CREATED, SortCriteriaEnum.DESC));
        assertNotNull(starshipDTOList, "Starship list is null");
        assertTrue(!starshipDTOList.isEmpty(), "Starship list is empty.");
        assertTrue(isStarshipDTOListSorted(starshipDTOList, new ObjectDTO.DateComparator(), false, true), "The list is not desc sorted by created.");
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