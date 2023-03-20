package com.hillel.hajdych.homework.HW17.variant2;

public class Drinks {

    private static int counter = 0;
    private static double total;

    public Drinks(DrinksMachine userChoice) {
        counter++;
        switch (userChoice){
            case COFFEE:{
                total += coffeePrice;
                break;
            }
            case TEA:{
                total += teaPrice;
                break;
            }
            case LEMONADE:{
                total += lemonadePrice;
                break;
            }
            case MOJITO:{
                total += mojitoPrice;
                break;
            }
            case MINERAL_WATER:{
                total += mineralWaterPrice;
                break;
            }
            case COCA_COLA:{
                total += cocaColaPrice;
                break;
            }
        }
    }

    private static final double coffeePrice = 30.75;
    private static final double teaPrice = 15;
    private static final double lemonadePrice = 26.25;
    private static final double mojitoPrice = 20.5;
    private static final double mineralWaterPrice = 10;
    private static final double cocaColaPrice = 17.25;


    public static int getCounter() {
        return counter;
    }

    public static double getTotal() {
        return total;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    public double getTeaPrice() {
        return teaPrice;
    }

    public double getLemonadePrice() {
        return lemonadePrice;
    }

    public double getMojitoPrice() {
        return mojitoPrice;
    }

    public double getMineralWaterPrice() {
        return mineralWaterPrice;
    }

    public double getCocaColaPrice() {
        return cocaColaPrice;
    }
}
