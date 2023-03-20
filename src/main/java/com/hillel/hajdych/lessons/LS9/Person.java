package com.hillel.hajdych.lessons.LS9;

public class Person {

    String name;
    int age;

    public Person(){

    }

    void sayHallo(){
        System.out.println(name + " say hallo!");
    }

    public  int getAge(){
        return age;
    }

    void increaseAge(){
        age++;
    }

    void demo(){
        String name = "Greg";
        System.out.println(name);
        System.out.println(this.name);
    }




}
