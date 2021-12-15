package de.mameie.backend.rest.exception;

public class ComponentNotFoundException extends RuntimeException{
    public ComponentNotFoundException(String message) {
        super(message);
    }
}
