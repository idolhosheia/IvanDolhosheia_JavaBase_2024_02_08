package com.homework.homework12;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows (M): ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns (N): ");
        int columns = scanner.nextInt();

        System.out.println("Original matrix: ");
        int[][] matrix = generateMatrix(rows, columns);
        printMatrix(matrix);

        System.out.println("Transpose matrix: ");
        int[][] transposedMatrix = generateTransposedMatrix(matrix);
        printMatrix(transposedMatrix);

    }

    private static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(rows * columns);
            }
        }
        return matrix;
    }

    private static int[][] generateTransposedMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        return transposedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}