package com.homework.homework12;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanMatrix = new Scanner(System.in);

        System.out.println("Enter the size of M axis: ");
        int scanValueM = scanMatrix.nextInt();
        System.out.println("The size of M axis is: " + scanValueM);

        System.out.println("Enter the size of N axis: ");
        int scanValueN = scanMatrix.nextInt();
        System.out.println("The size of N axis is: " + scanValueN);
    }
}