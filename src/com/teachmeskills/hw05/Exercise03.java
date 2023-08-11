package com.teachmeskills.hw05;

import java.util.Arrays;

/**
 * Класс умножает матрицы
 */

public class Exercise03 {
    public static void main(String[] args) {
        int matrixSize = 3;

        int[][] m1 = new int[matrixSize][matrixSize];
        int[][] m2 = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                m1[i][j] = (int) (Math.random() * 2);
                m2[i][j] = (int) (Math.random() * 2);
            }
        }

        int[][] m3 = multiplyMatrices(m1, m2);

        System.out.println("Матрица A: " + Arrays.deepToString(m1));
        System.out.println("Матрица B: " + Arrays.deepToString(m2));
        System.out.println("Матрица C: " + Arrays.deepToString(m3));
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int rows1 = m1.length;
        int cols1 = m1[0].length;
        int rows2 = m2.length;
        int cols2 = m2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += m1[i][k] * m2[k][j];
                }

                result[i][j] = sum;
            }
        }

        return result;
    }
}
