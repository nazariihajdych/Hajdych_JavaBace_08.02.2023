package com.hillel.hajdych.homework.HW2.HW22;

public class Paralelogram {
    public static void main(String[] args) {

        int sideA = 15;
        int sideB = 21;
        int sideC = 17;
        int volume, length;


        volume = sideA * sideB * sideC;

        length = (sideA * 4) + (sideB * 4) + (sideC * 4);

        System.out.println("Дано: ");
        System.out.println("Паралелограм зі сторонами: a = " + sideA +
                            " b = " + sideB + " c = " + sideC + ";");
        System.out.println("Знайти: ");
        System.out.println("Обʼєм - V, Сума довжин ребер - L;");
        System.out.println();

        System.out.println("V = a * b * c");
        System.out.println("V = " + sideA + " * " + sideB + " * " + sideC);
        System.out.println("V = " + length);
        System.out.println();
        System.out.println("L = (a * 4) + (b * 4) + (c * 4)");
        System.out.println("L = " + length);

    }
}
