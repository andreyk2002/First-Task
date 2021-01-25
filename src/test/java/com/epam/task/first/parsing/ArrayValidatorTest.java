package com.epam.task.first.parsing;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    private final ArrayValidator validator = new ArrayValidator();

    @Test
    public void testValidateShouldNotValidateWhenStringIsEmpty() {
        String empty = "";
        boolean actual = validator.validate(empty);
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldValidateWhenOneElementStringApplied() {
        String oneElementArray = "1";
        boolean actual = validator.validate(oneElementArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void testValidatorShouldValidateWhenCorrectArrayApplied() {
        String correctArray = "1 2 3 4 5 6";
        boolean actual = validator.validate(correctArray);
        Assert.assertTrue(actual);
    }

    @Test
    public void testValidateShouldNotValidateWhenIncorrectArrayApplied() {
        String incorrect = "1 2g 3";
        boolean actual = validator.validate(incorrect);
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldNotValidateWhenDelimitersAreWrong() {
        String wrongDelimitersString = "1  2 3    5 ";
        boolean actual = validator.validate(wrongDelimitersString);
        Assert.assertFalse(actual);
    }
}
