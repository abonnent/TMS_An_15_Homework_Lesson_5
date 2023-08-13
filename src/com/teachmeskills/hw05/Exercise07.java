package com.teachmeskills.hw05;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Допускаются для ввода следующие знаки: (, ], [, )");
        System.out.print("Введите правильную последовательность знаков: ");

        String s = console.nextLine();
        if (isValid(s)) {
            System.out.println("Введена правильная последовательность знаков");
        } else {
            System.out.println("Введённая последовательность неверна");
        }
    }

    public static boolean isValid(String s) {
        int openRound = 0;
        int closeRound = 0;
        int openSquare = 0;
        int closeSquare = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openRound++;
            } else if (c == ')') {
                closeRound++;
                if (closeRound > openRound) {
                    return false;
                }
            } else if (c == '[') {
                openSquare++;
            } else if (c == ']') {
                closeSquare++;
                if (closeSquare > openSquare) {
                    return false;
                }
            }
        }

        return openRound == closeRound && openSquare == closeSquare;
    }
}
