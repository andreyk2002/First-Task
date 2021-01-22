package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import com.epam.task.first.exceptions.ArrayIsEmptyException;

import java.util.List;


public class ArrayLogic {

    public int findMax(Array<Integer> array) throws ArrayIsEmptyException {
        List<Integer> elements = array.getElements();
        checkArray(elements);
        int max = elements.get(0);
        for (int element : elements) {
            if (element > max) {
                max = element;
            }
        }
        return max;

    }

    public double countAverage(Array<Integer> array) throws ArrayIsEmptyException {
        List<Integer> elements = array.getElements();
        checkArray(elements);
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

    public void replaceEvenNumbers(Array<Integer> array, int newValue) {
        List<Integer> elements = array.getElements();
        for (int i = 0; i < elements.size(); i++) {
            if (isEven(elements.get(i))) {
                elements.set(i, newValue);
            }
        }
    }

    private void checkArray(List<Integer> elements) throws ArrayIsEmptyException {
        if(elements.isEmpty()){
            throw new ArrayIsEmptyException("Can't find maximum when array is empty");
        }
    }

    private boolean isEven(int e) {
        return e % 2 == 0;
    }
}
