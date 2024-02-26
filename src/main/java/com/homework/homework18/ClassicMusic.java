package com.homework.homework18;

public class ClassicMusic extends MusicStyles {
    String classicMusicBand;

    public ClassicMusic(String classicMusicBand) {
        this.classicMusicBand = classicMusicBand;
    }

    @Override
    public void playMusic() {
        System.out.println("Play Classic music from the " + classicMusicBand + " music band.");
    }
}