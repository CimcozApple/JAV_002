package lesson05;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 6 (indexOf) - ДОДЕЛАТЬ ПОЛНОСТЬЮ
* Написать метод, в качестве параметра должен принимать 2 строки s1 и s1,
* определить входит ли строка s2 в строку s1,
* (является ли s2 подстрокой s1),
* метод должен вернуть значение boolean (true, если входит).
* Пример:
* s1 - my name is Yan
* s2 - name
* */
public class Class04 {
    public static void main(String [] args) {
//        System.out.println(isСontain(userValue1(), userValue2()));
        System.out.println(isСontain("my name is Yan", "name"));
    }

    public static String userValue1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first string: ");
        String result = scanner.nextLine();
        return result;
    }

    public static String userValue2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input second string: ");
        String result = scanner.nextLine();
        return result;
    }

    public static boolean isСontain(String s1, String s2) {
        boolean result = false;
        System.out.println("Result:");

        for (int i = 3, k = 0; k < s2.length(); i++, k++) {
            if (s1.indexOf(i) == s2.indexOf(k) & s1.contains(s2) == s1.contains(s2)) {
                return true;
            }
        }
        return result;
    }
}