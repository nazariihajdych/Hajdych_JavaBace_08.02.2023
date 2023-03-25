package com.hillel.hajdych.homework.HW18;

public class MainArrayMethods {
    public static void main(String[] args) {

        int[] array1 = {2, 4, 6, 10, 33, 1, 12, 24};

        int[][] arraySqrt = {
                {1, 2, 4},
                {2, 1, 7},
                {3, 5, 1}
        };

        int[][] arrayNoSqrt = {
                {1, 2, 4},
                {2, 1, 7}
        };

        System.out.println("Середнє фрифметичне:" + avgArray(array1));
        System.out.println();
        printSqrtMatrix(arraySqrt);
        System.out.println();
        printSqrtMatrix(arrayNoSqrt);

    }

    static double avgArray(int[] array) {

        if (array == null) return -2;
        if (array.length == 0) return -1;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    static int sqrtMatrix(int[][] array) {

        if (array == null) return -2;
        if (array.length == 0) return -1;

        int size = array.length;

        for (int i = 0; i < array.length; i++) {
            if(size != array[i].length)
                return 0;
        }
        return 1;
    }

    private static void printSqrtMatrix(int[][] array) {
        if (sqrtMatrix(array) == 1) {
            System.out.println("Матриця квадратна");
        } else if (sqrtMatrix(array) == 0) {
            System.out.println("Матриця не є квадратною");
        } else {
            System.out.println("Матриця не проініціалізована або є порожньою");
        }
    }
}
