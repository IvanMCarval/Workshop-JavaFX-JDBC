package com.example.javafx.model.exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ValidationException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private Map<String, String> errors = new HashMap<>();

    public ValidationException(String msg) {
        super(msg);
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String errorMessage) {
        errors.put(fieldName, errorMessage);
    }
}
