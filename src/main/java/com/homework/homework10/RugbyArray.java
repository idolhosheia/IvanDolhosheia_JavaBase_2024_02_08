package com.homework.homework10;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RugbyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] agesTeamOne = generateAge(25);
        int[] agesTeamTwo = generateAge(25);

        System.out.println("Enter the name of the first Rugby team: ");
        String nameTeamOne = scanner.nextLine();
        System.out.print("Ages of players: ");
        displayAges(agesTeamOne);
        double avgAgeTeamOne = calculateAverage(agesTeamOne);
        System.out.println("\nAverage age of players from the " + nameTeamOne + " team is: " + avgAgeTeamOne);

        System.out.println("\nEnter the name of the second Rugby team: ");
        String nameTeamTwo = scanner.nextLine();
        System.out.print("Ages of players: ");
        displayAges(agesTeamTwo);
        double avgAgeTeamTwo = calculateAverage(agesTeamTwo);
        System.out.println("\nAverage age of players from the " + nameTeamTwo + " team is: " + avgAgeTeamTwo);
    }

    private static int[] generateAge(int numPlayers) {
        int[] array = new int[numPlayers];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(18, 41);
        }
        return array;
    }

    private static void displayAges(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]);
            if (i != ages.length - 1) {
                System.out.print(" ");
            }
        }
    }

    private static double calculateAverage(int[] ages) {
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        double average = (double) sum / ages.length;
        return average;
    }
}