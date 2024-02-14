package com.homework.homework10;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class LotteryGame {
    public static void main(String[] args) {
        int size = 7;
        int[] arrayLotteryOrganizingCompanyGuess = generate(size);
        System.out.println("Lottery organizing company guess: ");
        System.out.println(Arrays.toString(arrayLotteryOrganizingCompanyGuess));
        int[] arrayPlayerGuess = generate(size);
        System.out.println("Lottery player guess: ");
        System.out.println(Arrays.toString(arrayPlayerGuess));
    }

    private static int[] generate(int sizeOne) {
        int[] array = new int[sizeOne];
        for(int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(0,10);
        }
        return array;
    }
}


//        Done Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//
//        Done Перший масив - це числа, які загадані фірмою-організатором лотереї.
//
//        Done Другий масив - це числа, які вгадав гравець.
//
//        Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
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

