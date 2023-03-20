package com.hillel.hajdych.lessons.LS10;

public class CarPetrol extends Car{

    public CarPetrol(String modelName) {
        super(modelName);
    }

    double petrolStatus;

    void fuelStatus(){
        System.out.println(petrolStatus);
    }
}
