package com.hillel.hajdych.lessons.LS4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//        int c = 7;
//
//
//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//
//        System.out.println(a == b);
//        System.out.println(a != b);
//
//        System.out.println(a > b && b > c);
//        System.out.println(a > b || b > c);
//
//        System.out.println(a > b || b > c && c <= 12);
//
//        System.out.println(10 > 20 && (20 < 30 || true ));

//        int a = 10;
//        int b = 5;
//
//        System.out.println(a < b && b++ >= 5); // права частине не запучкається якщо ліва false для оператора &&
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // ------------------------------//

//        int a = 10;
//        int b = 5;
//
//        if (a > b) {
//            System.out.println("a > b");
//        }
//
//
//        if (a > b) {
//            System.out.println("True");
//        } else {
//            System.out.println(false);
//        }
//
//
//
//        if (a > b){
//            System.out.println(true);
//        } else if (a == b) {
//            System.out.println(true + "else-if");
//        } else {
//            System.out.println(false);
//        }

//
//        int a = 10;
//        int b = 5;
//
//        //Тернарний оператор заміна if, вкладеність тернарних операторів теж можлива
//
//        System.out.println(a >= b ? "a >=b" : "a < b");
//                        //умова if тіло else тіло


        //----------------------//
        //Побітові оператори перевірок

//        int a = 14;
//        int b = 11;
//
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//
//        System.out.println(Integer.toBinaryString(a & b));
//        System.out.println(a & b);
//        System.out.println(Integer.toBinaryString(a | b));
//        System.out.println(a | b);
//        System.out.println(Integer.toBinaryString(a ^ b));
//        System.out.println(a ^ b);


        //---------------//

        //switch case

//        int a = 3;
//
//        switch (a) {
//            case 1: {
//                System.out.println("1");
//                break;
//            }
//            case 2: {
//                System.out.println("2");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }
//
//        String str = "qwerty";
//        String str2 = "qwerty";
//        String str3 = new String("qwertY");
//
//        System.out.println(str == str2);
//        System.out.println(str == str3);
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(str.equals(str3));
//        System.out.println(str.equalsIgnoreCase(str3));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pleas enter number: ");
        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println("your number: " + number);
        }else {
            System.out.println("wrong number!");
            System.exit(0);
        }


    }
}
