package com.hillel.hajdych.homework.HW15;

public class MainMusic {
    public static void main(String[] args) {

        System.out.println("Музичні стилі та виконавці!");

        MusicStyles[] bands = {
                 new PopMusic("The Weekend"),
                 new RockMusic("Rammstein"),
                 new ClassicMusic("Ludwig van Beethoven"),
        };

        printMusic(bands);
        resetBands(bands, "Michael Jackson", "Metallica", "Vivaldi");
        System.out.println();
        printMusic(bands);


    }

    static void printMusic(MusicStyles[] bands){
        for (MusicStyles band: bands) {
            band.playMusic();
        }
    }

    static void resetBands(MusicStyles[] bands, String popBand, String rockBand, String classicComposer){
        for (MusicStyles band: bands) {
            if (band.getClass() == PopMusic.class){
                ((PopMusic) band).setNameOfBand(popBand);
            } else if (band.getClass() == RockMusic.class) {
                ((RockMusic) band).setNameOfBand(rockBand);
            } else if (band.getClass() == ClassicMusic.class) {
                ((ClassicMusic) band).setNameOfBand(classicComposer);
            }
        }
    }
}
