package com.epam.task.first.entities;

import java.util.Arrays;
import java.util.List;

public class Array<Integer> {
    private final List<Integer> elements;

    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public Array(Integer... elements) {
        this.elements = Arrays.asList(elements);
    }

    public List<Integer> getElements() {
        return elements;
    }

}
