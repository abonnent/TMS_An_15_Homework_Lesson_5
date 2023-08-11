package com.teachmeskills.hw05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс создаёт трёхмерный массив
 * просит пользователя указать размерность кубического массива
 * выводит заполненный массив, заполенный случайными числами от 0 до 9
 * просит пользователя указать на сколько нужно увеличить каждый элемент массива
 * выводит изменённый массив
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Укажи размерность массива: ");
        int arraySize = console.nextInt();

        int[][][] array = new int[arraySize][arraySize][arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Исходный массив: " + Arrays.deepToString(array));

        System.out.print("На сколько увеличить каждый элемент массива: ");
        int n = console.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] += n;
                }
            }
        }

        System.out.println("Изменённый массив: " + Arrays.deepToString(array));
    }
}
