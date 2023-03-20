package com.hillel.hajdych.homework.HW17.drinkMachine;

import java.util.Arrays;
import java.util.Scanner;

public class MainMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DrinksMachine[] drinksMachine = DrinksMachine.values();
        DrinksMachine userChoice = null;

        Drinks.pricesOfDrinks();

        while (true) {
            boolean exit = false;
            while (true) {
                System.out.println("Виберіть напій зі списку: " + Arrays.toString(drinksMachine));
                System.out.print("-->");
                String userValue = scanner.nextLine().toUpperCase();

                if (userValue.toUpperCase().equals("EXIT")){
                    exit = true;
                    break;
                }

                for (DrinksMachine drink : drinksMachine) {
                    if (userValue.equals(drink.toString())) {
                        userChoice = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }

                if (userChoice != null) {
                    break;
                } else {
                    System.out.println("Неправильно введена назва напою!");
                }
            }

            if (exit) break;

            new Drinks(userChoice);
            userChoice = null;

            System.out.println();
            System.out.println("Загальна кількість приготовлених напоїв: " + Drinks.getCounter());
            System.out.println("Сума до сплати: " + Drinks.getTotal() + " грн.");
            System.out.println("Для завершення операції введіть EXIT!");
            System.out.println();

        }

        System.out.println();
        System.out.println("Дякуємо, що скористалися нашими послугами)");
        if (Drinks.getCounter() > 1) System.out.println("Насолоджуйтеся своїми напоями!");
        else if (Drinks.getCounter() == 1) System.out.println("Насолоджуйтеся своїм напоєм!");
    }
}
