package com.homework.homework10;

import java.util.Scanner;

public class RugbyArrayTest {
    public static void main(String[] args) {
        Scanner scanTeamOneName = new Scanner(System.in);
        System.out.println("Enter the name of the first Rugby team: ");
        String scanTeamOne = scanTeamOneName.nextLine();
        int sumAgeTeamOne = 0;
        int maxPlayersTeamOne = 25;
        for (int i = 1; i <= maxPlayersTeamOne; i++) {
            System.out.println("Enter the age of the player " + i + " from the team " + scanTeamOne + ": ");
            int agePlayerTeamOne = scanTeamOneName.nextInt();
            sumAgeTeamOne += agePlayerTeamOne;
        }
        double avgAgeTeamOne = (double) sumAgeTeamOne / maxPlayersTeamOne;
        System.out.println("The average age of the team " + scanTeamOne + " is: " + avgAgeTeamOne);

        Scanner scanTeamTwoName = new Scanner(System.in);
        System.out.println("Enter the name of the second Rugby team: ");
        String scanTeamTwo = scanTeamTwoName.nextLine();
        int sumAgeTeamTwo = 0;
        int maxPlayersTeamTwo = 25;
        for (int i = 1; i <= maxPlayersTeamTwo; i++) {
            System.out.println("Enter the age of the player " + i + " from the team " + scanTeamTwo + ": ");
            int agePlayerTeamTwo = scanTeamTwoName.nextInt();
            sumAgeTeamTwo += agePlayerTeamTwo;
        }
        double avgAgeTeamTwo = (double) sumAgeTeamTwo / maxPlayersTeamTwo;
        System.out.println("The average age of the team " + scanTeamTwo + " is: " + avgAgeTeamTwo);
    }
}