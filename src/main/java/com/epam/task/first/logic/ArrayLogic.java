package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;


public class ArrayLogic {

    public int findMax(final Array<Integer> a) {
        List<Integer> elements = a.getElements();
        if (elements.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return getMax(elements);
    }

    public double countAverage(final Array<Integer> a) {
        List<Integer> elements = a.getElements();
        if (elements.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return getAverage(elements);
    }

    public long countSum(final Array<Integer> a) {
        List<Integer> elements = a.getElements();
        if (elements.isEmpty()) {
            throw new IllegalArgumentException();
        }
        long sum = 0;
        for (int e : elements) {
            sum += e;
        }
        return sum;
    }

    public long countNumberOfPositives(final Array<Integer> a) {
        int result = 0;
        List<Integer> elements = a.getElements();
        for (int e : elements) {
            if (e > 0) {
                result++;
            }
        }
        return result;
    }

    public int countNumberOfNegatives(final Array<Integer> a) {
        int result = 0;
        List<Integer> elements = a.getElements();
        for (int e : elements) {
            if (e < 0) {
                result++;
            }
        }
        return result;
    }

    public void replaceEvenNumbers(Array<Integer> a, int newValue) {
        List<Integer> elements = a.getElements();
        for (int i = 0; i < elements.size(); i++) {
            if(isEven(elements.get(i))){
                elements.set(i,newValue);
            }
        }
    }

    private int getMax(final List<Integer> a) {
        int max = a.get(0);
        for (int e : a) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }

    private double getAverage(final List<Integer> elements) {
        double result = 0;
        for (int e : elements) {
            result += e;
        }
        result /= elements.size();
        return result;
    }

    private boolean isEven(final int e) {
        return e % 2 == 0;
    }
}
