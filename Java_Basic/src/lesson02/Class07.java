package lesson02;

import java.util.Scanner;

/*
* Ввести переменную с клавиатуры.
* Если четное, то вывести на экран «четное».
* Если нет, то вывести на экран «нечетное».
*
* Целое число делим на два, не целое на два не делится
* */
public class Class07 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * Вариант 1
        * */
//        System.out.print("Введите важе число - ");
//        int value = scanner.nextInt();

        /*
        * Вариант 2
        * */
//        System.out.print("Введите первое число - ");
//        int a = scanner.nextInt();

//        System.out.print("Введите второе число - ");
//        int b = scanner.nextInt();
//        int res = a % b;
//        System.out.println("Результат: " + res);

//        if (value < 0) {
//            System.out.println("Число отрицательное: '" + value + "'");
//        } else if (value == 0) {
//            System.out.println("Не положительное и не отрицательное");
//        } else {
//            System.out.println("Число положительное: ");
//        }

        /*
        * Вариант 3
        * */
        System.out.print("Введите ваше число - ");
        int value2 = scanner.nextInt();
        int res2 = value2 % 2;
        if (res2 == 0) {
            System.out.println("Ваше число четное!");
        } else {
            System.out.println("Ваше число не четное!");
        }
    }
}