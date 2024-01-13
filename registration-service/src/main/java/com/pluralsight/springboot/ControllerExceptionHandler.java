package com.pluralsight.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(NoSuchElementException.class)
    public ErrorResponse notFound(NoSuchElementException noSuchElementException){
        return  ErrorResponse.create(noSuchElementException, HttpStatus.NOT_FOUND, noSuchElementException.getMessage());
    }
}
