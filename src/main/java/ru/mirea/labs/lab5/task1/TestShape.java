package ru.mirea.labs.lab5.task1;

public class TestShape {
    public static void main(String[] args) {
        Shape t = new Triangle();
        Shape s = new Square();
        Shape h = new Hexagon();

        System.out.println("triangles: " + t.anglesCount());
        System.out.println("square: " + s.anglesCount());
        System.out.println("hexagon: " + h.anglesCount());
    }
}
