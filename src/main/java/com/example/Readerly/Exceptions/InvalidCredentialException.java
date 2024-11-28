package com.example.Readerly.Exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException(String s) {
        super(s);
    }
}
