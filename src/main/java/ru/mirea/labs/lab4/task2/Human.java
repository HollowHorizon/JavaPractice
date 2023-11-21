package ru.mirea.labs.lab4.task2;

public class Human {
    private final String name;
    private final Head head = new Head();
    private final Hand hand = new Hand();
    private final Leg leg = new Leg();

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    static class Head {
        public void say(String msg) {
            System.out.println(msg);
        }
    }
    static class Leg {
        public void punch() {
            System.out.println("punch!");
        }
    }
    static class Hand {
        public void wave() {
            System.out.println("Hi!");
        }
    }
}
