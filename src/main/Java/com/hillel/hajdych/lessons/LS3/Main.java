package com.hillel.hajdych.lessons.LS3;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

//        System.out.println(a % b);
//        System.out.println(10 % 1);
//        System.out.println(10 % 2);
//        System.out.println(10 % 3);
//        System.out.println(10 % 4);
//        System.out.println(10 % 5);
//        System.out.println(10 % 6);
//        System.out.println(10 % 7);
//        System.out.println(10 % 8);
//        System.out.println(10 % 9);
//        System.out.println(10 % 10);

//        int x = 10;
//        x = x + 5;
//        x += 5;
//        x -= 5;
//        x /= 5;
//        x *= 5;
//        x %= 5;

//        System.out.println(x);

//        int y = 10;
//        y++;
//        System.out.println(y);
//
//        --y;
//        ++y;
//        y--;

//        int x = 10;
//
//        System.out.println(x++ + ++x);
//        System.out.println(x);
//
//        int u = 10;
//
//        System.out.println(--u - u++ + ++u);
//        System.out.println(u);

//        Math.abs(10);
//        Math.abs(-10);
//        System.out.println(Math.abs(-10));
//
//        System.out.println(Math.pow(2, 4));
//
//        System.out.println(Math.sqrt(25));
//
//        System.out.println(Math.round(10.5));
//        System.out.println(Math.round(10.4));

        System.out.println(Math.random()); // [0.0 1.0) -> 0 .... 0.9999999

        System.out.println(Math.round(Math.random()*10));
        System.out.println((int) (Math.random() * 11));

        // 15 - 30

        int min = 15;
        int max = 30;

        System.out.println(15 + (int) (Math.random() * 16));
        System.out.println(min + (int)(Math.random() * (max - min + 1)));





    }
}
