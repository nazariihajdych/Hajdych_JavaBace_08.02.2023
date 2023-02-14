package com.hillel.hajdych.homework.HW5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        String teamOneName, teamTwoName;
        String error = "Введені некоректні дані!\nПерезапустіть " +
                "програму та введіть правильні дані для гравця";

        int p1T1Frags = 0, p2T1Frags = 0, p3T1Frags = 0, p4T1Frags = 0, p5T1Frags = 0;
        int p1T2Frags = 0, p2T2Frags = 0, p3T2Frags = 0, p4T2Frags = 0, p5T2Frags = 0;
        double avgT1, avgT2;


        Scanner scanner = new Scanner(System.in);

        // Дані першої команди

        System.out.print("Введіть назву першої команди: ");
        teamOneName = scanner.nextLine();
        System.out.println("Введіть фраги для 5 гравців команди " + teamOneName);

        System.out.print("Гравець №1: ");
        if (scanner.hasNextInt()){
            p1T1Frags = scanner.nextInt();
        } else {
            System.out.println(error + " №1 команди " + teamOneName);
            System.exit(0);
        }

        System.out.print("Гравець №2: ");
        if (scanner.hasNextInt()){
            p2T1Frags = scanner.nextInt();
        } else {
            System.out.println(error +" №2 команди " + teamOneName);
            System.exit(0);
        }

        System.out.print("Гравець №3: ");
        if (scanner.hasNextInt()){
            p3T1Frags = scanner.nextInt();
        } else {
            System.out.println(error + " №3 команди " + teamOneName);
            System.exit(0);
        }

        System.out.print("Гравець №4: ");
        if (scanner.hasNextInt()){
            p4T1Frags = scanner.nextInt();
        } else {
            System.out.println(error + " №4 команди " + teamOneName);
            System.exit(0);
        }

        System.out.print("Гравець №5: ");
        if (scanner.hasNextInt()){
            p5T1Frags = scanner.nextInt();
        } else {
            System.out.println(error + " №5 команди " + teamOneName);
            System.exit(0);
        }

        // Дані другої команди

        Scanner scanner2 = new Scanner(System.in);

        System.out.println();
        System.out.print("Введіть назву другої команди: ");
        teamTwoName = scanner2.nextLine();
        System.out.println("Введіть фраги для 5 гравців команди " + teamTwoName);

        System.out.print("Гравець №1: ");
        if (scanner2.hasNextInt()){
            p1T2Frags = scanner2.nextInt();
        } else {
            System.out.println(error + " №1 команди " + teamTwoName);
            System.exit(0);
        }

        System.out.print("Гравець №2: ");
        if (scanner2.hasNextInt()){
            p2T2Frags = scanner2.nextInt();
        } else {
            System.out.println(error + " №2 команди " + teamTwoName);
            System.exit(0);
        }

        System.out.print("Гравець №3: ");
        if (scanner2.hasNextInt()){
            p3T2Frags = scanner2.nextInt();
        } else {
            System.out.println(error + " №3 команди " + teamTwoName);
            System.exit(0);
        }

        System.out.print("Гравець №4: ");
        if (scanner2.hasNextInt()){
            p4T2Frags = scanner2.nextInt();
        } else {
            System.out.println(error + " №4 команди " + teamTwoName);
            System.exit(0);
        }

        System.out.print("Гравець №5: ");
        if (scanner2.hasNextInt()){
            p5T2Frags = scanner2.nextInt();
        } else {
            System.out.println(error + " №5 команди " + teamTwoName);
            System.exit(0);
        }

        int resultT1 = p1T1Frags + p2T1Frags + p3T1Frags + p4T1Frags + p5T1Frags;
        int resultT2 = p1T2Frags + p2T2Frags + p3T2Frags + p4T2Frags + p5T2Frags;

        avgT1 = resultT1 / 5.0;
        avgT2 = resultT2 / 5.0;

        System.out.println();

        if (avgT1 > avgT2) {
            System.out.println("Перемогла команда " + teamOneName + " набрала " + resultT1 + " очків.");
        } else if (avgT1 < avgT2) {
            System.out.println("Перемогла команда " + teamTwoName + " набрала " + resultT2 + " очків.");
        } else {
            System.out.println("Нічия, команди набрали порівну, " + resultT1 + " очок.");
        }

    }
}
