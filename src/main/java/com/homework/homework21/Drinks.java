package com.homework.homework21;

public class Drinks {
    public static final double coffeePrice = 3.0;
    public static final double teaPrice = 2.5;
    public static final double lemonadePrice = 4.5;
    public static final double mojitoPrice = 4.75;
    public static final double mineralWaterPrice = 1.0;
    public static final double cocaColaPrice = 3.0;

    public static int totalOrderedDrinks = 0;
    public static double totalPrice = 0.0;



    public static void calculateOrderedDrinks(DrinksMachine drinkType) {

        String hotWater = "hot water";
        String coldWater = "cold water";
        String coffee = "ground coffee beans";
        String tea = "tea leaves";
        String lemons = "slices of lemon";
        String limes = "slices of lime";
        String mintLeaves = "mint leaves";
        String sugar = "sugar";
        String iceCubes = "ice cubes";
        String minerals = "mineral water";
        String cocaColaCan = "Coca-Cola";

        switch (drinkType) {
            case COFFEE:
                System.out.println("Preparing Coffee by mixing " + hotWater + ", " + coffee + " and " + sugar);
                break;
            case TEA:
                System.out.println("Preparing Tea by mixing " + hotWater + " and " + tea);
                break;
            case LEMONADE:
                System.out.println("Preparing Lemonade by mixing " + coldWater + ", " + lemons + ",  " + mintLeaves
                        + " and " + iceCubes);
                break;
            case MOJITO:
                System.out.println("Preparing Mojito by mixing " + coldWater + ",  " + limes + ",  " + mintLeaves
                        + " and " + iceCubes);
                break;
            case MINERAL_WATER:
                System.out.println("Preparing mineral water by mixing " + coldWater + " and " + minerals);
                break;
            case COCA_COLA:
                System.out.println("Preparing Coca-Cola by opening " + cocaColaCan + " and mixing with " + iceCubes);
                break;
            default:
                System.out.println("No drink have been ordered :(");
                break;
        }
        totalOrderedDrinks++;
    }

    public static void calculateTotalOrderPrice(DrinksMachine drinkType) {
        switch (drinkType) {
            case COFFEE:
                totalPrice = totalPrice + coffeePrice;
                break;
            case TEA:
                totalPrice = totalPrice + teaPrice;
                break;
            case LEMONADE:
                totalPrice = totalPrice + lemonadePrice;
                break;
            case MOJITO:
                totalPrice = totalPrice + mojitoPrice;
                break;
            case MINERAL_WATER:
                totalPrice = totalPrice + mineralWaterPrice;
                break;
            case COCA_COLA:
                totalPrice = totalPrice + cocaColaPrice;
                break;
        }
    }

    public static void displayPayment() {
        System.out.println("Total prepared drinks: " + totalOrderedDrinks);
        System.out.println("Total price: " + totalPrice);
    }
}

//#2 Зробіть клас Drinks, де константами задайте ціну напою;
//#3 Зробіть підрахунок кількості виготовлен0o9их напоїв та загальної суми, яку повинен заплатити клієнт;
//#4 Зробіть спосіб приготування кожного напою;