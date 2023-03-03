package com.hillel.hajdych.homework.HW10.HW102;

public class BurgerMain {
    public static void main(String[] args) {

        Burger regularBurger = new Burger("Булочка", "Котлета", "Сир", "Салат", "Майонез");
        System.out.println();
        Burger dietBurger = new Burger("Булочка", "Котлета", "Сир", "Салат");
        System.out.println();
        Burger twoCutletBurger = new Burger("Булочка", "Котлета", "Сир", "Салат", "Майонез", 2);

    }
}
