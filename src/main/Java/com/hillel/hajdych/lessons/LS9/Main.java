package com.hillel.hajdych.lessons.LS9;

public class Main {
    public static void main(String[] args) {

        Person naz = new Person();

        naz.name = "Nazar";
        naz.age = 24;

        System.out.println(naz.getAge());
        naz.sayHallo();

    }
}
