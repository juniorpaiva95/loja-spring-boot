package com.digivox.desafio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardErrorException> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardErrorException err = new StandardErrorException(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardErrorException> databaseExcept (DatabaseException e, HttpServletRequest request) {
        String error = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardErrorException err = new StandardErrorException(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<UnprocessableEntityException> databaseExcept (MethodArgumentNotValidException e, HttpServletRequest request) {
        String error = "Unprocessable Entity";
        HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
        UnprocessableEntityException err = new UnprocessableEntityException(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI(), e.getBindingResult());

        return ResponseEntity.status(status).body(err);
    }
}
