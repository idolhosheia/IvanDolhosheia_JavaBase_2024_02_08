package com.homework.homework18;

public class PopMusic extends MusicStyles {
    String popMusicBand;

    public PopMusic(String popMusicBand) {
        this.popMusicBand = popMusicBand;
    }

    @Override
    public void playMusic() {
        System.out.println("Play Pop music from the " + popMusicBand + " music band.");
    }
}