package lesson02;

import java.util.Scanner;

public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your age - ");
        int age = scanner.nextInt();
        System.out.print("");
        System.out.print("Your age is - " + age);
//        System.out.println("Your age is - " + scanner.nextInt());
//        System.out.println("Your age is - " + scanner.nextInt() + 5);
    }
}