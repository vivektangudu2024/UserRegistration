package com.day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
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
}