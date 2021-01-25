package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.testng.annotations.Test;

public class MergeSorterTest {
    private final Sorter sorter = new MergeSorter();

    @Test
    public void testSortShouldSortWhenOneElementArrayApplied() {
        Array<Integer> array = new Array<>(1);
        Array<Integer> actual = sorter.sort(array);
        Array<Integer> expected = new Array<>(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSortShouldSortWhenMultiElementArrayApplied() {
        Array<Integer> array = new Array<>(666, 2, -44, 6, -2, 0);
        Array<Integer> actual = sorter.sort(array);
        Array<Integer> expected = new Array<>(-44, -2, 0, 2, 6, 666);
        Assert.assertEquals(actual, expected);
    }


}
