package com.homework.homework17;

public class SmartphonesDemo {
    public static void main(String[] args) {
        Androids androids = new Androids("Samsung", "X", 1000);
        androids.call(123123123);
        androids.sms(123123123, "Hello from Android smartphone");
        androids.internet();
        androids.linuxOs();


        iPhones iPhones = new iPhones("iPhone", "Y", 1000);
        iPhones.call(321321321);
        iPhones.sms(321321321, "Hello from iOS smartphone");
        iPhones.internet();
        iPhones.iOs();
    }
}