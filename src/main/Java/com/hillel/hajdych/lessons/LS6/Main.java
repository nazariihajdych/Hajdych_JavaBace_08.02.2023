package com.hillel.hajdych.lessons.LS6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[5];

//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;

//        System.out.println(Arrays.toString(array)); // виведення масиву
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        //довжина масиву
//        System.out.println(array.length);


        //заповнення масиву
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//            System.out.println(array[i]);
//        }


//        варіант ініціалізації масиву
//        int[] array2 = {1, 2, 3, 4, 5};
//        int[] array3 = new int[] {1, 2, 3, 4, 5};
//        int array4 [] = new int[] {1, 2, 3, 4, 5}; // не дуже хороший варіант
//        int[] array5; // виділяється памʼять в стеці але в хіпі комірки не виділяються. Змінна зберігає null
//        int[] array6 = null;
//
//        //перевірка чи масив проініціалізований
//        if (array6 != null){
//            System.out.println(array6[0]);
//        }



// задачка про вибір найбільшого числа і позиції
//        int[] array7 = new int[10];
//
//        for (int i = 0; i < array7.length; i++) {
//            array7[i] = (int) (Math.random() * 101);
//            System.out.print( array7[i] + ", ");
//        }
//
//        int max = array7[0];
//        int position = 1;
//        for (int i = 0; i < array7.length; i++) {
//
//            if (max < array7[i]){
//                max = array7[i];
//                position = i + 1;
//            }
//
//        }
//        System.out.println();
//        System.out.println("max value = " + max + " position = " + position);

// пошук у масиві

//        int[] number = {1, 2, 8, 6, 3, 4, 5, 7};
//        int element = 8;
//        int index = -1;
//
//        for (int i = 0; i < number.length; i++) {
//            if (element == number[i]){
//                index = i;
//                break;
//            }
//
//        }
//
//        System.out.println(index);

        // копіювання масиву

//        int[] array1 = {1, 2, 3, 4, 5, 6};
//        int[] array2 = new int[array1.length];
//
//        for (int i = 0; i < array1.length; i++) {
//            array2[i] = array1[i];
//        }
//
//        array2[0] = 123;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));

// копіювання готовий метод
//        int[] array1 = {1, 2, 3, 4, 5, 6};
//        int[] array2 = Arrays.copyOf(array1, array1.length); // Скільки потрібно скопіювати елементів? , більше ніж є заповнює 0;
//        int[] array4 = Arrays.copyOfRange(array1, 3, 5);
//
//        int[] array3 = new int[array1.length];
//        System.arraycopy(array1, 3, array3, 2, 2);









    }
}
