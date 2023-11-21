package ru.mirea.labs.lab8.task1;

public class TaskTester {
    public static void main(String[] args) {
        Nameable dog = new Dog();
        Nameable human = new Human();

        System.out.println(dog.getName());
        System.out.println(human.getName());
    }
}
