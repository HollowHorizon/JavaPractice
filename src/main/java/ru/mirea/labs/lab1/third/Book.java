package ru.mirea.labs.lab1.third;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Book {
    private final String[] lines;

    public Book(InputStream stream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        lines = reader.lines().toArray(String[]::new);
    }

    public String[] getLines() {
        return lines;
    }

    public void read() {
        for (String line : lines) System.out.println(line);
    }

    @Override
    public String toString() {
        return Arrays.toString(lines);
    }
}
