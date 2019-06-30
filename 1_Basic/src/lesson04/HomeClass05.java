package lesson04;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 7
* Среднее арифметическое
* Написать класс с методом,
* возвращающий среднее арифметическое значение для всех элементов массива
* Название метода: calcVectorAvg
* Пример:
* calcVectorAvg(int [] vector); // [1234567]
* 14
* */
public class HomeClass05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int userInput = scanner.nextInt();
        int [] array = new int [userInput];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Your filled array: " + Arrays.toString(array));
        System.out.print("Average number of your array: " + calcVectorAvg(array));
    }

    public static int calcVectorAvg(int [] vector) {
        int result = 0;
        int a = 0;

        for (int i = 0; i < vector.length; i++) {
            a = a + vector[i];
        }
        result = a / vector.length;
        return result;
    }
}