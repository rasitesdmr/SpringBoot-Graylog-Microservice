package com.rasitesdmr.studentservice.exception;

public class AlreadyAvailableException extends RuntimeException{
    public AlreadyAvailableException(String message) {
        super(message);
    }
}
