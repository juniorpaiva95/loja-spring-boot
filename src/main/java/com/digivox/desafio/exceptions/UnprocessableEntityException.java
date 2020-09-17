package com.digivox.desafio.exceptions;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.time.Instant;
import java.util.List;

public class UnprocessableEntityException extends StandardErrorException{

    private static final long serialVersionUID = 1L;

    private List<FieldError> errors;

    public UnprocessableEntityException(Instant timestamp, Integer status, String error, String message, String path, BindingResult bindingErrors) {
        super(timestamp, status, error, message, path);
        this.errors.addAll(bindingErrors.getFieldErrors());
        this.errors = errors;
    }
}
