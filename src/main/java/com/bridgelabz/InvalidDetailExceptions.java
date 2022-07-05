package com.bridgelabz;

public class InvalidDetailExceptions extends Exception {

    ExceptionType type;

    public InvalidDetailExceptions(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }


    enum ExceptionType {
        ENTERED_INVALID, ENTERED_NULL
    }
}

