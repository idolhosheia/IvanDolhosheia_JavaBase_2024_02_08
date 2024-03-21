package com.homework.homework13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class stepArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (N): ");
        int rows = scanner.nextInt();
        System.out.print("Enter the maximum number of elements in a row (M): ");
        int maxRowElements = scanner.nextInt();

        Random random = new Random();

        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int rowElements = random.nextInt(maxRowElements + 1);
            matrix[i] = new int[rowElements];
            for (int j = 0; j < rowElements; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(0, rows * rowElements);
            }
        }

        System.out.println("Matrix N*M:");
        print(matrix);

        System.out.println("\nSorted Matrix N*M:");
        print(sort(matrix));

        System.out.println("Sum: " + sum(matrix));

        int[] minByRow = findMinByRow(matrix);
        System.out.println("Min value by row: " + toString(minByRow));

        int absoluteMin = min(minByRow);
        System.out.println("Absolute min: " + toString(absoluteMin));

        divide(matrix, absoluteMin);
        print(matrix);

    }

    private static void print(int[][] matrix) {
        System.out.println("[");
        for (int[] row : matrix) {
            System.out.println("\t" + Arrays.toString(row));
        }
        System.out.println("]");
    }

    private static int[][] sort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                sortAscending(matrix[i]);
            } else {
                sortDescending(matrix[i]);
            }
        }
        return matrix;
    }

    public static void sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    public static void sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    private static void swap(int[] array, int index) {
        int tmp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = tmp;
    }

    public static String toString(int number) {
        return number == Integer.MAX_VALUE ? "NOT DEFINED" : String.valueOf(number);
    }

    private static String toString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += toString(array[i]);
            if (i != array.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

//    public static int[][] sortRows(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            if (i % 2 == 0) {
//                Arrays.sort(matrix[i]);
//            } else {
//                Arrays.sort(matrix[i]);
//                reverse(matrix[i]);
//            }
//        }
//        return matrix;
//    }
//
//    public static void reverse(int[] matrix) {
//        int start = 0;
//        int end = matrix.length - 1;
//        while (start < end) {
//            int temp = matrix[start];
//            matrix[start] = matrix[end];
//            matrix[end] = temp;
//            start++;
//            end--;
//        }
//    }

    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }


    public static int[] findMinByRow(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = min(matrix[i]);
        }
        return result;
    }

    private static int min(int[] row) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < row.length) {
            if (min > row[i]) {
                min = row[i];
            }
            i++;
        }
        return min;
    }

    private static void divide(int[][] matrix, int divider) {
        if (divider == 0 || divider == Integer.MAX_VALUE) {
            System.out.println("Can't divide");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] /= divider;
        }
    }
}