package com.teachmeskills.hw05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс запрашивает размер массива
 * Заполняет массив случайными числами
 * Сортирует вложенные массивы
 */

public class Exercise06 {
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

        System.out.println("Исходный массив: " + Arrays.deepToString(array));

        int[][] temp = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            temp[i] = array[i];
        }

        System.out.println("Упорядоченный массив: " + Arrays.deepToString(temp));
    }
}
