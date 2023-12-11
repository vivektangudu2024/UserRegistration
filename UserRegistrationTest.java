package com.day11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidFirstName() {
        assertTrue(userRegistration.validateFirstName("John"));
    }

    @Test
    void testInvalidShortFirstName() {
        assertFalse(userRegistration.validateFirstName("Jo"));
    }

    @Test
    void testInvalidLowerCaseFirstName() {
        assertFalse(userRegistration.validateFirstName("john"));
    }

    @Test
    void testInvalidNumericFirstName() {
        assertFalse(userRegistration.validateFirstName("John123"));
    }
}