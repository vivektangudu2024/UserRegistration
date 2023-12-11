package com.day11;

import java.util.*;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter the email: ");
        String email = scanner.nextLine();

        if (userRegistration.validateFirstName(firstName)
                && userRegistration.validateLastName(lastName)
                && userRegistration.validateEmail(email)) {
            System.out.println("Valid first name, last name, and email!");
        } else {
            System.out.println("Invalid first name, last name, or email!");
        }

        scanner.close();
    }
}
