package lesson10;

import java.util.Arrays;

public class Task_10_3 {
    public static void main(String[] args) {
        String str = "Hello";
//        str = str + " World";
        str = str.concat(" World").concat("!!!!!!!!!!!!!");
        System.out.println(str);
        System.out.println(str.substring(4));
        System.out.println(str.replace("W", "X"));

        System.out.println((str.charAt(0) == 'h') | (str.charAt(0) == 'H'));
        char [] cc = new char[str.length()];
        str.getChars(0, str.length(), cc, 0);
        System.out.println(Arrays.toString(cc));

    }
}

// Хорстман