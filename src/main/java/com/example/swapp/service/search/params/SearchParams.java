package com.example.swapp.service.search.params;

import java.io.Serializable;

/**
 *
 */
public class SearchParams implements Serializable {


    private String paramName;
    private String order;

    public SearchParams() {}

    public SearchParams(String paramName, String order) {
        this.paramName = paramName;
        this.order = order;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
