package com.hillel.hajdych.homework.HW16;

public interface Smartphones {
    void call();
    void sms();
    default void internet(){
        System.out.println("Немає доступу в інтернет, поповніть рахунок!");
    }
}
