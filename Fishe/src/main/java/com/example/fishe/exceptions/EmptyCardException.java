package com.example.fishe.exceptions;

public class EmptyCardException extends RuntimeException{


    public EmptyCardException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Empty Question or Answer";
    }
}
