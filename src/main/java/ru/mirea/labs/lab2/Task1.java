package ru.mirea.labs.lab2;

public class Task1 {
    private static void sumFor(int[] arr) {
        int r = 0;
        for (int j : arr) r+=j;
        System.out.println(r);
    }
    private static void sumWhile(int[] arr) {
        int i = 0;
        int r = 0;
        while(i < arr.length) {
            r+=arr[i];
            ++i;
        }
        System.out.println(r);
    }

    private static void sumDoWhile(int[] arr) {
        int i = 0;
        int r = 0;
        do {
            r+=arr[i];
            ++i;
        } while(i < arr.length);
        System.out.println(r);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        sumFor(array);
        sumWhile(array);
        sumDoWhile(array);
    }
}
