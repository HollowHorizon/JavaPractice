package ru.mirea.labs.lab9;

import java.util.Arrays;

public class Task16 {
    public static void solve(int[] values) {
        var max = Arrays.stream(values).max().orElse(0);
        var count = 0;
        for (int value : values) if (value == max) count++;

        System.out.println(count);
    }

    public static void main(String[] args) {
        solve(new int[]{1, 2, 3, 5, 5, 5});
    }
}
