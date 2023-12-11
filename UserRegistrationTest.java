package com.day11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidLastName() {
        assertTrue(userRegistration.validateLastName("Doe"));
    }

    @Test
    void testInvalidShortLastName() {
        assertFalse(userRegistration.validateLastName("De"));
    }

    @Test
    void testInvalidLowerCaseLastName() {
        assertFalse(userRegistration.validateLastName("doe"));
    }

    @Test
    void testInvalidNumericLastName() {
        assertFalse(userRegistration.validateLastName("Doe123"));
    }
}