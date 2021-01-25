package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class SelectionSorter implements Sorter{

    @Override
    public Array<Integer> sort(Array<Integer> array) {
        List<Integer>elements = array.getElements();
        List<Integer>newElements = new ArrayList<>();

        for(int i = 0; i < elements.size(); i++){
            int min = elements.get(i);
            int minPosition = i;
            for(int j = i + 1; j < elements.size();j++){
                if(elements.get(j) < min){
                    min = elements.get(j);
                    minPosition = j;
                }
            }
            Collections.swap(elements, i, minPosition);
            newElements.add(min);
        }
        return new Array<>(newElements);
    }
}
