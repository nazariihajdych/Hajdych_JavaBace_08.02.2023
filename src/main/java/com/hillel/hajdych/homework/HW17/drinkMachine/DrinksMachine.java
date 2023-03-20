package com.hillel.hajdych.homework.HW17.drinkMachine;

public enum DrinksMachine {

    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    MINERAL_WATER("Мінеральна вода"),
    COCA_COLA("Кока Кола");

    private String type;

    DrinksMachine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
