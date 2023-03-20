package com.hillel.hajdych.homework.HW10.HW101;

import java.util.Scanner;

public class BurgerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int menuChoice;
        int numberOfMeat = 0;

        System.out.println("Меню: ");
        System.out.println("1.Звичайний бургер;\n2.Дієтичний бургер;\n3.Бургер з вибором кількості котлет;");

        for (; ;) {
            System.out.println();
            System.out.print("Для замовлення введіть цифру страви: ");
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
                scanner.nextLine();
                if (menuChoice <= 0 || menuChoice > 3) {
                    System.out.println("Введене неправильне значення, спробуйте знову!");
                } else {
                    break;
                }

            } else {
                System.out.println("Введіть ціле число від 1 до 3;");
                scanner.nextLine();
            }
        }

        if (menuChoice == 3){
            for (; ;) {
                System.out.print("Введіть кількість котлет: ");
                if (scanner.hasNextInt()) {
                    numberOfMeat = Math.abs(scanner.nextInt());
                    scanner.nextLine();
                    if (numberOfMeat > 5) {
                        System.out.println(numberOfMeat + " котлет. Завелика кількість, введіть менше число!");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Введіть ціле число від 0 до 5;");
                    scanner.nextLine();
                }
            }
        }

        Burger yourBurger = new Burger(menuChoice, numberOfMeat);

    }
}
