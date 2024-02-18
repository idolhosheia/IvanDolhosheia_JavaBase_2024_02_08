package com.homework.homework14;

public class Person {
    String name;
    String surname;
    String city;
    int phoneNum;


    void personInfo() {
        System.out.println("You may contact " + name + " " + surname + " from city of "
                + city + " using the phone number " + phoneNum);
    }
}