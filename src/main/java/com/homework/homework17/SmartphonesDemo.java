package com.homework.homework17;

public class SmartphonesDemo {
    public static void main(String[] args) {
        Androids android = new Androids("Samsung", "X", 1000);
        android.call(123123123);
        android.sms(123123123, "Hello from LinuxOS compatible smartphone");
        android.internet();
        android.linuxOs();
        android.runTerminal();
        android.installPackage("Java Basic");
        android.terminateProcess("Execution of Order 151");
        android.terminateProcessId(151);


        iPhones iPhone = new iPhones("iPhone", "Y", 1000);
        iPhone.call(321321321);
        iPhone.sms(321321321, "Hello from IOS compatible smartphone");
        iPhone.internet();
        iPhone.iOs();
        iPhone.faceTime("Commander Shepard");
        iPhone.appStore();
    }
}