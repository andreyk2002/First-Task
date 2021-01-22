
package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import com.epam.task.first.exceptions.ArrayIsEmptyException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLogicTest {

    private final ArrayLogic logic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindWhenMultipleNumbersApplied() throws ArrayIsEmptyException {
        Array<Integer> array = new Array<>(1, 4, 5, 2);
        int actual = logic.findMax(array);
        Assert.assertEquals(actual, 5);
    }

    @Test(expectedExceptions = ArrayIsEmptyException.class)
    public void testFindMaxShouldThrowAnExceptionWhenArrayIsEmpty() throws ArrayIsEmptyException {
        Array<Integer> array = new Array<>();
        logic.findMax(array);
    }

    @Test
    public void testCountAverageShouldCountWhenMultipleNumberApplied() throws ArrayIsEmptyException {
        Array<Integer> array = new Array<>(1, 2, 3, 4);
        double actual = logic.countAverage(array);
        Assert.assertEquals(actual, 2.5);
    }

    @Test(expectedExceptions = ArrayIsEmptyException.class)
    public void testCountAverageShouldThrowAnExceptionWhenArrayIsEmpty() throws ArrayIsEmptyException {
        Array<Integer> array = new Array<>();
        double actual = logic.countAverage(array);
    }

    @Test
    public void testCountSumShouldCountWhenMultipleNumbersApplied() {
        Array<Integer> array = new Array<>(1, -5, 6);
        long actual = logic.countSum(array);
        Assert.assertEquals(actual, 2);
    }

    @Test
    public void testCountSumShouldWhenArrayIsEmpty() {
        Array<Integer> array = new Array<>();
        long actual = logic.countSum(array);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testSumPositiveWhenMultiplePositiveNumberApplied() {
        Array<Integer> array = new Array<>(1, 2, 3, -1, 1);
        long actual = logic.sumNegative(array);
        Assert.assertEquals(actual, 4);
    }

    @Test
    public void testSumPositiveWhenArrayIsEmpty() {
        Array<Integer> array = new Array<>();
        long actual = logic.sumNegative(array);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testSumNegativeWhenMultipleNegativeNumbersApplied() {
        Array<Integer> array = new Array<>(-10, 0, -2020, -1937);
        int actual = logic.sumPositive(array);
        Assert.assertEquals(actual, 3);
    }

    @Test
    public void testSumNegativeWhenArrayIsEmpty() {
        Array<Integer> array = new Array<>();
        long actual = logic.sumNegative(array);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testReplaceEvenNumbersWhenItIsNothingToReplace() {
        Array<Integer> array = new Array<>(1, 3, 7);
        logic.replaceEvenNumbers(array, 100);
        List<Integer> actual = array.getElements();
        List<Integer> expected = Arrays.asList(1, 3, 7);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReplaceEvenNumbersWhenMultiplePrimesApplied() {
        Array<Integer> array = new Array<>(2, 2, 2, 5);
        logic.replaceEvenNumbers(array, 100);
        List<Integer> actual = array.getElements();
        List<Integer> expected = Arrays.asList(100, 100, 100, 5);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReplaceEvenNumbersWhenArrayIsEmpty() {
        Array<Integer> array = new Array<>();
        logic.replaceEvenNumbers(array, 100);
        List<Integer> actual = array.getElements();
        List<Integer> expected = Collections.emptyList();
        Assert.assertEquals(actual, expected);
    }
}
