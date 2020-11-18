package com.example.swapp.validator;

import com.example.swapp.exception.SWWebAppException;
import com.example.swapp.service.search.params.ParamNameEnum;
import com.example.swapp.service.search.params.SearchParams;
import com.example.swapp.service.search.params.OrderEnum;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * Validator used to manage all potential input errors.
 */
@Component
public class SWWebAppValidator {

    public boolean validateSearchParams(SearchParams searchParams) throws SWWebAppException {

        validateParamName(searchParams.getParamName());
        validateOrder(searchParams.getOrder());

        return true;
    }

    private boolean validateParamName(String paramName) throws SWWebAppException {

        if (paramName != null && !EnumUtils.isValidEnum(ParamNameEnum.class, paramName)) {
            throw new SWWebAppException(HttpStatus.BAD_REQUEST.toString(), "paramName.value.not.valid");
        }

        return true;
    }

    private boolean validateOrder(String order) throws SWWebAppException {

        if (order != null && !EnumUtils.isValidEnum(OrderEnum.class, order)) {
            throw new SWWebAppException(HttpStatus.BAD_REQUEST.toString(), "order.value.not.valid");
        }

        return true;
    }
}
