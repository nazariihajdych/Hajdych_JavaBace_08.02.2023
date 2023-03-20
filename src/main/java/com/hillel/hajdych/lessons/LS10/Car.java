package com.hillel.hajdych.lessons.LS10;

public class Car {

    public Car(String modelName) {
        this.modelName = modelName;
    }

    String modelName;

    void  start(){
        System.out.println(modelName + " start");
    }

    void stop(){
        System.out.println(modelName + " stop");
    }
}
