package com.hillel.hajdych.homework.HW15;

public class PopMusic extends MusicStyles {

    private String nameOfBand;

    public PopMusic(String nameOfBand) {
        this.nameOfBand = nameOfBand;
    }

    @Override
    void playMusic() {
        System.out.println("Грає поп-музика, " + this.nameOfBand);
    }

    public String getNameOfBand() {
        return nameOfBand;
    }

    public void setNameOfBand(String nameOfBand) {
        this.nameOfBand = nameOfBand;
    }
}
