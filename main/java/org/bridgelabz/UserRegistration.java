package org.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([.+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}([.][a-zA-Z]{2})?$";
    /*
     * @desc:checks whether the first name is valid or not
     * @params:string
     * @return:none
     */
    public boolean validateFirstName(String firstName) {
        return validateName(firstName);
    }
    /*
     * @desc:checks whether the last name is valid or not
     * @params:string
     * @return:none
     */
    public boolean validateLastName(String lastName) {
        return validateName(lastName);
    }
    /*
     * @desc:checks whether the name is valid or not
     * @params:string
     * @return:none
     */
    private boolean validateName(String name) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    /*
     * @desc:Validates the entered email based on specified criteria.
     * @param: email The email to be validated.
     * @return: true if the email is valid, false otherwise.
     */
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /*
     * @desc:Validates the entered phone number based on specified criteria.
     * @param THE phone number to be validated.
     * @return true if the email is valid, false otherwise.
     */
    public boolean isValidMobileNumber(String mobileNumber) {
        // Define the regex pattern for the mobile number format
        String regex = "^\\d{2} \\d{10}$";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(mobileNumber);

        // Check if the input matches the pattern
        return matcher.matches();
    }
}