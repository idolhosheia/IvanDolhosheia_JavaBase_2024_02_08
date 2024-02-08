package com.homework.homework04;

public class ChineseDynasties {

    public static void main(String[] args) {
        int warriorLee = 13;
        int archerLee = 24;
        int horsemanLee = 46;
        int eachMilitaryUnitLee = 860;

        int warriorMin = 9;
        int archerMin = 35;
        int horsemanMin = 12;
        int eachMilitaryUnitMin = (int) (eachMilitaryUnitLee * 1.5);

        int attackRateLee = totalAttackRate(eachMilitaryUnitLee, warriorLee, archerLee, horsemanLee);
        System.out.println("Total attack rate of Lee Dynasty = " + attackRateLee);
        int attackRateMin = totalAttackRate(eachMilitaryUnitMin, warriorMin, archerMin, horsemanMin);
        System.out.println("Total attack rate of Min Dynasty = " + attackRateMin);
    }

    private static int totalAttackRate(int eachMilitaryUnit, int warrior, int archer, int horseman) {
        return eachMilitaryUnit * (warrior + archer + horseman);
    }
}
