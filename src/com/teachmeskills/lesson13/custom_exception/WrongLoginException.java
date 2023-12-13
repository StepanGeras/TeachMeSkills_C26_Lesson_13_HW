package com.teachmeskills.lesson13.custom_exception;

public class WrongLoginException extends Exception {

    private int validationExceptionCode;

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(int validationExceptionCode, String login) {
        super(login);
    }

}
