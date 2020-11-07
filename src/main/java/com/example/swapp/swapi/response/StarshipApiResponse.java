package com.example.swapp.swapi.response;

import com.example.swapp.Starship;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class StarshipApiResponse extends ApiResponse implements Serializable {

    @JsonProperty("results")
    private List<Starship> results;

    public List<Starship> getResults() {
        return results;
    }

    public void setResults(List<Starship> results) {
        this.results = results;
    }
}
