package lesson06;

import java.util.Scanner;

/*
* Task 4
* Реализовать логику методов в шаблоне ниже:
* */
//public class Class06 {
//    public static String inputString() {
//    }
//
//    public static char inputSymbol() {
//    }
//
//    public static int getCountSymbolByString(String s, char c) {
//    }
//
//    public static void main(String[] args) {
//        String str = inputString();
//        char d = inputSymbol();
//        int res = getCountSymbolByString(str,d);
//        System.out.println("Количество символов '" + d + "', в строке '" + str + "' = " + res);
//    }
//}
public class Class06 {
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш текст: ");
        String text = scanner.nextLine();
        return text;
    }

    public static char inputSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ который вы хотите посчитать: ");
        char symbol = scanner.nextLine().charAt(0);
        return symbol;
    }

    public static int getCountSymbolByString(String s, char c) {
        int countOfSymbolInString = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                //
            } else if (s.charAt(i) == c) {
                countOfSymbolInString++;
            }
        }
        return countOfSymbolInString;
    }

    public static void main(String[] args) {
        String str = inputString();
        char d = inputSymbol();
        int res = getCountSymbolByString(str, d);
        System.out.println("Количество символов '" + d + "', в строке '" + str + "' = " + res);
    }
}