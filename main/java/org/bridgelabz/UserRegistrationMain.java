package org.bridgelabz;

import java.util.*;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        String userInput = "91 9919819801"; // Replace this with the user's input

        if (userRegistration.isValidMobileNumber(userInput)) {
            System.out.println("Valid mobile number!");
        } else {
            System.out.println("Invalid mobile number!");
        }
    }
}
