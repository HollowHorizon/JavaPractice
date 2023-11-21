package ru.mirea.labs.lab5.task4;

public class TestShape {
    public static void main(String[] args) {
        Movable shape = new MovableCircle(0, 0, 2, 1, 5);

        System.out.println(shape);

        shape.moveRight();
        shape.moveUp();

        System.out.println(shape);

        Movable otherShape = new MovableRectangle(0, 10, 0, 20, 1, 1);

        System.out.println(otherShape);

        otherShape.moveRight();
        otherShape.moveUp();
        otherShape.moveRight();

        System.out.println(otherShape);
    }
}
