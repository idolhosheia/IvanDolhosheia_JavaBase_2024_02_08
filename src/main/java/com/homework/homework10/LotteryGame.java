package com.homework.homework10;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class LotteryGame {
    public static void main(String[] args) {
        int size = 7;
        int[] arrLotteryOrganizingCompanyGuess = generate(size);
        System.out.println("Lottery organizing company guess: ");
        System.out.println(Arrays.toString(bubbleSort(arrLotteryOrganizingCompanyGuess)));
        int[] arrPlayerGuess = generate(size);
        System.out.println("Lottery player guess: ");
        System.out.println(Arrays.toString(bubbleSort(arrPlayerGuess)));

        int count = 0;
        int arrayAmount = 0;
        for (int i = 0; i < arrLotteryOrganizingCompanyGuess.length; i++) {
            for (int j = arrayAmount; j < arrPlayerGuess.length; j++) {
                if (Objects.equals(arrLotteryOrganizingCompanyGuess[i], arrPlayerGuess[i])) {
                    count++;
                    arrayAmount = j;
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println("Amount of matches: " + count);
    }

    private static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }
}

