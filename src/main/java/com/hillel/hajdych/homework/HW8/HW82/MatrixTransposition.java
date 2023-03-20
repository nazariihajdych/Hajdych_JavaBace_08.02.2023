package com.hillel.hajdych.homework.HW8.HW82;

import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {

        int[] mnVar = new int[2];

        //мінімальне і максимальне значення для рандомного заповнення
        int min = 15;
        int max = 99;

        Scanner scanner = new Scanner(System.in);

        //зчитування розмірності М х N
        //діапазон відкидає відємні значення та 0.
        //верхня границя тільки для нормального відображення в корсолі
        for (int i = 0; i < mnVar.length; i++) {
            char Symb = 'M';
            if (i == 1) Symb = 'N';
            System.out.print("Введіть розмірність матриці " + Symb + " (в діапазоні [1 -> 25]): ");
            if (scanner.hasNextInt()) {
                mnVar[i] = scanner.nextInt();
                scanner.nextLine();
                if (mnVar[i] < 1 || mnVar[i] > 25){
                    System.out.println("Введене число за межеми діапазону від 1 до 25, спробуйте знову!");
                    i--;
                    System.out.println();
                }
            } else {
                System.out.println("Введіть ціле число в діапазоні від 1 до 25;");
                i--;
                System.out.println();
                scanner.nextLine();
            }
        }


        int[][] matrixMN = new int[mnVar[0]][mnVar[1]];
        int[][] transposMatrix = new int[mnVar[1]][mnVar[0]];


        //заповнення матриці рандомними числами
        for (int i = 0; i < matrixMN.length; i++) {
            for (int j = 0; j < matrixMN[i].length ; j++) {
                matrixMN[i][j] = min + ((int) (Math.random() * (max - min + 1)));
            }
        }

        //транспонування матриці
        for (int i = 0; i < matrixMN.length; i++) {
            for (int j = 0; j < matrixMN[i].length; j++) {
                transposMatrix[j][i] = matrixMN[i][j];
            }
        }


        //вивід матриць
        System.out.println();
        System.out.println("Згенерована матриця " + mnVar[0] + "x" + mnVar[1] + " :");
        for (int i = 0; i < matrixMN.length; i++) {
            for (int j = 0; j < matrixMN[i].length; j++) {
                System.out.print(matrixMN[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Транспонована матриця " + mnVar[1] + "x" + mnVar[0] + " :");

        for (int i = 0; i < transposMatrix.length; i++) {
            for (int j = 0; j < transposMatrix[i].length; j++) {
                System.out.print(transposMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
