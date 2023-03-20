package com.hillel.hajdych.homework.HW15;

public class RockMusic extends MusicStyles {

    private String nameOfBand;

    public RockMusic(String nameOfBand) {
        this.nameOfBand = nameOfBand;
    }

    @Override
    void playMusic() {
        System.out.println("Грає рок-музика, " + this.nameOfBand);
    }

    public String getNameOfBand() {
        return nameOfBand;
    }

    public void setNameOfBand(String nameOfBand) {
        this.nameOfBand = nameOfBand;
    }
}
