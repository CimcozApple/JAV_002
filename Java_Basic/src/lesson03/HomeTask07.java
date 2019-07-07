package lesson03;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 16
* Вывести массив в консоль
* и вывести его наоборот,
* не используя Arrays.toString().
* */
public class HomeTask07 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of your array: ");
        int userSize = scanner.nextInt();
        int [] array = new int [userSize];
        System.out.print("Your empty array: " + Arrays.toString(array));
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print("Your filled array: " + Arrays.toString(array));

        System.out.println();
        System.out.print("Your reversed array: [");
        for (int k = userSize - 1; k >= 1; k--) {
            System.out.print(array[k] + ", ");
            if (k == 1) {
                k--;
                System.out.print(array[k] + "");
                break;
            }
        }
        System.out.print("]");
    }
}