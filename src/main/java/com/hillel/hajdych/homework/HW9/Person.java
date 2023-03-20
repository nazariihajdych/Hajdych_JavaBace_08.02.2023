package com.hillel.hajdych.homework.HW9;


public class Person {
    public static void main(String[] args) {

        String[][] personData = {
                {"Назарій", "Валерій", "Василь"},
                {"Гайдич", "Джонсонюк", "Пипка"},
                {"Івно-Франківськ", "Лондони", "Тернопіль"},
                {"098-234-67-78", "068-342-34-45", "097-324-34-67"}
        };

        for (int j = 0; j < personData.length - 1; j++) {
            System.out.println(personInfo(personData[0][j], personData[1][j], personData[2][j], personData[3][j]));
        }
    }

    static String personInfo(String name, String surname, String city, String phoneNumb) {
       String info = "Зателефонувати громадянину " + name + " " + surname +
               " із міста " + city + " можна за номером - " + phoneNumb + ";";
        return info;
    }

}
