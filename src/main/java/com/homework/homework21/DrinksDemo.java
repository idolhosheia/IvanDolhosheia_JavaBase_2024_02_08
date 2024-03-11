package com.homework.homework21;

import java.util.Scanner;

public class DrinksDemo {

    private static DrinksMachine drinkType;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease, type the drink number you would like to order: ");
        System.out.println("1 - Coffee");
        System.out.println("2 - Tea");
        System.out.println("3 - Lemonade");
        System.out.println("4 - Mojito");
        System.out.println("5 - Mineral water");
        System.out.println("6 - Coca-Cola");
        System.out.println("7 - Go to payment");
//        System.out.println("8 - Exit the menu without order");

        while (true) {
            int drinkChoice = scanner.nextInt();
            switch (drinkChoice) {
                case 1:
                    drinkType = DrinksMachine.COFFEE;
                    break;
                case 2:
                    drinkType = DrinksMachine.TEA;
                    break;
                case 3:
                    drinkType = DrinksMachine.LEMONADE;
                    break;
                case 4:
                    drinkType = DrinksMachine.MOJITO;
                    break;
                case 5:
                    drinkType = DrinksMachine.MINERAL_WATER;
                    break;
                case 6:
                    drinkType = DrinksMachine.COCA_COLA;
                    break;
                case 7:
                    Drinks.displayPayment();
                    break;
//                case 8:
//                    System.out.println("Exit the menu without ordering a drink");
//                    break;
                default:
                    System.out.println("Choose again from the available list, please!");
                    continue;
            }
            Drinks.calculateOrderedDrinks(drinkType);
            Drinks.calculateTotalOrderPrice(drinkType);
        }
    }
}