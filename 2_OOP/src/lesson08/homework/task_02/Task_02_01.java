package lesson08.homework.task_02;

import java.util.Arrays;
import java.util.Scanner;

/*
* 2.1.
* Напишите консольное приложение,
* которое обрабатывает квадратную матрицу согласно варианта (таблица 1).
* Требования:
* -значения элементов матрицы задаются с помощью генератора случайных чисел,
* матрица должна содержать как положительные, так и отрицательные значения
* -дополнительные данные (при необходимости) для обработки матрицы тоже задаются генератором случайных чисел
* -для проверки результата работы, нужно вывести матрицу исходную и после обработки
* */
public class Task_02_01 {
    public static void main(String [] args) {
//        getMatrixWithRandomValues(5, 5); // for test
        getMatrixWithRandomValues(userValueFromConsole(), userValueFromConsole());
    }

    public static int userValueFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Strings and Columns: ");
        int user = scanner.nextInt();
        return user;
    }

    public static void getMatrixWithRandomValues(int nStrings, int nColumns) {
        int [] [] aDoubleMatrix = new int [nStrings] [nColumns];
        int [] [] aDoubleMatrix2 = new int [nStrings] [nColumns];

        // вывод пустого "матричного" массива
        for (int i = 0; i < nStrings; i++) {
            for (int a = 0; a < nColumns; a++) {
                System.out.print(aDoubleMatrix[i][a] + " ");
                if (a == nColumns - 1) {
                    System.out.println();
                }
            }
        }

        // заполнения массива
        for (int i = 0; i < nStrings; i++) {
            for (int a = 0; a < nColumns; a++) {
                aDoubleMatrix[i][a] = (int) (Math.random() * 100 - 25); // [i] - строка, [a] - колонка
            }
        }
        System.out.println(Arrays.deepToString(aDoubleMatrix));
        System.out.println("- - - - -");

        // вывод полного "матричного" массива
        for (int i = 0; i < nStrings; i++) {
            for (int a = 0; a < nColumns; a++) {
                System.out.print(aDoubleMatrix[i][a] + " ");
                if (a == nColumns - 1) {
                    System.out.println();
                }
            }
        }

        System.out.println("- - - - -");

        // обрабатываем матрицу - В СТАДИИ ДОРАБОТКИ!
        for (int i = 0; i < nStrings; i++) {
            for (int a = 0; a < nColumns; a++) {
                aDoubleMatrix2[i][a] = aDoubleMatrix[i][a];
//                aDoubleMatrix[i][a] = aDoubleMatrix2[i][a + 1];
                System.out.println("2: " + Arrays.deepToString(aDoubleMatrix2));
            }
        }
        System.out.println(Arrays.deepToString(aDoubleMatrix));
    }
}