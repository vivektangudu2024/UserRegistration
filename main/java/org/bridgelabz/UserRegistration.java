package org.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([.+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}([.][a-zA-Z]{2})?$";
    private static final String MOBILE_NUMBER_REGEX = "^\\d{2} \\d{10}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

    /*
     * @desc:checks whether the first name is valid or not
     * @params:string
     * @return:true if the first name is valid, false otherwise.
     */
    public boolean validateFirstName(String firstName) {
        return validateName(firstName);
    }

    /*
     * @desc:checks whether the last name is valid or not
     * @params:string
     * @return:true if the last name is valid, false otherwise.
     */
    public boolean validateLastName(String lastName) {
        return validateName(lastName);
    }

    /*
     * @desc:checks whether the name is valid or not
     * @params:string
     * @return:true if the name is valid, false otherwise.
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
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    /*
     * @desc:Validates the entered password based on specified criteria.
     * Rule1 – minimum 8 Characters, Rule2 – Should have at least 1 Upper Case, Rule 3, Rule 4
     * @param: password The password to be validated.
     * @return: true if the password is valid, false otherwise.
     */
    public boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
