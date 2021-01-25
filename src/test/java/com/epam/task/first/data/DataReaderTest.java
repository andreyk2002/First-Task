package com.epam.task.first.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private final static String EMPTY_FILE = "./src/test/resources/empty.txt";
    private final static String TEST_FILE = "./src/test/resources/input.txt";
    private final static String NOT_EXISTING_FILE = "./src/test/resources/notExistingFile.txt";
    private final DataReader reader = new DataReader();

    @Test
    public void testReadDataShouldReturnEmptyListWhenFileIsEmpty() throws DataException {
        List<String> actual = reader.readData(EMPTY_FILE);
        List<String>expected = new ArrayList<>();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReadDataShouldReadWhenMultipleLinesFileApplied() throws DataException{
        List<String> actual = reader.readData(TEST_FILE);
        List<String>expected = Arrays.asList("1 2 3", "2", "3f 5a");
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = DataException.class)
    public void testReadDataShouldThrowADataExceptionWhenFileNotFound() throws DataException{
        List<String> actual = reader.readData(NOT_EXISTING_FILE);
    }
}
