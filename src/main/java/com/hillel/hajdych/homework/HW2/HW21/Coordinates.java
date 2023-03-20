package com.hillel.hajdych.homework.HW2.HW21;

public class Coordinates {
    public static void main(String[] args) {

        int degreeN = 40;
        int minuteN = 41;
        double secondN = 21.2;

        int degreeW = 72;
        int minuteW = 2;
        double secondW = 40.6;

        String nameOfPlace = "Статуя Свободи";
        String locationOfPlace = "Нью-Йок, Сполучені Штати Америки";

        System.out.println(nameOfPlace);
        System.out.println(locationOfPlace);
        System.out.println();
        System.out.println("Координати:");
        System.out.println(degreeN + "\u00B0" + minuteN + "\u2032" + secondN + "\u2033 N ");
        System.out.println(degreeW + "\u00B0" + minuteW + "\u2032" + secondW + "\u2033 W");
    }
}
