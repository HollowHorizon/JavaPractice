package ru.mirea.labs.lab1.third;

public class TestBook {
    public static void main(String[] args) {
        var book = new Book(TestBook.class.getResourceAsStream("/lab1/example.book"));
        book.read();
    }
}
