package ru.mirea.labs.lab10.task3;

import java.util.Comparator;

public class MergeSort {
    public static <E> void sort(E[] a, int mid, int end, Comparator<? super E> comp) {
        mergeSort(a, 0, mid, comp);
        mergeSort(a, mid + 1, end, comp);
        merge(a, 0, mid, end, comp);
    }


    public static <E> void mergeSort(E[] a, int from, int to, Comparator<? super E> comp) {
        if (from == to)
            return;
        int mid = (from + to) / 2;
        mergeSort(a, from, mid, comp);
        mergeSort(a, mid + 1, to, comp);
        merge(a, from, mid, to, comp);
    }

    private static <E> void merge(E[] a, int from, int mid, int to, Comparator<? super E> comp) {
        int n = to - from + 1;
        Object[] values = new Object[n];

        int fromValue = from;

        int middleValue = mid + 1;

        int index = 0;

        while (fromValue <= mid && middleValue <= to) {
            if (comp.compare(a[fromValue], a[middleValue]) < 0) {
                values[index] = a[fromValue];
                fromValue++;
            } else {
                values[index] = a[middleValue];
                middleValue++;
            }
            index++;
        }

        while (fromValue <= mid) {
            values[index] = a[fromValue];
            fromValue++;
            index++;
        }
        while (middleValue <= to) {
            values[index] = a[middleValue];
            middleValue++;
            index++;
        }

        for (index = 0; index < n; index++)
            a[from + index] = (E) values[index];
    }
}
