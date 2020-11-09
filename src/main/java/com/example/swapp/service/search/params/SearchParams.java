package com.example.swapp.service.search.params;

import java.io.Serializable;

public class SearchParams implements Serializable {

    private ParamNameEnum paramNameEnum;
    private SortCriteriaEnum sortCriteriaEnum;

    public SearchParams() {}

    public SearchParams(ParamNameEnum paramNameEnum, SortCriteriaEnum sortCriteriaEnum) {
        this.paramNameEnum = paramNameEnum;
        this.sortCriteriaEnum = sortCriteriaEnum;
    }

    public ParamNameEnum getParamNameEnum() {
        return paramNameEnum;
    }

    public void setParamNameEnum(ParamNameEnum paramNameEnum) {
        this.paramNameEnum = paramNameEnum;
    }

    public SortCriteriaEnum getSortCriteriaEnum() {
        return sortCriteriaEnum;
    }

    public void setSortCriteriaEnum(SortCriteriaEnum sortCriteriaEnum) {
        this.sortCriteriaEnum = sortCriteriaEnum;
    }
}
