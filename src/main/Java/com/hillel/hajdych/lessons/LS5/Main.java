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

        int counter = 0;

        for (int i = 0; i <= 10; i++) {

            if (i / 10 == 4 || i / 10 == 9 || i%10 ==4 || i%10 == 9){
                continue;
            }
            System.out.println(" shuttle number = " + i);
            counter++;
        }
    }
}
