package ru.mirea.labs.lab5.task2_3;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Circle(5.5, "RED", false);
        System.out.println(shape);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());

        Circle circle = (Circle) shape;
        System.out.println(circle.getRadius());

        //Shape s2 = new Shape(); //Экземпляр абстрактного класса создать нельзя

        Shape otherShape = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(otherShape);
        System.out.println(otherShape.getArea());
        System.out.println(otherShape.getPerimeter());
        System.out.println(otherShape.getColor());
        Rectangle r1 = (Rectangle) otherShape;
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6, "WHITE", true); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2.getLength());
    }
}
