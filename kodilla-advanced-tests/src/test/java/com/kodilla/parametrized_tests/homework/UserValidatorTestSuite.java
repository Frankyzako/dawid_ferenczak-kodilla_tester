package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(validator.validateUsername(text));
    }


    @ParameterizedTest
    @ValueSource(strings = {"<",">","","/","?","",", ","|", "'", "[", "]", "{", "}", "+", "=", ")","(", ";", ":", "!", "@", "#", "$", "%", "^", "&", "*"})
    public void shouldReturnFalseIfStringHasOneOfThisSing(String text) {
        assertFalse(validator.validateUsername(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfStringIsNotEmptyForEmail(String text){
        assertFalse(validator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"<",">","","/",",","?", "|", "'", "[", "]", "{", "}", "+", "=", ")","(", ";", ":", "!", "#", "%", "^", "&"})
    public void shouldReturnFalseIfStringHasOneOfThisSingInEmail(String text) {
        assertFalse(validator.validateEmail(text));
    }

}