package com.example.swapp.swapi.response;

import com.example.swapp.object.People;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class PeopleApiResponse extends ApiResponse implements Serializable {

    @JsonProperty("results")
    private List<People> results;

    public List<People> getResults() {
        return results;
    }

    public void setResults(List<People> results) {
        this.results = results;
    }
}
