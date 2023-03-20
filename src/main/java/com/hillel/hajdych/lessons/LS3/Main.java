package com.hillel.hajdych.lessons.LS3;

import java.util.Scanner;

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

//        System.out.println(Math.random()); // [0.0 1.0) -> 0 .... 0.9999999
//
//        System.out.println(Math.round(Math.random()*10));
//        System.out.println((int) (Math.random() * 11));
//
//        // 15 - 30
//
//        int min = 15;
//        int max = 30;
//
//        System.out.println(15 + (int) (Math.random() * 16));
//        System.out.println(min + (int)(Math.random() * (max - min + 1)));


        //Zarplaty
//        int emp1 = 700;
//        int emp2 = 1500;
//        int emp3 = 3500;
//
//        int monthAndYear = 10 * 12;
//
//        int salEmp1for10Y = emp1 * monthAndYear;
//        int salEmp2for10Y = emp2 * monthAndYear;
//        int salEmp3for10Y = emp3 * monthAndYear;
//
//        double tax = 0.95;
//
//        double sal1OutTax = salEmp1for10Y * tax;
//        double sal2OutTax = salEmp2for10Y * tax;
//        double sal3OutTax = salEmp3for10Y * tax;
//
//        double avgSal = ((salEmp1for10Y + salEmp2for10Y + salEmp3for10Y) / 3.0);
//
//        double avgSalOutTax = ((sal1OutTax + sal2OutTax + sal3OutTax) / 3.0);
//
//        System.out.println("ЗП 10 років Працівник 1: " + salEmp1for10Y);
//        System.out.println("ЗП 10 років Працівник 2: " + salEmp2for10Y);
//        System.out.println("ЗП 10 років Працівник 3: " + salEmp3for10Y);
//
//        System.out.println();
//
//        System.out.println("ЗП 10 років Працівник 1 - 5% податку: " + sal1OutTax);
//        System.out.println("ЗП 10 років Працівник 2 - 5% податку: " + sal2OutTax);
//        System.out.println("ЗП 10 років Працівник 3 - 5% податку: " + sal3OutTax);
//
//        System.out.println();
//
//        System.out.println("Середня зарплата за 10 років: " + avgSal);
//        System.out.println("Середня зарплата за 10 років - 5%: " + avgSalOutTax);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some string: ");
        String str = scanner.next();

        System.out.println("str = " + str);

        // .next Зчитує до пробілу. При тому якщо декілька введень з пробілом вони запису
        //ються в буфер. Наступний некст зчитає з буферу запис після пробілу.
        //.nextLine зчитує посністю строку, записує в буфер після переходу на новий рядок



    }
}
