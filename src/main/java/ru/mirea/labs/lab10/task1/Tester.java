package ru.mirea.labs.lab10.task1;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        var students = new Student[]{
                new Student("Ivan", 7),
                new Student("Boris", 2),
                new Student("Petr", 5)
        };

        System.out.println(Arrays.toString(students));

        InsertionSort.sort(students, Student::getIdNumber);

        System.out.println(Arrays.toString(students));
    }

    public static class Student {
        private final String name;
        private final int idNumber;

        public Student(String name, int idNumber) {
            this.name = name;
            this.idNumber = idNumber;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", idNumber=" + idNumber +
                    '}';
        }
    }
}
