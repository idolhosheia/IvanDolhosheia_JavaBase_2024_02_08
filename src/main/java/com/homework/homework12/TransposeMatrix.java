package com.homework.homework12;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanArray = new Scanner(System.in);

        System.out.println("Enter the size of rows (M): ");
        int scanRows = scanArray.nextInt();
        //System.out.println("The size of M axis is: " + scanRows);

        System.out.println("Enter the size of columns (N): ");
        int scanColumns = scanArray.nextInt();
        //System.out.println("The size of N axis is: " + scanColumns);

        int[][] arrayOriginal = new int[scanRows][scanColumns];
        int[][] arrayTranspose = new int[scanColumns][scanRows];

        System.out.println("Original array (M x N): ");
        displayArray(arrayOriginal);

        System.out.println("Transpose array (N x M): ");
        displayArray(arrayTranspose);

        scanArray.close();
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Транспонуйте матрицю M x N.
// Розміри M та N задаються з консолі.
// Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.