package ru.mirea.labs.lab4.task2;

public class HumanTester {
    public static void main(String[] args) {
        Human ivan = new Human("Ivan");
        ivan.getHand().wave();
        ivan.getLeg().punch();
        ivan.getHead().say("I'm "+ivan.getName());
    }
}
