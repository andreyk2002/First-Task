package com.epam.task.first.parsing;

public class ArrayValidator {
    public static final String CORRECT_ARRAY_PATTERN = "^(\\d+\\s)*\\d+$";

    public boolean validate(String line) {
        return line.matches(CORRECT_ARRAY_PATTERN);
    }
}
