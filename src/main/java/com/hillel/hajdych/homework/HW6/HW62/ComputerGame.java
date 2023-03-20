package com.hillel.hajdych.homework.HW6.HW62;

import java.util.Scanner;

public class ComputerGame {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int compNumber = min + (int) (Math.random() * (max - min + 1));

        Scanner scanner = new Scanner(System.in);

        int userValue;

        System.out.println("Випробуйте удачу! Компʼютер загадав ціле число в діапазоні від 1 до 10.");
        System.out.println("У вас є три спроби!!");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("Вгадайте число, яке загадав компʼютер: ");
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                scanner.nextLine();
                if (userValue == compNumber) {
                    System.out.println("Ви виграли, компʼютер загадав число " + compNumber + " \uD83D\uDC4D");
                    break;
                } else if (userValue < compNumber && i < 2) {
                    System.out.println("Холодно, спробуйте більше число!\n");
                } else if (userValue > compNumber && i < 2) {
                    System.out.println("Супер-гаряче, спробуйте менше число!\n");
                } else {
                    System.out.println("Ви програли, компʼютер загадав число " + compNumber + " \uD83D\uDC4E");
                }
            } else {
                System.out.println("Неправильний символ, введіть ціле число в діапазоні від 1 до 10;");
                i--; // при введенні символів відмінних від цілих чисел, спроба не враховується
                char symb = 'и';
                if (i == 1) symb = 'а';

                System.out.println("У вас все ще залишилося " + (2 - i) + " спроб" + symb + ", спробуйте вводити цілі числа!");
                System.out.println();
                scanner.nextLine();
            }
        }
    }
}
