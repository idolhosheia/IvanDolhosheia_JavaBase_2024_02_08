package com.homework.homework17;

public class SmartphonesDemo {
    public static void main(String[] args) {
        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();

        iPhones iPhones = new iPhones();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
    }
}