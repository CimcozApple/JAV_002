package lesson08.homework.task_01;

import java.util.Scanner;

/*
* 1.1.
* Напишите консольное приложение,
* которое определяет целое положительное число в десятичной системе,
* целые и положительные числа - 1, 2, 3, 44, 55 и т. д. (не целые числа - 1.1, 34.40, 15.99),
* затем преобразует и выводит его в двоичной,
* восьмиричной,
* и шестнадцатиричной системах счисления.
* */
public class Task_01_01 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input \"Decimal\" number: ");
        int userDecimalNumber = scanner.nextInt();

        System.out.println("10 ---> 2: " + convertToBinaryNumber(userDecimalNumber)); // 2
        System.out.println("10 ---> 8: " + convertToOctalNumber(userDecimalNumber)); // 8
        System.out.println("10 ---> 16: " + convertToHexadecimalNumber(userDecimalNumber)); // 16
//        convertToDecimalNumber(); // 10
    }

    public static String convertToBinaryNumber(int userDecimalNumberFromOtherMethod) {
        StringBuilder stringBuilder = new StringBuilder();
        int remainderOfNumber;

        do {
            while (userDecimalNumberFromOtherMethod % 2 == 0) {
                remainderOfNumber = userDecimalNumberFromOtherMethod % 2;
                stringBuilder.append(remainderOfNumber);
                userDecimalNumberFromOtherMethod = userDecimalNumberFromOtherMethod / 2;
            }
            remainderOfNumber = userDecimalNumberFromOtherMethod % 2;
            stringBuilder.append(remainderOfNumber);
            userDecimalNumberFromOtherMethod = userDecimalNumberFromOtherMethod / 2;
        } while (userDecimalNumberFromOtherMethod != 0);

        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String convertToOctalNumber(int userOctalNumberFromOtherMethod) {
        StringBuilder stringBuilder = new StringBuilder();
        String stringResult = "";
        int result = userOctalNumberFromOtherMethod;
        int remainderOfNumber = 0;

        do {
            remainderOfNumber = result % 8;
            stringBuilder.append(remainderOfNumber);
            result = result / 8;
            if (result > 1 & result < 8) {
                break;
            }
        } while (result != 1);

        stringBuilder.append(result);
        stringBuilder.reverse();
        stringResult = stringBuilder.toString();
        return stringResult;
    }

    public static String convertToHexadecimalNumber(int userHexadecimalNumberFromOtherMethod) {
        StringBuilder stringBuilder = new StringBuilder();
        String stringResult = "";
        int result = userHexadecimalNumberFromOtherMethod;
        int remainderOfNumber = 0;
        int hexadecimalNumber = 16;

        do {
            remainderOfNumber = result % hexadecimalNumber;

            if (remainderOfNumber >= 0 & remainderOfNumber <= 9) {
                stringBuilder.append(remainderOfNumber);
            } else if (remainderOfNumber == 10) {
                stringBuilder.append("A");
            } else if (remainderOfNumber == 11) {
                stringBuilder.append("B");
            } else if (remainderOfNumber == 12) {
                stringBuilder.append("C");
            } else if (remainderOfNumber == 13) {
                stringBuilder.append("D");
            } else if (remainderOfNumber == 14) {
                stringBuilder.append("E");
            } else if (remainderOfNumber == 15) {
                stringBuilder.append("F");
            }

            result = result / hexadecimalNumber;
            if (result > 1 & result < hexadecimalNumber) {
                break;
            }
        } while (result != 1);

        stringBuilder.append(result);
        stringBuilder.reverse();
        stringResult = stringBuilder.toString();
        return stringResult;
    }
}