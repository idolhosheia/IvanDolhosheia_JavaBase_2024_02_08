package com.homework.homework02;

public class StonehengeCoordinates {
    public static void main(String[] args) {
        String latitudeDms = "51° 10′ 43.84″ N";
        String longitudeDms = "1° 49′ 34.28″ W";
        System.out.println("The coordinates of Stonehenge in degrees, minutes, and seconds (DMS) format:\nlatitude: " + latitudeDms + "\nlongitude: " + longitudeDms);
        double latitudeDd = 51.178_844;
        double longitudeDd = -1.826_323;
        String hemisphereLatitudeDd = "° N";
        String hemisphereLongitudeDd = "° W";
        System.out.println("The coordinates of Stonehenge in decimal degrees (DD) format:\nlatitude: " + latitudeDd + hemisphereLatitudeDd + "\nlongitude: " + longitudeDd + hemisphereLongitudeDd);
    }
}