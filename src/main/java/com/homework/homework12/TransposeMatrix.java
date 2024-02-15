package com.homework.homework12;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of rows (M): ");
        int rows = scanner.nextInt();
        //System.out.println("The size of M axis is: " + rows);

        System.out.println("Enter the size of columns (N): ");
        int columns = scanner.nextInt();
        //System.out.println("The size of N axis is: " + columns);

        int[][] arrayOriginal = new int[rows][columns];
        int[][] arrayTranspose = new int[columns][rows];

        System.out.println("Original array (M x N): ");
        displayArray(arrayOriginal);

        System.out.println("Transpose array (N x M): ");
        displayArray(arrayTranspose);

        scanner.close();
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