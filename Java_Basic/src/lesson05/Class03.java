package lesson05;

import java.util.Scanner;

/*
* Task 5 (charAt)
* Написать метод, принимающий в качестве параметра строку
* и определяющий равны ли первый и последний символ в строке.
* Метод: boolean isFirstLastCharsEquals(String s)
* */
public class Class03 {
    public static void main(String [] args) {
        System.out.println(isFirstLastCharsEquals(scanValue()));
    }

    public static String scanValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your word: ");
        String value = scanner.nextLine();
        return value;
    }

    public static boolean isFirstLastCharsEquals(String s) {
        boolean result = false;
        int index1 = 0;
        int index2 = s.length();

        if (index1 < index2) {
            if (s.charAt(index1) == s.charAt(--index2)) {
                return true;
            }
        }
        return result;
    }
}