package com.homework.homework15;

public class Burgers {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("The standard burger has ingredients: " + bun + ", " + meat
                + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

    public Burgers(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("The dietary burger has ingredients: " + bun + ", " + meat
                + ", " + cheese + ", " + greens);
    }

    public Burgers(String bun, String meat, int multiplier, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("The double meat burger has ingredients: " + bun + ", " + multiplier + "x " + meat
                + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }
}

//System.out.println("The standard burger has ingredients: " + bun + ", " + meat
//                + ", " + cheese + ", " + greens + ", " + mayonnaise);
