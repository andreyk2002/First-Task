
package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayLogicTest {

    private final ArrayLogic logic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindWhenMultipleNumbersApplied() {
        Array<Integer> array = new Array<>(1, 4, 5, 2);
        int actual = logic.findMax(array);
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void testCountAverageShouldCountWhenMultipleNumberApplied()  {
        Array<Integer> array = new Array<>(2, 3, 3, 4);
        double actual = logic.countAverage(array);
        Assert.assertEquals(actual, 3);
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
    public void testReplaceEvenNumbersWhenItIsNothingToReplace() {
        Array<Integer> array = new Array<>(1, 3, 7);
        Array<Integer> actual = logic.replaceEvenNumbers(array, 100);
        Assert.assertEquals(actual, array);
    }

    @Test
    public void testReplaceEvenNumbersWhenMultipleEvenApplied() {
        Array<Integer> array = new Array<>(2, 2, 7);
        Array<Integer> actual = logic.replaceEvenNumbers(array, 1);
        Array<Integer>expected = new Array<>(1,1,7);
        Assert.assertEquals(actual, expected);
    }

}
