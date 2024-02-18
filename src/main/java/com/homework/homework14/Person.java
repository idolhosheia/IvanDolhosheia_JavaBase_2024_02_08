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
        person2.phoneNum = 1111111111; //01010010 01000001 01010110 01000101 01001110 01010011 - He uses ravens
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


//Зробити клас Person та в ньому метод personInfo()
//На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//Всередині методу формувати рядок у форматі: Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста +
// МІСТО можна за номером + ТЕЛЕФОН
//Метод має повертати String
//У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//Повинен вийти висновок такого типу:
//Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.