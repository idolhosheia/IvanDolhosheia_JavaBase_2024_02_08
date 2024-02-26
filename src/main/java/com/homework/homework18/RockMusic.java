package com.homework.homework18;

public class RockMusic extends MusicStyles {
    String rockMusicBand;

    public RockMusic(String rockMusicBand) {
        this.rockMusicBand = rockMusicBand;
    }

    @Override
    public void playMusic() {
        System.out.println("Play Rock music from the " + rockMusicBand + " music band.");
    }
}