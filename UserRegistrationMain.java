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

        if (userRegistration.validateFirstName(firstName) && userRegistration.validateLastName(lastName)) {
            System.out.println("Valid first and last names!");
        } else {
            System.out.println("Invalid first or last name!");
        }

        scanner.close();
    }
}
