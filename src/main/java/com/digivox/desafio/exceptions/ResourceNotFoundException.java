package com.digivox.desafio.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
