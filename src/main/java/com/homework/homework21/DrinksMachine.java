package com.homework.homework21;

public enum DrinksMachine {

    COFFEE("coffee"),
    TEA("tea"),
    LEMONADE("lemonade"),
    MOJITO("mojito"),
    MINERAL_WATER("mineral water"),
    COCA_COLA("Coca-Cola");

    private final String name;

    DrinksMachine(String drinkName){
        this.name = drinkName;
    }

    public String getName() {
        return name;
    }
}
//#1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ