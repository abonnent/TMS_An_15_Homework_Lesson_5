package com.teachmeskills.hw05;

/**
 * Класс выводит шахматную доску
 */

public class Exercise02 {
    public static void main(String[] args) {
        String chessBoard[][] = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if (((i % 2 == 0) && (j % 2 == 0)) || (((i % 2 != 0) && (j % 2 != 0)))) {
                    chessBoard[i][j] = "W";
                } else if (((i % 2 != 0) && (j % 2 == 0)) || ((i % 2 == 0) && (j % 2 != 0))) {
                    chessBoard[i][j] = "B";
                }
            }
        }

        System.out.println("Шахматная доска: ");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }

            System.out.println();
        }
    }
}
