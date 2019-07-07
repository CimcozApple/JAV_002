package lesson05;

import java.util.Scanner;

/*
 * Task 10
 * Написать метод, проверяющий является ли строка полиндромом,
 * строка которая одинаково читается справа налево и слева направо (фииф, нгшшгн)
 * */

/*
* Проверки
* */
//0 - false
//a - ошибка
//ab - false
//aa - true
//aba - true
//abc - false

//ошибка и...
//ab - false
//aa - true
//aba - true
//фис - false
public class Class09 {
    public static void main(String [] args) {
        System.out.print("Is this word palindrome? - " + isPalindrome(userValue()));
    }

    public static String userValue() {
        String userValue = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your palindrome word: ");
        userValue = scanner.nextLine();

        /*
        * For debug
        * */
//        userValue = "CIVIC"; // 5
//        userValue = "REDDER"; // 6
//        userValue = "REPAPER"; // 7

        return userValue;
    }

    public static boolean isPalindrome(String s) {
        String result = s;
        int numOfTrue = 0;
        boolean booleanResult = false;
        int halfOfStringArray = result.length() / 2;

        if (result.length() % 2 == 0) {
            for (int i = 0, k = result.length() - 1; i < halfOfStringArray; i++, k--) {
                if (result.charAt(i) != result.charAt(k)) {
                    return false;
                } else if (result.charAt(i) == result.charAt(k)) {
                    numOfTrue++;
                }
            }
            if (numOfTrue == halfOfStringArray) {
                booleanResult = true;
            }
        } else if (result.length() % 2 == 1) {
            while (result.length() <= 1) {
                System.out.println("PLEASE INPUT MORE THEN ONE CHARACTER!\n");
                result = userValue();
            }

            halfOfStringArray = result.length() / 2;

            for (int i = 0, k = result.length() - 1; i < halfOfStringArray; i++, k--) {
                if (result.charAt(i) != result.charAt(k)) {
                    return false;
                } else if (result.charAt(i) == result.charAt(k)) {
                    numOfTrue++;
                }
            }
            if (numOfTrue == halfOfStringArray) {
                booleanResult = true;
            }
        }
        return booleanResult;
    }
}