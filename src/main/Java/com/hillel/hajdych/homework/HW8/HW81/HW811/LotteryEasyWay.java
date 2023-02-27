package com.hillel.hajdych.homework.HW8.HW81.HW811;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryEasyWay {
    public static void main(String[] args) {
        int[] lotteryArr = new int[7];
        int[] userGuess = new int[7];

        int min = 0;
        int max = 9;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < lotteryArr.length; i++) {
            lotteryArr[i] = min + (int) (Math.random() * (max - min + 1));
        }

        System.out.println("Давайте зіграємо в лотерею!");
        System.out.println("Для виграшу потрібно набрати більше 2 збігів!");
        System.out.println("Введіть 7 цілих чисел в діапазоні [0 -> 9]:");

        for (int i = 0; i < userGuess.length; i++) {
            System.out.print("Число №" + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                userGuess[i] = scanner.nextInt();
                scanner.nextLine();
                if (userGuess[i] > 9 || userGuess[i] < 0) {
                    System.out.println("Неправильний символ, спробуйте знову!");
                    i--;
                    System.out.println();
                }
            } else {
                System.out.println("Неправильний символ, спробуйте знову!");
                i--;
                System.out.println();
                scanner.nextLine();
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
