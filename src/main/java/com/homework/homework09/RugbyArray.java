package com.homework.homework09;

import java.util.Scanner;

public class RugbyArray {
    public static void main(String[] args) {
        Scanner scanTeam1 = new Scanner(System.in);
        System.out.println("Enter the name of the first Rugby team: ");
        int scanTeamOne = scanTeam1.nextInt();
        int sumAgeTeamOne = 0;
        int maxPlayersTeamOne = 10;
        for (int i = 1; i <= maxPlayersTeamOne; i++) {
            System.out.println("Enter the age of the player " + i + " from the team " + scanTeamOne + ": ");
            int fragPlayerTeam1 = scanTeam1.nextInt();
            sumAgeTeamOne += fragPlayerTeam1;
        }
        double avgAgeTeamOne = (double) sumAgeTeamOne / maxPlayersTeamOne;
        System.out.println(avgAgeTeamOne);
    }
}