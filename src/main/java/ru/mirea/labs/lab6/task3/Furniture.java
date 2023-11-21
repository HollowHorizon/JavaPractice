package ru.mirea.labs.lab6.task3;

public abstract class Furniture {
    public abstract int cost();

    public static class Chair extends Furniture {
        @Override
        public int cost() {
            return 10;
        }
    }
    public static class Table extends Furniture {
        @Override
        public int cost() {
            return 20;
        }
    }
}
