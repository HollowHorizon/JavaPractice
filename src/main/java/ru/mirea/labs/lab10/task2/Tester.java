package ru.mirea.labs.lab10.task2;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        var students = new Student[]{
                new Student("Ivan", 5),
                new Student("Boris", 2),
                new Student("Petr", 3)
        };

        System.out.println(Arrays.toString(students));

        QuickSort.sort(students, new SortingStudentsByGPA());

        System.out.println(Arrays.toString(students));
    }
}
