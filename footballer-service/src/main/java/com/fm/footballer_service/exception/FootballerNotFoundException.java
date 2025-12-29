package com.fm.footballer_service.exception;

public class FootballerNotFoundException extends RuntimeException {
    public FootballerNotFoundException(String message) {
        super(message);
    }
}
