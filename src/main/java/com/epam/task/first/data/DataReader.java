package com.epam.task.first.data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataReader {

    public List<String> readData(String filename) throws DataException {
        List<String> result = new ArrayList<>();

        try (Reader inputReader = new FileReader(filename);
             BufferedReader reader = new BufferedReader(inputReader)) {
            String line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
        return result;
    }
}
