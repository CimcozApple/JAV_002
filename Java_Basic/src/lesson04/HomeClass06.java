package lesson04;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 8
* Сумма нечетных
* Написать метод,
* возвращающий количество нечетных элементов массива
* Название метода: calcNonPairCount
* Пример:
* calcNonPairCount(int [] vector); // [1234567]
* 4
* */
public class HomeClass06 {
    public static void main(String [] args) {
        System.out.println("Amount of odd numbers in array: " + calcNonPairCount(fillArray(getUserInput())));
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of your array: ");
        int userSizeOfArray = scanner.nextInt();
        return userSizeOfArray;
    }

    public static int [] fillArray(int valueFromUser) {
        int [] array = new int [valueFromUser];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Filled array: " + Arrays.toString(array));
        return array;
    }

    public static int calcNonPairCount(int [] vector) {
        int result = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 >= 1) {
                result++;
            }
        }
        return result;
    }
}