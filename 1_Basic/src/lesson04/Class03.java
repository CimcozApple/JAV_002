package lesson04;

import java.util.Scanner;

/*
 * Task 5 - ДОДЕЛАТЬ!
 * Написать класс определяющий простоту числа:
 * метод int getInt(), считывающий с консоли целое число и возвращающий его,
 * метод boolean isSimple(int k), определяющий простоту числа и возвращающий значение boolean
 * В main считать число (с помощью getInt), передать его методу isSimple и вывести на экран результат.
 * */
public class Class03 {
    public static void main(String [] args) {
        int numberFromUser = getInt();
        boolean isTrueOrFalse = isSimple(numberFromUser);
        System.out.println("Метод 'isSimple' возвращает: " + isTrueOrFalse);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше (натуральное) число: ");
        int a = scanner.nextInt();
        return a;
    }

    public static boolean isSimple(int k) {
        boolean result = false;
//        if (k == 0) {
//            System.out.println("https://www.youtube.com/watch?v=gZA69ipQkJU");
//        } else if (k == 1) {
//            System.out.println("Число '1' не относится ни к простым ни к составным числам!");
//        } else if (k % 2 == 1 | k % 3 == 1) {
//            result = true;
//            System.out.println("Это простое число");
//        } else {
//            System.out.println("Это составное число");
//        }

        for (int i = 2; i <= 9; i++) {
            int x = k % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 3 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 5 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 7 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 12 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 14 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 15 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 16 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 18 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 20 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 21 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 22 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 24 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 25 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 26 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 27 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 28 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 30 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 32 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 33 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 34 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 35 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 36 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 38 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 39 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 2557 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 2383 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 2521 % i;
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            int x = 3569 % i;
            System.out.print(x + " ");
        }


        return result;
    }
}