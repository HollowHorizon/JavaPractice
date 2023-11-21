package ru.mirea.labs.lab10.task3;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Ivan", 20));
        list1.add(new Student("Boris", 22));
        list1.add(new Student("Anton", 19));
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Ivan 2.0", 21));
        list2.add(new Student("David", 18));

        int mid = list1.size() -1;
        list1.addAll(list2);

        int end = list1.size() -1;
        Student[] mergedList = list1.toArray(new Student[0]);

        MergeSort.sort(mergedList, mid, end, Student::compareTo);

        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
