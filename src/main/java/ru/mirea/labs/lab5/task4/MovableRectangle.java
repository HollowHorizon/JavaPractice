package ru.mirea.labs.lab5.task4;

public class MovableRectangle extends MovablePoint implements Movable {

    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        super(0, 0, xSpeed, ySpeed);

        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isSpeed() {
        return (topLeft.ySpeed == bottomRight.ySpeed && topLeft.xSpeed == bottomRight.xSpeed);
    }

    public String toString() {
        return "Movable Rectangle, topLeft: (" + topLeft + "), bottomRight: (" + bottomRight + "), xSpeed:" + xSpeed + ", ySpeed:" + ySpeed;
    }

    public void moveUp() {
        if (isSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    public void moveDown() {
        if (isSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    public void moveRight() {
        if (isSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    public void moveLeft() {
        if (isSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
}
