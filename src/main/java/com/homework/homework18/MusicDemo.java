package com.homework.homework18;

public class MusicDemo {
    public static void main(String[] args) {
        PopMusic popMusic = new PopMusic("'Red Hot Chili Peppers'");
        RockMusic rockMusic = new RockMusic("'Miracle of sound'");
        ClassicMusic classicMusic = new ClassicMusic("'The Beatles'");

        MusicStyles[] musicBands = {popMusic, rockMusic, classicMusic};
        for (MusicStyles i : musicBands) {
            i.playMusic();
        }
    }
}