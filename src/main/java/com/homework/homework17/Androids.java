package com.homework.homework17;

public class Androids implements LinuxOS, Smartphones {

    private String name;
    private String model;
    private int year;

    public Androids(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    @Override
    public void call(int phoneNumber) {
        System.out.println("Android: make a call: " + phoneNumber);
    }

    @Override
    public void sms(int phoneNumber, String smsMessage) {
        System.out.println("Android: send an sms from number " + phoneNumber + " with text: " + smsMessage);
    }

    @Override
    public void internet() {
        System.out.println("Android: connect to the internet");
    }

    @Override
    public void linuxOs() {
        System.out.println("Android operates on LinuxOS");
    }
}