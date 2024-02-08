package com.homework.homework05;

import java.util.Scanner;

public class CounterStrikeTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numFragTeamOne = 0;
        int sumFragTeamOne = 0;
        int enterAmountTeamOne = 0;
        int playerCounterTeamOne = 1;
        int teamCounter = 1;

        System.out.println("Please, enter the name of the team number " + teamCounter + ": ");
        String teamOneName = scanner.nextLine();

        while (enterAmountTeamOne <= 5) {
            System.out.println("Please, enter the number of points of the " + playerCounterTeamOne + " player from the " + teamOneName + " team: ");
            numFragTeamOne = scanner.nextInt();
            sumFragTeamOne = sumFragTeamOne + numFragTeamOne;
            playerCounterTeamOne++;
            enterAmountTeamOne++;
        }
        System.out.println("Sum of frags: " + sumFragTeamOne);
    }

//    public static void calculations() {
//        System.out.println("calculations");
//        double sumNumTeamOne = 1;
//        double sumNumTeamTwo = 1;
//        System.out.println("Max " + Math.max(sumNumTeamOne, sumNumTeamTwo));
//    }
}


//System.out.println("The first team name is: " + team1);
//System.out.println("The number of points of the player Alpha from the " + team1 + " team is: " + number1);

//        System.out.println("Please, enter the number of points of the player Bravo from the " + teamOne + " team: ");
//        int numTeamOnePlayerTwo = scanner.nextInt();
//        System.out.println("Please, enter the number of points of the player Charlie from the " + teamOne + " team: ");
//        int numTeamOnePlayerThree = scanner.nextInt();
//        System.out.println("Please, enter the number of points of the player Delta from the " + teamOne + " team: ");
//        int numTeamOnePlayerFour = scanner.nextInt();
//        System.out.println("Please, enter the number of points of the player Echo from the " + teamOne + " team: ");
//        int numTeamOnePlayerFive = scanner.nextInt();