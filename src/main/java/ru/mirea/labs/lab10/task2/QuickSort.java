package ru.mirea.labs.lab10.task2;

import java.util.Comparator;

public class QuickSort {
    public static <T> T[] sort(T[] array, Comparator<T> comparator) {
        return sort(array, 0, array.length - 1, comparator);
    }

    public static <T> T[] sort(T[] array,
                               int left,
                               int right,
                               Comparator<T> comp) {
        int ll = left;
        int rr = right;

        if (rr > ll) {
            T pivot = array[(ll + rr) / 2];
            while (ll <= rr) {
                // that's how we'll use the comparator:
                while (ll < right && comp.compare(array[ll], pivot) < 0) {
                    ll += 1;
                }
                while (rr > left && comp.compare(array[rr], pivot) > 0) {
                    rr -= 1;
                }
                if (ll <= rr) {
                    swap(array, ll, rr);
                    ll += 1;
                    rr -= 1;
                }
            }
            if (left < rr) {
                sort(array, left, rr, comp);

            }
            if (ll < right) {
                sort(array, ll, right, comp);
            }
        }
        return array;
    }

    public static <T> void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
