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
        System.out.println("Android makes a call: " + phoneNumber);
    }

    @Override
    public void sms(int phoneNumber, String smsMessage) {
        System.out.println("Android sends an sms from number " + phoneNumber + " with text: " + smsMessage);
    }

    @Override
    public void internet() {
        System.out.println("Android connects to the internet");
    }

    @Override
    public void linuxOs() {
        System.out.println("Android operates on LinuxOS");
    }

    @Override
    public void runTerminal() {
        System.out.println("Android runs terminal *Beep Boop Bop*: ");
    }

    @Override
    public void installPackage(String packageName) {
        System.out.println("Android installs package: " + packageName);
    }

    @Override
    public void terminateProcess(String processName) {
        System.out.println("Android terminates process name: " + processName);
    }

    @Override
    public void terminateProcessId(int processId) {
        System.out.println("Android on LinuxOS terminates process ID: " + processId);
    }
}