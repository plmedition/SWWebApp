package com.example.swapp.service.impl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.ArrayList;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Integration tests to assert the response of the API endpoints stored in {@link com.example.swapp.controller.SWWebAppController}
 */
@SpringBootTest
@AutoConfigureMockMvc
public class SWWebAppIntegrationTest {
    // Assuming https://swapi.dev response will not be modified these tests asserts the number of elements and values
    // sorted by the params "paramName" and "order"

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPeopleByNameAscOK() throws Exception {
        // Assuming https://swapi.dev response will not be modified this test asserts the number of elements and values
        // sorted by "name" "asc"
        mockMvc.perform(MockMvcRequestBuilders.get("/people")
                .param("paramName", "name")
                .param("order", "asc")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", isA(ArrayList.class)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name", containsString("Beru")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name", containsString("Biggs")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].name", containsString("C-3PO")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[3].name", containsString("Darth")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[4].name", containsString("Leia")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[5].name", containsString("Luke")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[6].name", containsString("Obi")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[7].name", containsString("Owen")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[8].name", containsString("R2")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[9].name", containsString("R5")));
    }

    @Test
    public void testGetPeopleByNameDescOK() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/people")
                .param("paramName", "name")
                .param("order", "desc")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", isA(ArrayList.class)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name", containsString("R5")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name", containsString("R2")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].name", containsString("Owen")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[3].name", containsString("Obi")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[4].name", containsString("Luke")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[5].name", containsString("Leia")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[6].name", containsString("Darth")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[7].name", containsString("C-3PO")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[8].name", containsString("Biggs")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[9].name", containsString("Beru")));
    }

    @Test
    public void testGetPeopleByCreatedAsc() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/people")
                .param("paramName", "created")
                .param("order", "asc")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", isA(ArrayList.class)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].created", containsString("09-12-2014 13:50:51")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].created", containsString("10-12-2014 15:10:51")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].created", containsString("10-12-2014 15:11:50")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[3].created", containsString("10-12-2014 15:18:20")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[4].created", containsString("10-12-2014 15:20:09")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[5].created", containsString("10-12-2014 15:52:14")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[6].created", containsString("10-12-2014 15:53:41")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[7].created", containsString("10-12-2014 15:57:50")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[8].created", containsString("10-12-2014 15:59:50")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[9].created", containsString("10-12-2014 16:16:29")));
    }

    @Test
    public void testGetPeopleByCreatedDesc() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/people")
                .param("paramName", "created")
                .param("order", "desc")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", isA(ArrayList.class)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].created", containsString("10-12-2014 16:16:29")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].created", containsString("10-12-2014 15:59:50")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].created", containsString("10-12-2014 15:57:50")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[3].created", containsString("10-12-2014 15:53:41")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[4].created", containsString("10-12-2014 15:52:14")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[5].created", containsString("10-12-2014 15:20:09")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[6].created", containsString("10-12-2014 15:18:20")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[7].created", containsString("10-12-2014 15:11:50")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[8].created", containsString("10-12-2014 15:10:51")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[9].created", containsString("09-12-2014 13:50:51")));
    }

    @Test
    public void testGetStarshipByNameAscOK() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/starships")
                .param("paramName", "name")
                .param("order", "asc")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", isA(ArrayList.class)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name", containsString("CR90")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name", containsString("Death")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].name", containsString("Executor")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[3].name", containsString("Millennium")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[4].name", containsString("Rebel")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[5].name", containsString("Sentinel")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[6].name", containsString("Destroyer")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[7].name", containsString("TIE")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[8].name", containsString("X")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[9].name", containsString("Y")));
    }

    @Test
    public void testGetStarshipByNameDescOK() throws Exception {
        // Assuming https://swapi.dev response will not be modified this test asserts the number of elements and values
        // sorted by "name" "asc"
        mockMvc.perform(MockMvcRequestBuilders.get("/starships")
                .param("paramName", "name")
                .param("order", "desc")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", isA(ArrayList.class)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name", containsString("Y")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name", containsString("X")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].name", containsString("TIE")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[3].name", containsString("Destroyer")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[4].name", containsString("Sentinel")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[5].name", containsString("Rebel")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[6].name", containsString("Millennium")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[7].name", containsString("Executor")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[8].name", containsString("Death")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[9].name", containsString("CR90")));
    }

    @Test
    public void testGetStarshipsByCreatedAsc() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/starships")
                .param("paramName", "created")
                .param("order", "asc")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", isA(ArrayList.class)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].created", containsString("10-12-2014 14:20:33")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].created", containsString("10-12-2014 15:08:19")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].created", containsString("10-12-2014 15:48:00")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[3].created", containsString("10-12-2014 16:36:50")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[4].created", containsString("10-12-2014 16:59:45")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[5].created", containsString("12-12-2014 11:00:39")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[6].created", containsString("12-12-2014 11:19:05")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[7].created", containsString("12-12-2014 11:21:32")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[8].created", containsString("15-12-2014 12:31:42")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[9].created", containsString("15-12-2014 12:34:52")));
    }

    @Test
    public void testGetStarshipsByCreatedDesc() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/starships")
                .param("paramName", "created")
                .param("order", "desc")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", isA(ArrayList.class)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(10)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].created", containsString("15-12-2014 12:34:52")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].created", containsString("15-12-2014 12:31:42")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].created", containsString("12-12-2014 11:21:32")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[3].created", containsString("12-12-2014 11:19:05")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[4].created", containsString("12-12-2014 11:00:39")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[5].created", containsString("10-12-2014 16:59:45")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[6].created", containsString("10-12-2014 16:36:50")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[7].created", containsString("10-12-2014 15:48:00")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[8].created", containsString("10-12-2014 15:08:19")))
                .andExpect(MockMvcResultMatchers.jsonPath("$[9].created", containsString("10-12-2014 14:20:33")));
    }
}
