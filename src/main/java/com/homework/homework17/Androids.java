package com.homework.homework17;

public class Androids extends LinuxOS implements Smartphones {
    @Override
    public void call() {
        System.out.println("Android: make a call");
    }

    @Override
    public void sms() {
        System.out.println("Android: send an sms");
    }

    @Override
    public void internet() {
        System.out.println("Android: connect to the internet");
    }
}