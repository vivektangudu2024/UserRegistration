package org.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bridgelabz.exceptions.*;

public class UserRegistration {
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([.+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}([.][a-zA-Z]{2})?$";
    private static final String MOBILE_NUMBER_REGEX = "^\\d{2} \\d{10}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

    public void validateFirstName(String firstName) throws InvalidFirstNameException {
        if (!validateName(firstName)) {
            throw new InvalidFirstNameException("Invalid First Name");
        }
    }

    public void validateLastName(String lastName) throws InvalidLastNameException {
        if (!validateName(lastName)) {
            throw new InvalidLastNameException("Invalid Last Name");
        }
    }

    public void validateEmail(String email) throws InvalidEmailException {
        if (!validateEmailPattern(email)) {
            throw new InvalidEmailException("Invalid Email");
        }
    }

    public void isValidMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
        if (!validateMobileNumberPattern(mobileNumber)) {
            throw new InvalidMobileNumberException("Invalid Mobile Number");
        }
    }

    public void isValidPassword(String password) throws InvalidPasswordException {
        if (!validatePasswordPattern(password)) {
            throw new InvalidPasswordException("Invalid Password");
        }
    }

    private boolean validateName(String name) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    private boolean validateEmailPattern(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean validateMobileNumberPattern(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    private boolean validatePasswordPattern(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
