package ru.mirea.labs.lab2;

public class Task5 {
    public static int fact(int n) {
        int r = 1;
        for (int i = 1; i < n + 1; i++) {
            r *= i;
        }
        return r;
    }

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println(i + "! = " + fact(i));
        }


    }
}
