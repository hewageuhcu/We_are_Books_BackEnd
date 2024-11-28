package com.example.WeAreBooks.Exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException(String s) {
        super(s);
    }
}
