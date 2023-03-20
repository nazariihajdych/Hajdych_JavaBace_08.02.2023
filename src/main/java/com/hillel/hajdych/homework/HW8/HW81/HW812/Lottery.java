package com.hillel.hajdych.homework.HW8.HW81.HW812;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        int[] lotteryArr = new int[7];
        int[] userGuess = new int[7];

        int min = 0;
        int max = 9;

        String[] wrongData = new String[7];
        int[] position = new int[7];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < lotteryArr.length; i++) {
            lotteryArr[i] = min + (int) (Math.random() * (max - min + 1));
        }

        System.out.println("Давайте зіграємо в лотерею!");
        System.out.println("Для виграшу потрібно набрати більше 2 збігів!");
        System.out.println("Введіть 7 цілих чисел в діапазоні [0 -> 9] (через пробіл):");

        for (int i = 0; i < userGuess.length; i++) {
            if (scanner.hasNextInt()) {
                userGuess[i] = scanner.nextInt();
                if (userGuess[i] > 9 || userGuess[i] < 0) {
                    wrongData[i] = Integer.toString(userGuess[i]);
                    position[i] = i;
                }
            } else {
                userGuess[i] = 0;
                wrongData[i] = scanner.next();
                position[i] = i;
            }
        }


        for (int i = 0; i < wrongData.length; i++) {
            if (wrongData[i] != null) {
                System.out.print("Лотерейний квиток [");
                for (int j = 0; j < userGuess.length; j++) {
                    if (wrongData[j] != null) {
                        if (j == userGuess.length - 1)
                            System.out.print(wrongData[j]);
                        else
                            System.out.print(wrongData[j] + ", ");
                    } else {
                        if (j == userGuess.length - 1)
                            System.out.print(userGuess[j]);
                        else
                            System.out.print(userGuess[j] + ", ");
                    }
                }

                System.out.print("] не валідний!");
                System.out.println();
                System.out.println("Неприпустимий символ!");

                for (int k = 0; k < wrongData.length; k++) {
                    if (wrongData[k] != null) {
                        System.out.println(wrongData[k] + " на позиції " + (position[k] + 1) + ";");
                    }
                }
                System.out.println("Перезапишіть неприпустимі значення!");
                System.out.println("Для повністю нового введення перезапустіть програму!");
                scanner.nextLine();
                break;
            }
        }

        for (int j = 0; j < wrongData.length; j++) {
            if (wrongData[j] != null) {
                System.out.print("Замініть неприпустимий символ " + wrongData[j] + " -> ");
                if (scanner.hasNextInt()) {
                    userGuess[j] = scanner.nextInt();
                    scanner.nextLine();
                    if (userGuess[j] < 0 || userGuess[j] > 9) {
                        System.out.println("Неправильний символ, спробуйте знову!");
                        j--;
                        System.out.println();
                    }
                } else {
                    System.out.println("Неправильний символ, спробуйте знову!");
                    j--;
                    System.out.println();
                    scanner.nextLine();
                }
            }
        }

        Arrays.sort(lotteryArr);
        Arrays.sort(userGuess);

        int counterOrMatches = 0;
        for (int i = 0; i < lotteryArr.length; i++) {
            if (lotteryArr[i] == userGuess[i]) {
                counterOrMatches++;
            }
        }

        System.out.println();
        System.out.print("Виграшна комбінація чисел: ");
        System.out.println(Arrays.toString(lotteryArr));
        System.out.print("               Ваші числа: ");
        System.out.println(Arrays.toString(userGuess));

        System.out.println();
        System.out.println("Кількість збігів: " + counterOrMatches);

        if (counterOrMatches > 2) System.out.println("Ви виграли лотерею!");
        else System.out.println("Ви програли!");

    }
}
