package com.hillel.hajdych.homework.HW10.HW102;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String salad;
    String mayo;
    int numberOfMeat;

    public Burger(String bun, String meat, String cheese, String salad, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayo = mayo;

        System.out.println("Звичайний бургер:\n" +  this.bun + "\n" + this.cheese + "\n" + this.meat
                + "\n" + this.mayo + "\n" + this.salad);
    }

    public Burger(String bun, String meat, String cheese, String salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;

        System.out.println("Дієтичний бургер:\n" +  this.bun + "\n" + this.cheese + "\n" + this.meat
                + "\n" + this.salad);
    }

    public Burger(String bun, String meat, String cheese, String salad, String mayo, int numberOfMeat) {

        if (numberOfMeat < 0) numberOfMeat = 0;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayo = mayo;
        this.numberOfMeat = numberOfMeat;

        if (numberOfMeat == 0){
            System.out.println("Вегетиріанський бургер:\n" + this.bun + "\n" + this.cheese + "\n"
                    + this.mayo + "\n" + this.salad);
        } else {
            System.out.println("Бургер з вибором кількості котлетлет:\n" + this.bun + "\n" + this.cheese + "\n"
                    + this.numberOfMeat + " х " + this.meat + "\n" + this.mayo + "\n" + this.salad);
        }
    }
}
