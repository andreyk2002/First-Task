package com.epam.task.first.exceptions;

import com.epam.task.first.entities.Array;

public class ArrayIsEmptyException extends Exception{

    public ArrayIsEmptyException(){
        super();
    }

    public ArrayIsEmptyException(String message){
        super(message);
    }
}
