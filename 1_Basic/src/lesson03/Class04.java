package lesson03;

import java.util.Scanner;

/*
 * Task 1
 * Считать с консоли число m и k.
 * Вывести от 2 до m., от 1 до k
 * */
public class Class04 {
    public static void main(String[] args) {
        System.out.println("START\n- - - - -");
        int firstUserNumber = 2;
        int secondUserNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("От " + firstUserNumber + " до 'm' - ");
        int abc = scanner.nextInt();
        while (firstUserNumber <= abc) {
            System.out.print(firstUserNumber + " ");
            firstUserNumber++;
        }

        System.out.println("\n");
        System.out.println("От " + secondUserNumber + " до 'k' - ");
        int abc2 = scanner.nextInt();
        while (secondUserNumber <= abc2) {
            System.out.print(secondUserNumber + " ");
            secondUserNumber++;
        }
        System.out.println("\n- - - - -\nEND");
    }
}