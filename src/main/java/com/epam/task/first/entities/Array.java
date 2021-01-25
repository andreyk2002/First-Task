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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((elements == null) ? 0 : elements.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Array other = (Array) obj;
        if (elements == null) {
            return other.elements == null;
        } else return elements.equals(other.elements);
    }
}
