package com.day11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidEmail() {
        assertTrue(userRegistration.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    void testInvalidEmailNoAtSymbol() {
        assertFalse(userRegistration.validateEmail("abc.xyzbl.co.in"));
    }

    @Test
    void testInvalidEmailNoDotAfterAtSymbol() {
        assertFalse(userRegistration.validateEmail("abc.xyz@blcoin"));
    }

    @Test
    void testInvalidEmailNoDomain() {
        assertFalse(userRegistration.validateEmail("abc.xyz@.in"));
    }

    @Test
    void testInvalidEmailNoTopLevelDomain() {
        assertFalse(userRegistration.validateEmail("abc.xyz@bl.co"));
    }
}