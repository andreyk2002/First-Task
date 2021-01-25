package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;


public class ArrayLogic {

    public int findMax(Array<Integer> array) {
        List<Integer> elements = array.getElements();
        int max = elements.get(0);
        for (int element : elements) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public double countAverage(Array<Integer> array) {
        List<Integer> elements = array.getElements();
        double result = 0;
        for (int element : elements) {
            result += element;
        }
        result /= elements.size();
        return result;
    }

    public long countSum(Array<Integer> array) {
        List<Integer> elements = array.getElements();
        long sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }

    public long sumNegative(Array<Integer> array) {
        int result = 0;
        List<Integer> elements = array.getElements();
        for (int element : elements) {
            if (element > 0) {
                result++;
            }
        }
        return result;
    }

    public int sumPositive(Array<Integer> array) {
        int result = 0;
        List<Integer> elements = array.getElements();
        for (int element : elements) {
            if (element < 0) {
                result++;
            }
        }
        return result;
    }

    public Array<Integer> replaceEvenNumbers(Array<Integer> array, int newValue) {
        List<Integer> elements = array.getElements();
        List<Integer> newElements = new ArrayList<>();
        for (Integer element : elements) {
            if (isEven(element)) {
                newElements.add(newValue);
            } else {
                newElements.add(element);
            }
        }
        return new Array<>(newElements);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
