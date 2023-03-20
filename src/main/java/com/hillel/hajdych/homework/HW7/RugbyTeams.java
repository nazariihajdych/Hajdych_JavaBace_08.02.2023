package com.hillel.hajdych.homework.HW7;

import java.util.Arrays;

public class RugbyTeams {
    public static void main(String[] args) {

        int[] teamOne = new int[25];
        int[] teamTwo = new int[25];

        int min = 18;
        int max = 40;

        int sumTeamOne = 0, sumTeamTwo = 0;

        for (int i = 0; i <teamOne.length ; i++) {
            teamOne[i] =  min + (int) (Math.random() * (max - min + 1));
            teamTwo[i] =  min + (int) (Math.random() * (max - min + 1));

            sumTeamOne += teamOne[i];
            sumTeamTwo += teamTwo[i];
        }

        System.out.println("Вік гравців першої команди: ");
        System.out.println(Arrays.toString(teamOne));
        System.out.println("Середній вік першої команди: " + Math.round((double)  sumTeamOne / teamOne.length) + ";");
        System.out.println();
        System.out.println("Вік гравців другої команди: ");
        System.out.println(Arrays.toString(teamTwo));
        System.out.println("Середній вік другої команди: " + Math.round((double) sumTeamTwo / teamTwo.length) + ";");

    }
}
