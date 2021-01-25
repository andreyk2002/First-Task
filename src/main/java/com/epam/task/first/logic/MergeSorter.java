package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;


public class MergeSorter implements Sorter {

    @Override
    public Array<Integer> sort(Array<Integer> array) {
        List<Integer> elements = array.getElements();
        List<Integer> newElements = sort(elements);
        return new Array<>(newElements);
    }

    private List<Integer> sort(List<Integer> elements) {
        int mid = elements.size() / 2;
        List<Integer> result;
        if (mid > 0) {
            List<Integer> leftHalf = sort(elements.subList(0, mid));
            List<Integer> rightHalf = sort(elements.subList(mid, elements.size()));
            result = merge(leftHalf, rightHalf);
        } else {
            result = elements;
        }
        return result;
    }

    private List<Integer> merge(List<Integer> leftHalf, List<Integer> rightHalf) {
        List<Integer> result = new ArrayList<>();
        int indexLeft = 0;
        int indexRight = 0;
        while (indexLeft < leftHalf.size() && indexRight < rightHalf.size()) {
            int elementLeft = leftHalf.get(indexLeft);
            int elementRight = rightHalf.get(indexRight);
            if (elementLeft < elementRight) {
                result.add(elementLeft);
                indexLeft++;
            } else {
                result.add(elementRight);
                indexRight++;
            }
        }
        if (indexLeft < leftHalf.size()) {
            addRemainingElements(leftHalf, result, indexLeft);
        }
        if (indexRight < rightHalf.size()) {
            addRemainingElements(rightHalf, result, indexRight);
        }
        return result;
    }

    private void addRemainingElements(List<Integer> buffer, List<Integer> target, int start) {
        for (int k = start; k < buffer.size(); k++) {
            int element = buffer.get(k);
            target.add(element);
        }
    }

}
