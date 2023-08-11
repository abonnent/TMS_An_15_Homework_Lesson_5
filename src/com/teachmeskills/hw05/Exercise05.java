package com.teachmeskills.hw05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс запрашивает размер массива
 * Заполняет его целыми числами
 * Выводит диагонали квадрата
 */

public class Exercise05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Укажи размерность массива: ");
        int arraySize = console.nextInt();

        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        int[][] diagonals = new int[2][arraySize];
        for (int i = 0, k = array.length - 1; i < array.length && k >= 0; i++, k--) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    diagonals[0][i] = array[i][j];
                    diagonals[1][i] = array[i][k];
                }
            }
        }

        System.out.println("Исходный массив: " + Arrays.deepToString(array));
        System.out.println("Массив диагоналей: " + Arrays.deepToString(diagonals));
    }
}
