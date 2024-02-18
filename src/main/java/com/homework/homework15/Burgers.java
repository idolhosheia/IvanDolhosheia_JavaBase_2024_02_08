//package com.homework.homework15;
//
//public class Burgers {
//    String bun;
//    String meat;
//    String cheese;
//    String greens;
//    String mayonnaise;
//
//    public static void main(String[] args) {
//        Burgers standardBurger = new Burgers();
//        System.out.println(standardBurger);
//
//    }
//
//    Burgers(String bun, String meat, String cheese, String greens, String mayonnaise){
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.mayonnaise = mayonnaise;
//
//        System.out.println("The standard burger has ingredients: " + bun + ", " + meat
//                + ", " + cheese + ", " + greens + ", " + mayonnaise);
//    }
//
//    Burgers(String bun, String meat, String cheese, String greens){
//        this.bun = bun;
//        this.meat = meat;
//        this.cheese = cheese;
//        this.greens = greens;
//
//        System.out.println("The dietary burger has ingredients: " + bun + ", " + meat
//                + ", " + cheese + ", " + greens);
//    }
//
//    Burgers(String bun, String doubleMeat, String cheese, String greens, String mayonnaise){
//        this.bun = bun;
//        this.meat = doubleMeat;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.mayonnaise = mayonnaise;
//
//        System.out.println("The double meat burger has ingredients: " + bun + ", " + doubleMeat
//                + ", " + cheese + ", " + greens + ", " + mayonnaise);
//    }
//}
////done Зробити клас Burger, який матиме поля:
////done булочка, м'ясо, сир, зелень, майонез
////
////Зробити три конструктори, які дозволятимуть робити бургери трьох видів:
////= звичайний бургер (усі компоненти)
////= дієтичний бургер (без майонезу)
////= з подвійним м'ясом
////У кожен конструктор додати виведення в консоль складу даного варіанту бургера
//// ***(при створенні екземпляра бургера, який використовує даний конструктор - буде виводитися в консоль його склад).
////Зробити клас BurgerMain, в якому створити три різні бургери.
//// ***Їхній склад буде автоматично виводитися на екран під час запуску програми.