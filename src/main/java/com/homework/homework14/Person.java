package com.homework.homework14;

public class Person {
    String name;
    String surname;
    String city;
    int phoneNum;

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Tony";
        person1.surname = "Kark";
        person1.city = "California";
        person1.phoneNum = 2129704133;
        person1.personInfo();

        Person person2 = new Person();
        person2.name = "Thor";
        person2.surname = "Odinson";
        person2.city = "Asgard";
        person2.phoneNum = 1111111111;
        person2.personInfo();

        Person person3 = new Person();
        person3.name = "Bruce";
        person3.surname = "Wayne";
        person3.city = "Gotham";
        person3.phoneNum = 555557746;
        person3.personInfo();
    }

    public void personInfo(){
        System.out.println("You may contact " + name + " " + surname + " from city of "
                + city + " using the phone number " + phoneNum);
    }
}