package ru.mirea.labs.lab10.task2;

public class Student implements Comparable<Student> {
    private final String name;
    private final int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Integer getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getMark().compareTo(o.getMark());
    }
}