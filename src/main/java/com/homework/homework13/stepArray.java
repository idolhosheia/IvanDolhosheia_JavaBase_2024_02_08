package com.homework.homework13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static com.homework.homework13.stepArray1.printMatrix;

public class stepArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the matrix from the user
        System.out.print("Enter the number of rows (N): ");
        int rows = scanner.nextInt();
        System.out.print("Enter the maximum number of elements in a row (M): ");
        int maxRowElements = scanner.nextInt();

        Random random = new Random();

        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int rowElements = random.nextInt(maxRowElements + 1); // 0 <= rowElements < maxRowElements
            matrix[i] = new int[rowElements];
            for (int j = 0; j < rowElements; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(0, rows * rowElements);
            }
        }

//        System.out.println("Matrix N*M: ");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        scanner.close();


        System.out.println("Matrix N*M:");
        printMatrix(matrix);

        System.out.println("\n Sorted Matrix N*M:");
        printMatrix(sortRows(matrix));

//        System.out.println("The total sum of all elements:");
//        printMatrix(sumElements(matrix));
//
//        scanner.close();
    }

//    private static int[][] sumElements(int[][] matrix) {
//        int sumElements = 0;
//        for (int i = 0; i < matrix.length; i++) {
//
//            sumElements++;
//
//        }
//        return matrix;
//    }

    public static int[][] sortRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                Arrays.sort(matrix[i]);
            } else {
                Arrays.sort(matrix[i]);
                reverse(matrix[i]);
            }
        }
        return matrix;
    }

    public static void reverse(int[] matrix) {
        int start = 0;
        int end = matrix.length - 1;
        while (start < end) {
            int temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }
    }
}