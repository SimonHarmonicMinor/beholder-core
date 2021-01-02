package com.kirekov.beholder.core.exception;

public class BeholderProcessException extends RuntimeException {
    public BeholderProcessException(String message, Exception cause) {
        super(message, cause);
    }
}
