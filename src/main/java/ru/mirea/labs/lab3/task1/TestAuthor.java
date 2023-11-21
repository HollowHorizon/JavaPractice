package ru.mirea.labs.lab3.task1;

public class TestAuthor {
    public static void main(String[] args) {
        var author = new Author("Human", "example@mail.ru", 'm');
        var author2 = new Author("Human2", "example2@mail.ru", 'm');

        author.setEmail(author2.getEmail());

        System.out.print(author);
    }
}
