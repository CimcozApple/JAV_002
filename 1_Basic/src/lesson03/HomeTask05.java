package lesson03;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 14
* Создать массив из N элементов,
* заполнив их случайными значениями от 0 до 100,
* найти максимальное значение в массиве.
* */
public class HomeTask05 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of your array: ");
        int userArray = scanner.nextInt();
        int [] array1 = new int [userArray];
        System.out.print("Your empty array: " + Arrays.toString(array1));
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        System.out.println("Your filled array: " + Arrays.toString(array1));

        int a = 0;
        int b = 0;
        int bigNumber = 0;
        for (int i = 0; i < array1.length; i++) {
            a = bigNumber;
            b = array1[i];

            if (i == array1.length) {
                break;
            } else if (a > b) {
                bigNumber = a;
            } else if (a < b) {
                bigNumber = b;
            }
            a = bigNumber;
        }
        System.out.println("Big number of array is: " + a);
    }
}