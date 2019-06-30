package lesson03;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 15
* Создать массив целых (размер c консоли),
* заполнить любыми значениями от 0 до 100,
* вывести на экран первую половину массива.
* */
public class HomeTask06 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of your array: ");
        int sizeFromUser = scanner.nextInt();
        int [] array = new int [sizeFromUser];
        System.out.println("Your empty array: " + Arrays.toString(array));

        int halfOfArray = sizeFromUser / 2;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Your filled array: " + Arrays.toString(array));

        if (halfOfArray % 2 == 0) {
            for (int k = 0; k < array.length - halfOfArray - 1; k++) {
                System.out.print(array[k] + " ");
            }
        } else if (halfOfArray % 2 >= 1) {
            for (int k = 0; k < array.length - halfOfArray; k++) {
                System.out.print(array[k] + " ");
            }
        }
    }
}