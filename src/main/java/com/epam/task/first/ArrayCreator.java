package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private final DataReader reader;
    private final ArrayValidator validator;
    private final ArrayParser parser;

    public ArrayCreator(DataReader reader, ArrayValidator validator, ArrayParser parser) {
        this.reader = reader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array<Integer>> create(String filename) throws DataException {
        List<String> lines = reader.readData(filename);
        List<Array<Integer>> arrays = new ArrayList<>();
        for (String line : lines) {
            if (validator.validate(line)) {
                Array<Integer> array = parser.parse(line);
                arrays.add(array);
            }
        }
        return arrays;
    }
}
