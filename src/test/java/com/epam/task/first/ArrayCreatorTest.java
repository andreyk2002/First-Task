package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA = Arrays.asList("1 7 9 0", "3 2 4");
    private final static List<String> EMPTY_DATA = Collections.emptyList();
    private final static String FILE_PATH = "";

    @Test
    public void testCreateShouldReturnEmptyListWhenItIsNothingToCreate() throws DataException {
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(EMPTY_DATA);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(false);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.parse(anyString())).thenReturn(new Array<>());

        ArrayCreator creator = new ArrayCreator(reader, validator, parser);
        List<Array<Integer>> actual = creator.create(FILE_PATH);
        List<Array<Integer>> expected = new ArrayList<>();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCreateShouldCreateWhenMultipleArraysApplied() throws DataException {
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.parse("1 7 9 0")).thenReturn(new Array<>(1, 7, 9, 0));
        when(parser.parse("3 2 4")).thenReturn(new Array<>(3, 2, 4));

        ArrayCreator creator = new ArrayCreator(reader, validator, parser);
        List<Array<Integer>> actual = creator.create(FILE_PATH);
        List<Array<Integer>> expected = new ArrayList<>();
        expected.add(new Array<>(1, 7, 9, 0));
        expected.add(new Array<>(3, 2, 4));

        Assert.assertEquals(actual, expected);
    }
}
