package ru.mirea.labs.lab6.task3;

import java.util.ArrayList;

public class FurnitureShop {
    public void buy(Furniture furniture, int money) {
        if(furniture.cost() <= money) {
            System.out.println("Assistant: You can buy this "+furniture.getClass().getSimpleName());
        } else {
            System.out.println("Assistant: You can't buy this "+furniture.getClass().getSimpleName());
        }
    }
}
