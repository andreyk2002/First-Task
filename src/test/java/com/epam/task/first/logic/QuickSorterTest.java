package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.testng.annotations.Test;

public class QuickSorterTest {
    private final Sorter sorter = new QuickSorter();

    @Test
    public void testSortShouldSortWhenOneElementArrayApplied() {
        Array<Integer> array = new Array<>(1);
        Array<Integer> actual = sorter.sort(array);
        Array<Integer> expected = new Array<>(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSortShouldSortWhenMultiElementArrayApplied() {
        Array<Integer> array = new Array<>(5, 6, 6, 3, 2, -1, 1);
        Array<Integer> actual = sorter.sort(array);
        Array<Integer> expected = new Array<>(-1, 1, 2, 3, 5, 6, 6);
        Assert.assertEquals(actual, expected);
    }
}
