package com.teachmeskills.hw05;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи размер массива: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        System.out.print("Введи сумму элементов массива, которую нужно найти: ");
        int sum = scanner.nextInt();

        int result = minSubArrayLen(sum, array);
        System.out.println(result);
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= s) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
