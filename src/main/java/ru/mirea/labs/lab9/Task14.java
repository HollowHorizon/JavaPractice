package ru.mirea.labs.lab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task14 {
    public static void solve(int x) {
        if (x > 0) {
            solve(x / 10);
            System.out.println(x % 10 + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        solve(Integer.parseInt(reader.readLine()));
    }
}
