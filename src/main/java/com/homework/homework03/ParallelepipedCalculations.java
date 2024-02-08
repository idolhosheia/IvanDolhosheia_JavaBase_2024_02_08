package com.homework.homework03;

public class ParallelepipedCalculations {
    public static void main(String[] args) {
        int length = 3;
        int width = 4;
        int height = 5;
        int volume = length * width * height;
        System.out.println("Parallelepiped volume = " + volume + " cm^3");
        int sumSideLengths = 4 * (length + width + height);
        System.out.println("Parallelepiped all sides total length = " + sumSideLengths + " cm");
    }
}