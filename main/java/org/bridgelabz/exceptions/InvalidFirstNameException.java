package org.bridgelabz.exceptions;

public class InvalidFirstNameException extends Exception {
    public InvalidFirstNameException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "InvalidFirstNameException: " + getMessage();
    }
}
