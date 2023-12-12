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

}