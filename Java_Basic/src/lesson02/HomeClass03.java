package lesson02;

import java.util.Scanner;

/*
* Больший меньший
* Пользователь вводит три числа, вывести на экран большее и меньшее из них в строчку
* Пример:
* 5
* 2
* 7
* 7 2
* */
public class HomeClass03 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите первое число: ");
        int b = scanner.nextInt();

        System.out.print("Введите первое число: ");
        int c = scanner.nextInt();

        if (a < b & c > b & a < c) {
            System.out.println(a + " " + c); // 123
        } else if (a < b & b == c & a < c) {
            System.out.println(a + " " + c); // 122
        } else if (a == b & b < c & a < c) {
            System.out.println(a + " " + c); // 112
        } else if (a > b & b > c & a > c) {
            System.out.println(c + " " + a); // 321
        } else if (a > b & b < c & a == c) {
            System.out.println(b + " " + a); // 212
        } else if (a == b & b > c & a > c) {
            System.out.println(c + " " + a); // 221
        } else if (a < b & b > c & a == c) {
            System.out.println(a + " " + b); // 121
        } else if (a > b & b < c & a < c) {
            System.out.println(b + " " + c); // 213
        } else if (a < b & b > c & a > c) {
            System.out.println(c + " " + b); // 231
        } else if (a == b & a == c) {
            System.out.println(a); // 111
        }
    }
}