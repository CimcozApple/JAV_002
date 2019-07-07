package lesson03;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 11
* Создать массив из N элементов целых чисел,
* заполнить случайными значениями от 0 до 100,
* поменять местами первый и последний элемент.
* */
public class HomeTask02 {
    public static void main(String [] args) {
        System.out.println("START\n- - - - -");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int a = scanner.nextInt();

        int [] b = new int [a];
        System.out.println("Ваш пустой массив: " + Arrays.toString(b));

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        System.out.println("Ваш заполненный массив: " + Arrays.toString(b));

        // было
        // b[0] = 40
        // b[a - 1] = 70
        // стало
        // b[0] = 70
        // b[a - 1] = 40
        if (b[0] > 0 & b[a - 1] < 100) {
            b[0] = b[0] + b[a - 1]; // 40 + 70 = 110
            b[a - 1] = b[0] - b[a - 1]; // 110 - 70 = 40
            b[0] = b[0] - b[a - 1]; // 70
        }
        System.out.print("Первый и последний элемент поменяны местами: " + Arrays.toString(b));
        System.out.println("\n- - - - -\nEND");
    }
}