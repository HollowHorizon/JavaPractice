package ru.mirea.labs.lab10.task2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        Integer mark1 = 5 - o1.getMark();
        Integer mark2 = 5 - o2.getMark();
        return mark1.compareTo(mark2);
    }
}
