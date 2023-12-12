package org.bridgelabz;

import java.util.*;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        // Valid emails
        String validEmail1 = "abc.xyz@bl.co.in";
        String validEmail2 = "john.doe@example.com";
        String validEmail3 = "user123@email.co";

        // Invalid emails
        String invalidEmail1 = "invalid-email";
        String invalidEmail2 = "user@.com";
        String invalidEmail3 = "user123@com";

        // Test cases
        System.out.println("Is Valid Email 1: " + userRegistration.validateEmail(validEmail1));
        System.out.println("Is Valid Email 2: " + userRegistration.validateEmail(validEmail2));
        System.out.println("Is Valid Email 3: " + userRegistration.validateEmail(validEmail3));

        System.out.println("Is Invalid Email 1: " + userRegistration.validateEmail(invalidEmail1));
        System.out.println("Is Invalid Email 2: " + userRegistration.validateEmail(invalidEmail2));
        System.out.println("Is Invalid Email 3: " + userRegistration.validateEmail(invalidEmail3));
    }
}
