package com.homework.homework16;

public class User {
    public static void main(String[] args) {
        int count = 0;
        FitnessTracker[] fitnessTrackers = {
                new FitnessTracker(
                        "Tony",
                        "Kark",
                        29,
                        5,
                        1970,
                        "(stark@starkenterprises.com",
                        123456789,
                        84.5,
                        "120/80",
                        10000),
                new FitnessTracker(
                        "Natasha",
                        "Romanoff",
                        3,
                        12,
                        1984,
                        "shieldagent1@gmail.com",
                        123456789,
                        59.42,
                        "120/60",
                        15000),
                new FitnessTracker(
                        "Groot",
                        "Groot",
                        31,
                        8,
                        2014,
                        "grootthemighty@gmail.com",
                        123456789,
                        104.67,
                        "120/60",
                        8000),
                new FitnessTracker(
                        "Rocket",
                        "Racoon",
                        3,
                        12,
                        1976,
                        "givemeyourarm@gmail.com",
                        123456789,
                        24.95,
                        "120/60",
                        12000),
                new FitnessTracker(
                        "Thor",
                        "Odinson",
                        1,
                        1,
                        518,
                        "weuseravens@gmail.com",
                        123456789,
                        290.3,
                        "120/80",
                        1000)};
        System.out.println("Initial accounts information: ");
        printInfo(fitnessTrackers);

        FitnessTracker tony = fitnessTrackers[0];
        tony.setBloodPressure("120/80");
        tony.setStepsWalkedDaily(12000);

        FitnessTracker groot = fitnessTrackers[2];
        groot.setWeight(110.89);
        groot.setStepsWalkedDaily(9500);

        FitnessTracker thor = fitnessTrackers [4];
        thor.setStepsWalkedDaily(10000);
        thor.setWeight(300.1);

        System.out.println("\n----------------------------");
        System.out.println("\nUpdated accounts information: ");
        printInfo(fitnessTrackers);

    }

    private static void printInfo(FitnessTracker[] fitnessTrackers) {
        for (FitnessTracker fitnessTracker : fitnessTrackers){
            fitnessTracker.printAccountInfo();
        }
    }
}
