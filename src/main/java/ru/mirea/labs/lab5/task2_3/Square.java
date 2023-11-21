package ru.mirea.labs.lab5.task2_3;

public class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public String toString() {
        return "Side Shape: side: " + this.length + ", color: " + this.color;
    }
}
