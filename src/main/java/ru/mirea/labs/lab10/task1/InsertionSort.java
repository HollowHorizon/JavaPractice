package ru.mirea.labs.lab10.task1;

import java.util.function.Function;

public class InsertionSort {
    public static <T> void sort(T[] sortArr, Function<T, Integer> f) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            T s = sortArr[i];
            int swap = f.apply(s);
            for (j = i; j > 0 && swap < f.apply(sortArr[j - 1]); j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = s;
        }
    }
}
