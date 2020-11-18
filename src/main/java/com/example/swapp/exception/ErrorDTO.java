package com.example.swapp.exception;

/**
 * DTO managed by {@link com.example.swapp.builder.SWWebAppBuilder} to provide feedback in case
 * a validation error happens and  a {@link SWWebAppException} is thrown and catched
 * by {@link SWWebAppExceptionHandler}
 */
public class ErrorDTO {

    private String message;

    public ErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
