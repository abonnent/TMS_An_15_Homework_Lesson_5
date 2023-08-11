import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел.
 * 	С помощью циклов "пройти" по всему массиву и увеличить каждый
 * 	элемент на заданное число. Пусть число, на которое будет
 * 	увеличиваться каждый элемент, задается из консоли
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Укажи размерность массива: ");

        int arraySize = console.nextInt();


        int[][][] array = new int[arraySize][arraySize][arraySize];
    }
}
