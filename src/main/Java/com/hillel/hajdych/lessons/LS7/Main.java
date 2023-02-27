package com.hillel.hajdych.lessons.LS7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//       int[] array = {2, 4, 5, 8, 1, 2, 9, 3, -2, -9};
//
//       // Сортування бульбашкою
//
//        int counter = 0;
//
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]){ //зміна <, сортування від більшого до меншого
//                    int temp = array[j];
//                    array[j] = array[j +1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(counter);
//
//
//        //Сортування готовиви методами
//        int[] array2 = {2, 4, 5, 8, 1, 2, 9, 3, -2, -9};
//        System.out.println(Arrays.toString(array2));
//        Arrays.sort(array2);
//        System.out.println(Arrays.toString(array2));
//
//        //Реверсне сортування
//        Integer[] array3 = {2, 4, 5, 8, 1, 2, 9, 3, -2, -9};
//        Arrays.sort(array3, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array3));

//        int[][] array = new int[2][3];
//
//        int number = 1;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = number;
//                number++;
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(Arrays.deepToString(array));


        // Задачка шахова дошка
//        char[][] chessBoard = new char[8][8];
//
//        for (int i = 0; i < chessBoard.length; i++) {
//            for (int j = 0; j < chessBoard.length; j++) {
//                if ((i + j) % 2 == 0)chessBoard[i][j] = 'B';
//                else chessBoard[i][j] = 'W';
//            }
//        }
//
//        for (int i = 0; i < chessBoard.length; i++) {
//            for (int j = 0; j < chessBoard[i].length ; j++) {
//                System.out.print(chessBoard[i][j] + " ");
//            }
//            System.out.println();
//        }

        //Зміщення одиниці

//        int[][] array = new int[5][5];

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i == j) array[i][j] = 1;
//            }
//        }

//        for (int i = 0; i < array.length ; i++) {
//            array[i][i] = 1;
//        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if ((i + j) == array.length - 1)array[i][j] = 1;
//            }
//        }

//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            array[i][j] = 1;
//        }

//        for (int i = 0; i < array.length; i++) {
//            array[i][array.length - i - 1] = 1;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        //------------------------------ зубчаті масиви -------------------------------------//

//        int[][] array = {
//                {1},
//                {2,3,6},
//                {},
//                {1,2,3,4,5,6}
//        };
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }


        //---------------трьохвимірний масив-------------------------//

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
