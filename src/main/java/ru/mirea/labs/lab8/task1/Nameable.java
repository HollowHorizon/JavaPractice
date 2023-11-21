package ru.mirea.labs.lab8.task1;

public interface Nameable {
    default String getName() {
        return this.getClass().getSimpleName();
    };
}
