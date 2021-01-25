package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.testng.annotations.Test;

public class SelectionSortTest {
    private final Sorter sorter = new SelectionSorter();

    @Test
    public void testSortShouldSortWhenOneElementArrayApplied() {
        Array<Integer> array = new Array<>(1);
        Array<Integer> actual = sorter.sort(array);
        Array<Integer> expected = new Array<>(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSortShouldSortWhenMultiElementArrayApplied() {
        Array<Integer> array = new Array<>(666, 2, -5, 19, 0, 4, 2);
        Array<Integer> actual = sorter.sort(array);
        Array<Integer> expected = new Array<>(-5, 0, 2, 2, 4, 19, 666);
        Assert.assertEquals(actual, expected);
    }

}
