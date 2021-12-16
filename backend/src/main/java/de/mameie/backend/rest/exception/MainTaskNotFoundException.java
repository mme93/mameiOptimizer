package de.mameie.backend.rest.exception;

public class MainTaskNotFoundException extends RuntimeException{
    public MainTaskNotFoundException(String message) {
        super(message);
    }
}
