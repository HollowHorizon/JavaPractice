package ru.mirea.labs.lab6.task3;

public class FurnitureTester {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        shop.buy(new Furniture.Chair(), 15);
        shop.buy(new Furniture.Table(), 15);
    }
}
