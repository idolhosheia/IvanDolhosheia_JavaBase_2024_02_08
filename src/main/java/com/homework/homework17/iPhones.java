package com.homework.homework17;

public class iPhones implements iOS, Smartphones {

    private String name;
    private String model;
    private int year;

    public iPhones(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    @Override
    public void call(int phoneNumber) {
        System.out.println("\niPhone makes a call: " + phoneNumber);
    }

    @Override
    public void sms(int phoneNumber, String smsMessage) {
        System.out.println("iPhone sends an sms from number " + phoneNumber + " with text: " + smsMessage);
    }

    @Override
    public void internet() {
        System.out.println("iPhone connects to the internet");
    }

    @Override
    public void appStore() {
        System.out.println("iPhone uses AppStore");
    }

    @Override
    public void faceTime(String contact) {
        System.out.println("iPhone uses facetime to contact: " + contact);
    }

    @Override
    public void iOs() {
        System.out.println("iPhone operates on iOS");
    }
}