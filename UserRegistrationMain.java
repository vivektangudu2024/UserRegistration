package com.day11;

import java.util.*;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();

        if (userRegistration.validateFirstName(firstName)) {
            System.out.println("Valid first name!");
        } else {
            System.out.println("Invalid first name!");
        }

        scanner.close();
}
