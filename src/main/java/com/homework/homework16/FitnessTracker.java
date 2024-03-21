package com.homework.homework16;

public class FitnessTracker {
    private static final int CURRENT_YEAR = 2024;
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final int phoneNumber;
    private String surname;
    private double weight;
    private String bloodPressure;
    private int stepsWalkedDaily;
    private int age;

    public FitnessTracker(String name, String surname, int birthDay, int birthMonth, int birthYear, String email, int phoneNumber,
                           double weight, String bloodPressure, int stepsWalkedDaily) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = CURRENT_YEAR - this.birthYear;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsWalkedDaily = stepsWalkedDaily;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsWalkedDaily() {
        return stepsWalkedDaily;
    }

    public void setStepsWalkedDaily(int stepsWalkedDaily) {
        this.stepsWalkedDaily = stepsWalkedDaily;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo(){
        System.out.println(
                "\nname: " + name +
                "\nsurname: " + surname +
                "\nbirth day: " + birthDay +
                "\nbirth month: " + birthMonth +
                "\nbirth year: " + birthYear +
                "\nemail: " + email +
                "\nphone number: " + phoneNumber +
                "\nweight, kg: " + weight +
                "\nblood pressure: " + bloodPressure +
                "\nsteps walked daily: " + stepsWalkedDaily +
                "\nage: " + age);
    }
}
