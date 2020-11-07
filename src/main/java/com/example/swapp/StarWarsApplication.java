package com.example.swapp;

import com.example.swapp.service.SwapiService;
import com.example.swapp.service.dto.mapper.StarshipMapper;
import com.example.swapp.service.impl.SwapiServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StarWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarWarsApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public SwapiService swapiService() {
        return new SwapiServiceImpl();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public StarshipMapper starshipMapper() {
        return new StarshipMapper();
    }

}
