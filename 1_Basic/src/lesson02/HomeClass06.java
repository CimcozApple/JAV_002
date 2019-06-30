package lesson02;

import java.util.Scanner;

/*
* Высокосный год
* Пользователь вводит год,
* определить является ли он високосным,
* год является високосным в двух случаях:
* -либо он кратен 4, но при этом не кратен 100,
* -либо кратен 400
* Пример:
* 2014
* Невисокосный
 * */
public class HomeClass06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any year: ");
        int year = scanner.nextInt();

        if (year >= 0) {
            if (year % 4 == 0) {
                System.out.println("Leap year (has 366 days)");
            } else {
                System.out.println("Not leap year (has 365 days)");
            }
        } else {
            System.out.println("Booooom!");
        }
    }
}