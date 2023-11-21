package ru.mirea.labs.lab8.task2;

import ru.mirea.labs.lab8.task1.Dog;
import ru.mirea.labs.lab8.task1.Human;
import ru.mirea.labs.lab8.task1.Nameable;

public class TaskTester {
    public static void main(String[] args) {
        Priceable dog = new Chair();
        Priceable human = new Table();

        System.out.println(dog.getPrice());
        System.out.println(human.getPrice());
    }
}
