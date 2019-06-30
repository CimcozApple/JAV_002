package lesson04;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 0
* Написать метод,
* менияющий местам первые найденные наибольший и наименьший элементы массива,
* (то есть меняем местами самый большой элемент с самым маленьким и всё!)
* название метода: swapMaxMinVector.
* Пример:
* swapMaxMinVector(int [] vector); // [4, 4, 3, 3, 1, 1]
* [1, 4, 3, 3, 4, 1]
* */
public class HomeClass01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш размер массива: ");
        int userSizeOfArray = scanner.nextInt();
        int [] array = new int [userSizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Ваш заполненный массив: " + Arrays.toString(array));

        swapMaxMinVector(array);
    }

    static void swapMaxMinVector(int [] vector) {
        int a = 0;
        int b = 0;
        int min = 0;
        int minIndexOfArray = 0;
        int max = 0;
        int maxIndexOfArray = 0;

        /*
        * Get min value
        * */
        for (int i = 0; i < vector.length; i++) {
            b = vector[i];
            if (a == 0) {
                min = b;
            } else if (b == 0) {
                min = b;
                break; // если индекс получаем "0", выходим их цикла
            } else if (a > b) {
                min = b;
            } else if (a < b) {
                min = a;
            }
            a = min;
        }
        System.out.println("Минимальное значение в массиве: " + min);

        /*
        * Получаем индекс минимального значения
        * */
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == min) {
                minIndexOfArray = i;
            }
        }
        System.out.println("Индекс минимального значения: " + minIndexOfArray);
        System.out.println();

        /*
        * Get max value
        * */
        for (int k = 0; k < vector.length; k++) {
            b = vector[k];
            if (a > b) {
                max = a;
            } else if (a < b) {
                max = b;
            }
            a = max;
        }
        System.out.println("Максимальное значение в массиве: " + max);

        /*
        * Получаем индекс максимального значения
        * */
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == max) {
                maxIndexOfArray = i;
            }
        }
        System.out.println("Индекс максимального значения: " + maxIndexOfArray);

        /*
        * Меняем местами минимальный с максимальным значением
        * */
        vector[minIndexOfArray] = max;
        vector[maxIndexOfArray] = min;
        System.out.println("\nВаш изменённый массив (мин. на место макс. и наоборот): " + Arrays.toString(vector));
    }
}