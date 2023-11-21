package ru.mirea.labs.lab5.task4;

public class MovableCircle extends MovablePoint implements Movable {
    private final int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Movable Circle, x:" + x + ", y:" + y + ", xSpeed:" + xSpeed + ", ySpeed:" + ySpeed + ", radius:" + radius;
    }
}
