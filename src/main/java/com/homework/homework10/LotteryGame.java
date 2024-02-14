package com.homework.homework10;

import java.util.Arrays;
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
    }

    private static int[] generate(int sizeOne) {
        int[] array = new int[sizeOne];
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


//        Done Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//
//        Done Перший масив - це числа, які загадані фірмою-організатором лотереї.
//
//        Done Другий масив - це числа, які вгадав гравець.
//
//        Done Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//
//        У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//
//        first[3] повинен дорівнювати second[3], як показано нижче.
//
//        Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//
//        [0, 1, 4, 5, 5, 8, 9]
//
//        [1, 1, 2, 3, 5, 6, 9]
//
//        Кількість збігів: 3

