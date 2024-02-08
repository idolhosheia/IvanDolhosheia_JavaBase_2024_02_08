package com.homework.homework04;

public class ChineseDynasties4 {

    public static void main(String[] args) {
        int eachUnitAmountLee = 860;
        int totalAttackRateLee = eachUnitAmountLee * attackRateLee();
        System.out.println("Total attack rate of Lee Dynasty = " + totalAttackRateLee);
        int totalAttackRateMin = (int) (eachUnitAmountLee * 1.5 * attackRateMin());
        System.out.println("Total attack rate of Min Dynasty = " + totalAttackRateMin);
    }

    private static int attackRateLee() {
        int warriorLee = 13;
        int archerLee = 24;
        int horsemanLee = 46;
        return warriorLee + archerLee + horsemanLee;
    }

    private static double attackRateMin() {
        int warriorMin = 9;
        int archerMin = 35;
        int horsemanMin = 12;
        return warriorMin + archerMin + horsemanMin;
    }
}