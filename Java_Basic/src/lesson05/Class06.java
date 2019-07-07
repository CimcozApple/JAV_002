package lesson05;

import java.util.Arrays;

/*
* Task 8
* Написать метод, принимающий в качестве параметра строку,
* возвращающий перевернутую строку (возвращать не в консоль).
* */
public class Class06 {
    public static void main(String[] args) {
        System.out.println("- - - - - - - - - - - - - - -PROGRAM IS STARTED\n");
//        System.out.println("\"AND\" reverse string to: " + getReverseString("AND"));
        System.out.println("\"ANILORAK\" reverse string to: " + getReverseString("ANILORAK"));
//        System.out.println("\"ИСКАТ ЬТАКСИ\" reverse string to: " + getReverseString("ИСКАТ ЬТАКСИ"));
//        System.out.print("\"ЫМОРДНИЛАП\" reverse string to: " + getReverseString("ЫМОРДНИЛАП"));
        System.out.print("\n\n- - - - - - - - - - - - - - -PROGRAM IS ENDED");
    }

    public static String getReverseString(String s) {
        String result = s;
        String convertBackToString = "";

        char [] newArray = result.toCharArray(); // String (result) to char ---> array (newArray)
//        System.out.println(Arrays.toString(newArray));

        for (int i = 0, k = result.length() - 1; i < result.length(); i++, k--) {
            newArray[i] = result.charAt(k);
//            System.out.println(newArray[i]);
        }

        result = Arrays.toString(newArray);
        convertBackToString = String.valueOf(newArray); // char ---> array to String
        result = convertBackToString;
        return result;
    }
}