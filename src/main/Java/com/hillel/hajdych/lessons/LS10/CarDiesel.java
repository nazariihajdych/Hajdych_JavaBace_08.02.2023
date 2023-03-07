package com.hillel.hajdych.lessons.LS10;

public class CarDiesel extends Car{

    public CarDiesel(String modelName) {
        super(modelName);
    }

    double dieselStatus;

    void fuelStatus(){
        System.out.println(dieselStatus);
    }

    @Override
    void start(){
        super.start();
        System.out.println("Plus Diesel" + dieselStatus++);
    }
}
