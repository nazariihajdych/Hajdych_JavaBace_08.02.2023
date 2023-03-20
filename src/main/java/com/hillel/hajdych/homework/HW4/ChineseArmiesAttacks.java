package com.hillel.hajdych.homework.HW4;

import java.util.Scanner;

public class ChineseArmiesAttacks {
    public static void main(String[] args) {

        int liTypeWarrior, liTypeBowman, liTypeRider;
        int mynTypeWarrior, mynTypeBowman, mynTypeRider;

        int liPerType;
        int mynPerType;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість воїнів кожного " +
                "виду династії Лі (ціле число):  ");

        liPerType = scanner.nextInt();
        mynPerType = (int) Math.round(liPerType * 1.5);

        System.out.println("Кількість воїнів кожного виду династії Мінь: " + mynPerType);
        System.out.println();

        System.out.println("Династія Лі (цілі числа)");
        System.out.print("Введіть показник атаки воїнів Лі: ");
        liTypeWarrior = scanner.nextInt();

        System.out.print("Введіть показник атаки лучників Лі: ");
        liTypeBowman = scanner.nextInt();

        System.out.print("Введіть показник атаки вершників Лі: ");
        liTypeRider = scanner.nextInt();

        System.out.println();

        System.out.println("Династія Мінь (цілі числа)");
        System.out.print("Введіть показник атаки воїнів Мінь: ");
        mynTypeWarrior = scanner.nextInt();

        System.out.print("Введіть показник атаки лучників Мінь: ");
        mynTypeBowman = scanner.nextInt();

        System.out.print("Введіть показник атаки вершників Мінь: ");
        mynTypeRider = scanner.nextInt();

        int sumAttackLi;
        int sumAttackMyn;

        sumAttackLi = (liPerType * liTypeWarrior) + (liPerType * liTypeBowman) + (liPerType * liTypeRider);
        sumAttackMyn = (mynPerType * mynTypeWarrior) + (mynPerType * mynTypeBowman) + (mynPerType * mynTypeRider);

        System.out.println();
        System.out.println("Загальна атака армії династії Лі становить: " + sumAttackLi);
        System.out.println("Загальна атака армії династії Мінь становить: " + sumAttackMyn);


    }
}
