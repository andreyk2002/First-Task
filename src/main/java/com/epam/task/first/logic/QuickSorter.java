package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class QuickSorter implements Sorter {

    @Override
    public Array<Integer> sort(Array<Integer> array) {
        List<Integer> elements = array.getElements();
        List<Integer> newElements = new ArrayList<>(elements);
        sort(newElements, 0, newElements.size() - 1);
        return new Array<>(newElements);
    }

    public void sort(List<Integer> elements, int left, int right) {
        if (left < right) {
            int pivot = partition(elements, left, right);
            sort(elements, left, pivot);
            sort(elements, pivot + 1, right);
        }
    }

    private int partition(List<Integer> elements, int left, int right) {
        int currentLeft = left;
        int currentRight = right;
        int mid = (left + right) / 2;
        int midElement = elements.get(mid);
        while (currentLeft <= currentRight) {
            while (elements.get(currentLeft) < midElement) {
                currentLeft++;
            }
            while (elements.get(currentRight) > midElement) {
                currentRight--;
            }
            if (currentLeft <= currentRight) {
                Collections.swap(elements, currentLeft, currentRight);
                currentLeft++;
                currentRight--;
            }
        }
        return (currentLeft + currentRight) / 2;
    }
}
