package com.example.swapp.exception;

import com.example.swapp.builder.SWWebAppBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SWWebAppExceptionHandler extends ResponseEntityExceptionHandler {

    private SWWebAppBuilder swWebAppBuilder;

    @Autowired
    public SWWebAppExceptionHandler(SWWebAppBuilder swWebAppBuilder) {
        this.swWebAppBuilder = swWebAppBuilder;
    }

    @ExceptionHandler(SWWebAppException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorDTO> handleException(SWWebAppException swwebAppException){
        return swWebAppBuilder.buildErrorDto(swwebAppException.getMessage());
    }
}
