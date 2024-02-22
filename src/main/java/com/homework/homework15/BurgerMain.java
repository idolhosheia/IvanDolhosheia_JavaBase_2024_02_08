package com.homework.homework15;

public class BurgerMain {
    public static void main(String[] args) {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
        Burgers classicBurger = new Burgers("bun", "meat", "cheese", "greens", "mayonnaise");

        // Invoke the constructor with two arguments
        Burgers dietaryBurger = new Burgers("bun", "meat", "cheese", "greens");

        // Invoke the constructor with one argument of
        // type 'Long'.
        Burgers doubleMeatBurger = new Burgers("bun", "meat", 2, "cheese", "greens", "mayonnaise");
    }
}