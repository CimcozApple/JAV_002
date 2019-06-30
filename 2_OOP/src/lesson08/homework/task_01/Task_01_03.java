package lesson08.homework.task_01;

import java.util.Scanner;

/*
* 1.3.
* Напишите консольное приложение,
* которое вызывает метод для построения пирамиды высотой в диапазоне от 1 по 9.
* Например, для высоты = 4:
*    1
*   121
*  12321
* 1234321
* */
public class Task_01_03 {
    public static void main(String [] args) {
        createPyramidForMe(getUserValueFromConsole());
    }

    public static int getUserValueFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your pyramid height: ");
        int userPyramid = scanner.nextInt();
        return userPyramid;
    }

    public static void createPyramidForMe(int value) {
        for (int i = 1; i <= value; i++) { // общий цикл
            for (int k = value - 1; k >= i; k--) { // цикл делает пробелы
                System.out.print(" ");
            }

            for (int a = 1; a <= i; a++) { // цикл добавляет числа
                System.out.print(a);
                if (a == i & a > 1) { // цикл считает обратные числа от последнего посчитанного числа
                    for (int b = a - 1; b >= 1; b--) {
                        System.out.print(b);
                    }
                }
            }
            System.out.println(); // новый абзац
        }
    }
}