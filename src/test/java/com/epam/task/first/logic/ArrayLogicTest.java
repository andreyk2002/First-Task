
package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayLogicTest {

    private final ArrayLogic logic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindWhenSingleNumberApplied(){
        Array<Integer> a = new Array<>(0);
        int actual = logic.findMax(a);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testFindMaxShouldFindWhenMultipleNumbersApplied(){
        Array<Integer> a = new Array<>(1, 4, 5, 2);
        int actual = logic.findMax(a);
        Assert.assertEquals(actual,5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFindMaxShouldThrowAnExceptionWhenArrayIsEmpty(){
        Array<Integer> a = new Array<>();
        logic.findMax(a);
    }

    @Test
    public void testCountAverageShouldCountWhenSingleNumberApplied(){
        Array<Integer> a = new Array<>(1);
        double actual = logic.countAverage(a);
        Assert.assertEquals(actual,1.0);
    }

    @Test
    public void testCountAverageShouldCountWhenMultipleNumberApplied(){
        Array<Integer> a = new Array<>(1,2,3,4);
        double actual = logic.countAverage(a);
        Assert.assertEquals(actual,2.5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCountAverageShouldThrowAnExceptionWhenArrayIsEmpty(){
        Array<Integer> a = new Array<>();
        logic.countAverage(a);
    }

    @Test
    public void testCountSumShouldCountWhenSingleNumberApplied(){
        Array<Integer> a = new Array<>(1);
        long actual = logic.countSum(a);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void testCountSumShouldCountWhenMultipleNumbersApplied(){
        Array<Integer> a = new Array<>(1, -5, 6);
        long actual = logic.countSum(a);
        Assert.assertEquals(actual,2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCountSumShouldWhenArrayIsEmpty(){
        Array<Integer>a = new Array<Integer>();
        logic.countSum(a);
    }

    @Test
    public void testCountNumberOfPositivesWhenOnePositiveNumberApplied(){
        Array<Integer> a = new Array<>(1);
        long actual = logic.countNumberOfPositives(a);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void testCountNumberOfPositivesWhenMultiplePositiveNumberApplied(){
        Array<Integer> a = new Array<>(1,2,3,-1,1);
        long actual = logic.countNumberOfPositives(a);
        Assert.assertEquals(actual,4);
    }

    @Test
    public void testCountNumberOfPositivesWhenArrayIsEmpty(){
        Array<Integer> a = new Array<>();
        long actual = logic.countNumberOfPositives(a);
        Assert.assertEquals(actual,0);
    }

    @Test
    public void testCountNumberOfNegativesWhenOneNegativeNumberApplied(){
        Array<Integer> a = new Array<>(-1);
        int actual = logic.countNumberOfNegatives(a);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void testCountNumberOfNegativesWhenMultipleNegativeNumbersApplied(){
        Array<Integer>a = new Array<>(-10, 0, -2020,-1937);
        int actual = logic.countNumberOfNegatives(a);
        Assert.assertEquals(actual, 3);
    }

    @Test
    public void testCountNumberOfNegativesWhenArrayIsEmpty(){
        Array<Integer> a = new Array<>();
        long actual = logic.countNumberOfPositives(a);
        Assert.assertEquals(actual,0);
    }

    @Test
    public void testReplaceEvenNumbersWhenItIsNothingToReplace(){
        Array<Integer> a = new Array<>(1,3,7);
        logic.replaceEvenNumbers(a,100);
        List<Integer>actual = a.getElements();
        List<Integer>expected = Arrays.asList(1,3,7);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReplaceEvenNumbersWhenMultiplePrimesApplied(){
        Array<Integer> a = new Array<>(2,2,2,5);
        logic.replaceEvenNumbers(a, 100);
        List<Integer>actual = a.getElements();
        List<Integer>expected = Arrays.asList(100,100,100,5);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReplaceEvenNumbersWhenArrayIsEmpty(){
        Array<Integer> a = new Array<>();
        logic.replaceEvenNumbers(a, 100);
        List<Integer>actual = a.getElements();
        List<Integer>expected = Arrays.asList();
        Assert.assertEquals(actual, expected);
    }

}
