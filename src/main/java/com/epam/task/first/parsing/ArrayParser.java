package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;


public class ArrayParser {

    private static final String DELIMITER = " ";

    public Array<Integer> parse(String data) {
        String[] elementsString = data.split(DELIMITER);
        List<Integer> elements = new ArrayList<>();
        for (String elementString : elementsString) {
            Integer element = Integer.parseInt(elementString);
            elements.add(element);
        }
        return new Array<>(elements);
    }
}
