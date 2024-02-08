package com.homework.homework04;

public class ChineseDynasties5 {

    public static void main(String[] args) {
        int AttackRateLee = totalAttackRateLee(860, 1,13, 24, 46);
        System.out.println("Total attack rate of Lee Dynasty = " + AttackRateLee);
        int AttackRateMin = totalAttackRateMin(860, (int) 1.5,9,35,12);
        System.out.println("Total attack rate of Min Dynasty = " + AttackRateMin);
    }

    private static int totalAttackRateLee
            (int eachMilitaryUnitLee, int multiplierLee, int warriorLee, int archerLee, int horsemanLee) {
        return eachMilitaryUnitLee * multiplierLee * (warriorLee + archerLee + horsemanLee);
    }

    private static int totalAttackRateMin
            (int eachMilitaryUnitLee, int multiplierMin, int warriorMin, int archerMin, int horsemanMin) {
        return eachMilitaryUnitLee * multiplierMin * (warriorMin + archerMin + horsemanMin);
    }
}
