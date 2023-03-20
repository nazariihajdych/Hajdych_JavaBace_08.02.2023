package com.hillel.hajdych.lessons.LS5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello world");
//        }

//        for (int i = 0; ; i++) {
//
//            if (i > 5) break;
//
//            if (i == 1 || i == 3) continue;
//
//            System.out.println(i);
//        }


//      Безкінечний цикл, не робити так!
//        for (int i = 0; ; i++) {
//
//            if (i > 5) continue;
//
//            if (i > 5) break;
//
//            System.out.println(i);
//        }

//Послідовність фібоначі
//
//        int num1 = 1;
//        int num2 = 1;
//
//        int sum = 0;
//
//        System.out.print(num1 + " " + num2 + " ");
//        for (int i = 0; i < 9 ; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//
//            num1 = num2;
//            num2 = sum;
//        }

//        int i = 0;
//        while (i < 5){
//            System.out.println(i);
//            i++;
//        }


//        int i = 10;
//
//        do {
//            System.out.println("Hello world");
//        }while (i < 1);


//        Scanner scanner = new Scanner(System.in);
//
//        int userValue = -1;
//
//        while (true){
//            System.out.println("Please enter integer: ");
//            if (scanner.hasNextInt()){
//                userValue = scanner.nextInt();
//                break;
//            }else {
//                System.out.println("Wrong number! Try again");
//                scanner.nextLine();
//            }
//        }

//        int timer = 10;
//
//        while (timer >=0){
//
//            int random = (int) (Math.random() * 101);
//
//            if (random >= 85 && random <= 100){
//                System.out.println("Wiin");
//                break;
//            }
//
//            System.out.println(timer);
//            if (timer == 0){
//                System.out.println("Booommm");
//            }
//            timer--;
//        }


//        Scanner scanner = new Scanner(System.in);
//        int userValue = 0;
//
//        while (true){
//            System.out.println("Please enter integer: ");
//            if (scanner.hasNextInt()){
//                userValue = scanner.nextInt();
//                if (userValue >= 1 && userValue <= 10) {
//
//                    break;
//                }
//                else {
//                    System.out.println("from 1 - 10");
//                }
//            }else {
//                System.out.println("Wrong number! Try again");
//                scanner.nextLine();
//            }
//
//        }
//
//        int factorial = 1;
//
//        for (int i = 1; i < userValue; i++) {
//            factorial *= i;
//        }
//        System.out.println("factorial = " + factorial);

//        int counter = 0;
//        int i = 0;
//
//       while (true){
//            i++;
//            if (i / 10 == 4 || i / 10 == 9 || i % 10 ==4 ||
//                i % 10 == 9 || (i / 10) % 10 == 4 || (i / 10) % 10 == 9) continue;
//
//            System.out.println("Шатл № = " + i);
//            counter++;
//            if (counter == 100) break;
//        }
//        System.out.println( "Всього шатлів відправлено на Марс: " + counter);


        int min = 0;
        int max = 10;
        int compNumber = min + (int) (Math.random() * (max - min + 1));

        Scanner scanner = new Scanner(System.in);

        int userValue;

        System.out.println("Випробуйте удачу! Компʼютер загадав число в діапазоні від 1 до 10.");
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
                i--;
                if (i == 1) {
                    System.out.println("У вас все ще залишилося " + (2 - i) + " спроба, спробуйте вводити цілі числа!");
                } else {
                    System.out.println("У вас все ще залишилося " + (2 - i) + " спроби, спробуйте вводити цілі числа!");
                }
                System.out.println();
                scanner.nextLine();
            }
        }








    }
}
