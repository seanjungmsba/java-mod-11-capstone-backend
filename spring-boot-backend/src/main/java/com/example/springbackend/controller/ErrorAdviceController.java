package com.example.springbackend.controller;

import com.example.springbackend.dto.ErrorDTO;
import com.example.springbackend.dto.ErrorsDTO;
import com.example.springbackend.exception.NotFoundException;
import com.example.springbackend.exception.ValidationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

@ControllerAdvice
public class ErrorAdviceController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handle(Exception ex,
                                         HttpServletRequest request, HttpServletResponse response) {
        if (ex instanceof NullPointerException) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @ExceptionHandler(value = {NotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(
            RuntimeException ex, WebRequest request) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setError(ex.getMessage());
        return handleExceptionInternal(ex, errorDTO,
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(value = {ValidationException.class})
    protected ResponseEntity<Object> handleInvalidException(
            RuntimeException ex, WebRequest request) {
        ErrorsDTO errorsDTO = new ErrorsDTO();
        errorsDTO.setErrors(Set.of("validation errors"));
        ex.printStackTrace();
        return handleExceptionInternal(ex, errorsDTO,
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ErrorsDTO errorsDTO = new ErrorsDTO();
        ex.printStackTrace();
        errorsDTO.setErrors(Set.of("validation errors"));
        return handleExceptionInternal(ex, errorsDTO,
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

}