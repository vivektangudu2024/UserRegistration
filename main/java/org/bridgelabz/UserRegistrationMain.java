package org.bridgelabz;

import java.util.*;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        // Example usage for validating passwords
        String password1 = "AbcdEfgh";
        String password2 = "abcdefgh";
        String password3 = "AbcdEfg";

        if (userRegistration.isValidPassword(password1)) {
            System.out.println("Password1 is valid!");
        } else {
            System.out.println("Password1 is invalid!");
        }

        if (userRegistration.isValidPassword(password2)) {
            System.out.println("Password2 is valid!");
        } else {
            System.out.println("Password2 is invalid!");
        }

        if (userRegistration.isValidPassword(password3)) {
            System.out.println("Password3 is valid!");
        } else {
            System.out.println("Password3 is invalid!");
        }
    }
}
