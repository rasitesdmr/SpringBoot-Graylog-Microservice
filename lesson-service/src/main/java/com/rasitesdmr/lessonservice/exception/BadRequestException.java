package com.rasitesdmr.lessonservice.exception;


public class BadRequestException extends RuntimeException{

    public BadRequestException(String message) {
        super(message);
    }
}
