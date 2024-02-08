package com.homework.homework04;

public class ChineseDynasties2 {
    public static void main(String[] args) {

        int warriorLee = 13;
        int archerLee = 24;
        int horsemanLee = 46;
        int eachUnitAmountLee = 860;
        System.out.println("Total attack rate of Lee Dynasty = "
                + eachUnitAmountLee * (warriorLee + archerLee + horsemanLee));

        int warriorMin = 9;
        int archerMin = 35;
        int horsemanMin = 12;
        double armyMultiplierMin = 1.5;
        System.out.println("Total attack rate of Min Dynasty = "
                + (int) (eachUnitAmountLee * armyMultiplierMin * (warriorMin + archerMin + horsemanMin)));
    }
}