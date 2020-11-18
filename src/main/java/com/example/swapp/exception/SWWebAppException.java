package com.example.swapp.exception;

/**
 * Exception used to manage all input validation errors managed by {@link com.example.swapp.validator.SWWebAppValidator}
 */
public class SWWebAppException extends Exception {
    private String code;

    public SWWebAppException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
