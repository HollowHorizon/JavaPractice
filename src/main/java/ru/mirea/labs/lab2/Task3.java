package ru.mirea.labs.lab2;

public class Task3 {
    public static float solve(int n) {
        float r = 1;
        while (n > 0) {
            r = r + 1f / n;
            n--;
        }
        return r;
    }

    public static void main(String[] args) {

        int num = 10;

        for (int i = 1; i < num+1; i++) {
            System.out.println("result["+i+"]: "+solve(i));
        }
    }
}
