package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void shouldReturnFalseWhenProvidedAnEmptyPassword() {
        // arrange
        PasswordChecker checker = new PasswordChecker();

        // act
        boolean result = checker.validatePassword("");

        // assert
        assertFalse(result);
    }

    @Test
    void CheckPassword8Characters(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.validatePassword("Passw123");
        assertTrue(result);
    }

    @Test
    void shouldReturnCorrectWhenPasswordCorrectFormat(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.validatePassword("Password123");
        assertTrue(result);
    }

    @Test
    void passwordTooLong(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.validatePassword("PasswordIsTooLongForThisExercise1");
        assertFalse(result);
    }

    @Test
    void passwordHasNoNumber(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.validatePassword("PasswordP");
        assertFalse(result);
    }

    @Test
    void justNumbersNoLetters(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.validatePassword("12345678");
        assertFalse(result);
    }

    @Test
    void passwordAbove16Characters(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.validatePassword("jksdhuegabhsdbfe12");
        assertFalse(result);
    }

    @Test
    void passwordTooShort(){
        PasswordChecker checker = new PasswordChecker();
        boolean result = checker.validatePassword("Pass123");
        assertFalse(result);
    }

}