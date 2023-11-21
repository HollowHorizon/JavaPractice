package ru.mirea.labs.lab2;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
