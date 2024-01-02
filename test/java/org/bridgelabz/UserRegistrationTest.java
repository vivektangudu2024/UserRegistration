package org.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.bridgelabz.exceptions.*;

class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    // Happy Test Cases

    @Test
    void testValidFirstName() {
        Assertions.assertDoesNotThrow(() -> userRegistration.validateFirstName("John"));
    }

    @Test
    void testValidLastName() {
        Assertions.assertDoesNotThrow(() -> userRegistration.validateLastName("Doe"));
    }

    @Test
    void testValidEmail() {
        Assertions.assertDoesNotThrow(() -> userRegistration.validateEmail("john.doe@example.com"));
    }

    @Test
    void testValidMobileNumber() {
        Assertions.assertDoesNotThrow(() -> userRegistration.isValidMobileNumber("91 9919819801"));
    }

    @Test
    void testValidPassword() {
        Assertions.assertDoesNotThrow(() -> userRegistration.isValidPassword("Abcd@123"));
    }

    // Sad Test Cases

    @Test
    void testInvalidFirstName() {
        InvalidFirstNameException exception = Assertions.assertThrows(InvalidFirstNameException.class,
                () -> userRegistration.validateFirstName("jo"));
        Assertions.assertEquals("Invalid First Name", exception.getMessage());
    }

    @Test
    void testInvalidLastName() {
        InvalidLastNameException exception = Assertions.assertThrows(InvalidLastNameException.class,
                () -> userRegistration.validateLastName("d"));
        Assertions.assertEquals("Invalid Last Name", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        InvalidEmailException exception = Assertions.assertThrows(InvalidEmailException.class,
                () -> userRegistration.validateEmail("invalid-email"));
        Assertions.assertEquals("Invalid Email", exception.getMessage());
    }

    @Test
    void testInvalidMobileNumber() {
        InvalidMobileNumberException exception = Assertions.assertThrows(InvalidMobileNumberException.class,
                () -> userRegistration.isValidMobileNumber("12345"));
        Assertions.assertEquals("Invalid Mobile Number", exception.getMessage());
    }

    @Test
    void testInvalidPassword() {
        InvalidPasswordException exception = Assertions.assertThrows(InvalidPasswordException.class,
                () -> userRegistration.isValidPassword("invalidpassword"));
        Assertions.assertEquals("Invalid Password", exception.getMessage());
    }

    // Parameterized Tests

    @ParameterizedTest
    @ValueSource(strings = {"abcd.xyz@bl.co.in", "test.email@gmail.com", "user@domain.com"})
    void testValidEmailAddresses(String email) {
        Assertions.assertDoesNotThrow(() -> userRegistration.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid.email@com", "user@domain", "another.email"})
    void testInvalidEmailAddresses(String email) {
        InvalidEmailException exception = Assertions.assertThrows(InvalidEmailException.class,
                () -> userRegistration.validateEmail(email));
        Assertions.assertEquals("Invalid Email", exception.getMessage());
    }
}
