package com.homework.homework17;

public class iPhones extends iOS implements Smartphones {
    @Override
    public void call() {
        System.out.println("iPhones: make a call");
    }

    @Override
    public void sms() {
        System.out.println("iPhones: send an sms");
    }

    @Override
    public void internet() {
        System.out.println("iPhones: connect to the internet");
    }
}