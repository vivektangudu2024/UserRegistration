package org.bridgelabz;



import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testValidMobileNumber() {
        String validNumber = "91 9919819801";
        assertTrue(userRegistration.isValidMobileNumber(validNumber));
    }

    @Test
    public void testInvalidMobileNumberNoSpace() {
        String invalidNumber = "919919819801";
        assertFalse(userRegistration.isValidMobileNumber(invalidNumber));
    }

    @Test
    public void testInvalidMobileNumberShortNumber() {
        String invalidNumber = "91 12345";
        assertFalse(userRegistration.isValidMobileNumber(invalidNumber));
    }

    @Test
    public void testInvalidMobileNumberLongNumber() {
        String invalidNumber = "91 123456789012345";
        assertFalse(userRegistration.isValidMobileNumber(invalidNumber));
    }

    @Test
    public void testInvalidMobileNumberNonNumeric() {
        String invalidNumber = "91 abcdefghij";
        assertFalse(userRegistration.isValidMobileNumber(invalidNumber));
    }
    @Test
    public void testValidPassword() {
        String validPassword = "AbcdEfgh";
        assertTrue(userRegistration.isValidPassword(validPassword));
    }

    @Test
    public void testInvalidPasswordShort() {
        String invalidPassword = "AbcdEfg";
        assertFalse(userRegistration.isValidPassword(invalidPassword));
    }

    @Test
    public void testInvalidPasswordNoUpperCase() {
        String invalidPassword = "abcdefgh";
        assertFalse(userRegistration.isValidPassword(invalidPassword));
    }

    @Test
    public void testValidEmail1() {
        String validEmail = "abc.xyz@bl.co.in";
        assertTrue(userRegistration.validateEmail(validEmail));
    }

    @Test
    public void testValidEmail2() {
        String validEmail = "john.doe@example.com";
        assertTrue(userRegistration.validateEmail(validEmail));
    }

    @Test
    public void testValidEmail3() {
        String validEmail = "user123@email.co";
        assertTrue(userRegistration.validateEmail(validEmail));
    }

    @Test
    public void testInvalidEmail1() {
        String invalidEmail = "invalid-email";
        assertFalse(userRegistration.validateEmail(invalidEmail));
    }

    @Test
    public void testInvalidEmail2() {
        String invalidEmail = "user@.com";
        assertFalse(userRegistration.validateEmail(invalidEmail));
    }

    @Test
    public void testInvalidEmail3() {
        String invalidEmail = "user123@com";
        assertFalse(userRegistration.validateEmail(invalidEmail));
    }


}