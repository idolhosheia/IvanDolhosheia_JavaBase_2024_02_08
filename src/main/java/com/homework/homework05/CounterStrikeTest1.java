package com.homework.homework05;

import java.util.Scanner;

public class CounterStrikeTest1 {
    public static void main(String[] args) {
        Scanner scanTeam1 = new Scanner(System.in);
        System.out.println("Enter the name of the first team: ");
        String teamName1 = scanTeam1.nextLine();
        int sumFragPlayerTeam1 = 0;
        int maxPlayersTeam1 = 5;
        for (int i = 1; i <= maxPlayersTeam1; i++) {
            System.out.println("Enter the frag number of the player " + i + " from the team " + teamName1 + ": ");
            int fragPlayerTeam1 = scanTeam1.nextInt();
            sumFragPlayerTeam1 += fragPlayerTeam1;
        }

        Scanner scanTeam2 = new Scanner(System.in);
        System.out.println("Enter the name of the second team: ");
        String teamName2 = scanTeam2.nextLine();
        int sumFragPlayerTeam2 = 0;
        int maxPlayersTeam2 = 5;
        for (int i = 1; i <= maxPlayersTeam2; i++) {
            System.out.println("Enter the frag number of the player " + i + " from the team " + teamName2 + ": ");
            int fragPlayerTeam2 = scanTeam2.nextInt();
            sumFragPlayerTeam2 += fragPlayerTeam2;
        }

        double avgSumFragPlayerTeam1 = (double) sumFragPlayerTeam1 / 5;
        double avgSumFragPlayerTeam2 = (double) sumFragPlayerTeam2 / 5;

        if (avgSumFragPlayerTeam1 > avgSumFragPlayerTeam2) {
            System.out.println("The winning team is " + teamName1 + " and has scored " + avgSumFragPlayerTeam1 + " points");
        } else {
            System.out.println("The winning team is " + teamName2 + " and has scored " + avgSumFragPlayerTeam2 + " points");
        }
    }
}