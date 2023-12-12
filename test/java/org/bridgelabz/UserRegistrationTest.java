package org.bridgelabz;



import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    // Happy Test Cases

    @Test
    public void testValidFirstName() {
        assertTrue(userRegistration.validateFirstName("John"));
    }

    @Test
    public void testValidLastName() {
        assertTrue(userRegistration.validateLastName("Doe"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(userRegistration.validateEmail("john.doe@example.com"));
    }

    @Test
    public void testValidMobileNumber() {
        assertTrue(userRegistration.isValidMobileNumber("91 9919819801"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(userRegistration.isValidPassword("Abcd@123"));
    }

    // Sad Test Cases

    @Test
    public void testInvalidFirstName() {
        assertFalse(userRegistration.validateFirstName("jo"));
    }

    @Test
    public void testInvalidLastName() {
        assertFalse(userRegistration.validateLastName("d"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(userRegistration.validateEmail("invalid-email"));
    }

    @Test
    public void testInvalidMobileNumber() {
        assertFalse(userRegistration.isValidMobileNumber("12345"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(userRegistration.isValidPassword("invalidpassword"));
    }
    @ParameterizedTest
    @ValueSource(strings = { "abcd.xyz@bl.co.in", "test.email@gmail.com", "user@domain.com" })
    void testValidEmailAddresses(String email) {
        assertTrue(user.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = { "invalid.email@com", "user@domain", "another.email" })
    void testInvalidEmailAddresses(String email) {
        assertFalse(user.isValidEmail(email));
    }

}