package com.teachmeskills.hw05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс просит пользователя указать размерность массива
 * Создаётся двумерный массив указанной размерности
 * Заполняется произвольными числами
 * Рассчитывается сумма всех чисел массива
 */

public class Exercise04 {
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

        int sum = 0;
        for (int[] row : array) {
            for (int column : row) {
                sum += column;
            }
        }

        System.out.println("Исходный массив: " + Arrays.deepToString(array));
        System.out.println("Сумма всех элементов: " + sum);
    }
}
