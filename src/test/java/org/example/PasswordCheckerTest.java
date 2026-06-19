package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void shouldReturnFalseWhenProvidedAnEmptyPasswordTest() {

        // Arrange
        PasswordChecker checker = new PasswordChecker();

        // Act
        boolean result = checker.validatePassword("");

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenPasswordIsEightCharactersLettersOneCapitalAndNumbersTest(){

        //Arrange:
        PasswordChecker checker = new PasswordChecker();

        //Act
        boolean result = checker.validatePassword("Passw123");

        //Assert:
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenPasswordCorrectFormatTest(){

        //Arrange:
        PasswordChecker checker = new PasswordChecker();

        //Act:
        boolean result = checker.validatePassword("Password123");

        //Assert:
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenPasswordIsTooLongTest(){

        //Arrange:
        PasswordChecker checker = new PasswordChecker();

        //Act:
        boolean result = checker.validatePassword("PasswordIsTooLongForThisExercise1");

        //Assert:
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenPasswordHasNoNumberTest(){

        //Arrange:
        PasswordChecker checker = new PasswordChecker();

        //Act:
        boolean result = checker.validatePassword("PasswordP");

        //Assert:
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenPasswordHasJustNumbersNoLettersTest(){

        //Arrange:
        PasswordChecker checker = new PasswordChecker();

        //Act:
        boolean result = checker.validatePassword("12345678");

        //Assert:
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseIfPasswordAbove16CharactersTest(){

        //Arrange:
        PasswordChecker checker = new PasswordChecker();

        //Act:
        boolean result = checker.validatePassword("thispasswordBad12");

        //Assert:
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseIfPasswordIsTooShortTest(){

        //Arrange:
        PasswordChecker checker = new PasswordChecker();

        //Act:
        boolean result = checker.validatePassword("Pass123");

        //Assert:
        assertFalse(result);
    }

}