package com.hillel.hajdych.homework.HW6.HW61;

public class ShuttleNumbers {
    public static void main(String[] args) {

        int counter = 0;
        int i = 0;

        while (true){
             i++;
             if (i / 10 == 4 || i / 10 == 9 || i % 10 ==4 ||
                i % 10 == 9 || (i / 10) % 10 == 4 || (i / 10) % 10 == 9) continue;

             System.out.print("Шатл № = " + i + "  ");
             if (i < 9) System.out.print("  ");
             if (i > 9 && i < 100) System.out.print(" ");
             if ((counter + 1) % 5 == 0) System.out.println(); // вивід у 5 стовпців
             counter++;
             if (counter == 100) break;
         }
         System.out.println();
         System.out.println( "Всього шатлів відправлено на Марс: " + counter + ";");
    }
}
