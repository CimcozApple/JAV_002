package lesson05;

import java.util.Arrays;

/*
 * Task 11
 * Написать метод, который принимает строку
 * и возвращает массив целых чисел с индексами,
 * где встречаются символы 'а'
 * Пример:
 * метод принимает строку "Abracadabra"
 * метод возвращает "[0, 3, 5, 7, 10]"
 * */
public class Class10 {
    public static void main(String [] args) {
        System.out.println("'Abracadabra' word returns array of ints with 'A' letter: " + Arrays.toString(getIntArray("Abracadabra")));
        System.out.println("'ALABAMA' word returns array of ints with 'A' letter: " + Arrays.toString(getIntArray("ALABAMA")));
        System.out.println("'Antimaterialism' word returns array of ints with 'A' letter: " + Arrays.toString(getIntArray("Antimaterialism")));
        System.out.println("'Notwithstanding' word returns array of ints with 'A' letter: " + Arrays.toString(getIntArray("Notwithstanding")));
        System.out.println("'Vascularization and PHARMACOTHERAPY' words return array of ints with 'A' letter: " + Arrays.toString(getIntArray("Vascularization and PHARMACOTHERAPY")));
    }

    public static int [] getIntArray(String stringFromUser) {
        int digit = 0;
        int lengthOfArray = 0;
        int [] array;

        for (int i = 0; i < stringFromUser.length(); i++) {
            if (stringFromUser.charAt(i) == 'a' | stringFromUser.charAt(i) == 'A') {
                lengthOfArray++;
            }
        }
        array = new int [lengthOfArray];

        for (int i = 0, k = 0; i < stringFromUser.length(); i++, k++) {
            if (stringFromUser.charAt(i) == 'a' | stringFromUser.charAt(i) == 'A') {
                array[digit++] = i;
            }
        }
        return array;
    }
}