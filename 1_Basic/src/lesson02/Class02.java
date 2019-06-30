package lesson02;

import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte a = scanner.nextByte();
        byte b = scanner.nextByte();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}