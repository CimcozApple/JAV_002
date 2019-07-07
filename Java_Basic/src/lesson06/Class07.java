package lesson06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Task 5
 * Написать метод, который заполняет список String'ами,
 * до введения слова стоп (через ArrayList).
 * Написать второй метод, который удаляет слова меньше 5 букв.
 * Написать третий метод, который из оставшихся слов выбрать самое короткое
 * и самое длинное и вывести на экран.
 * Написать четвертый метод, который записывает 2 этих слова в файл.
 * Пример:
 * [1, 12, 123456, 12345678, 12345678910, 12345]
 * [12345, 12345678910]
 * */
public class Class07 {
    public static void main(String [] args) throws IOException {
        ArrayList <String> arrayList = new ArrayList<>();
//        String path = "files/Lesson06Class07Task5.txt";
        String path = "/Users/Yan/ZOther/IT/Projects/BDevelopment/javaс/files/Lesson06Class07Task5.txt";
        String textForMethod = "";

        inputTextFromUser(arrayList);
        deleteWordWhichLessFiveLetters(arrayList);
        textForMethod = selectShortAndLongWords(arrayList);
        writeShortAndLongWordsInFile(path, textForMethod);
    }

    public static void inputTextFromUser(ArrayList <String> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст (для выхода напишите слово 'стоп'): ");
        String text = scanner.nextLine();
        while (!(text.contains("стоп"))) {
            array.add(text);
            System.out.print("Введите еще текст (для выхода напишите слово 'стоп'): ");
            text = scanner.nextLine();
            if (text.contains("стоп")) {
                break;
            }
        }
//        System.out.println(array);
    }

    public static void deleteWordWhichLessFiveLetters(ArrayList <String> array) {
//        System.out.println("БЫЛО " + array);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() < 5) {
                array.remove(i);
                --i;
            }
        }
//        System.out.println("СТАЛО " + array);
    }

    public static String selectShortAndLongWords(ArrayList <String> array) {
        String shortWord = array.get(0);
        String longWord = array.get(0);

        /*
         * Find short word
         * */
        for (int i = 0; i < array.size(); i++) {
            if (shortWord.length() > array.get(i).length()) {
                shortWord = array.get(i);
            } else if (shortWord.length() < array.get(i).length()) {
            } else if (shortWord.length() == array.get(i).length()) {
                if (i == 0) {
                    shortWord = array.get(0);
                }
            }
        }

        /*
         * Find long word
         * */
        for (int i = 0; i < array.size(); i++) {
            if (longWord.length() > array.get(i).length()) {
            } else if (longWord.length() < array.get(i).length()) {
                longWord = array.get(i);
            } else if (longWord.length() == array.get(i).length()) {
                if (i == 0) {
                    longWord = array.get(0);
                }
            }
        }
        System.out.println("Самое короткое имя: " + shortWord);
        System.out.println("Самое длинное имя: " + longWord);
        return shortWord + " & " + longWord;
    }

    public static void writeShortAndLongWordsInFile(String pathToWrite, String s) throws IOException {
        FileWriter fileWritter = new FileWriter(pathToWrite, true);
        fileWritter.write(s + "\n");
        fileWritter.flush();
        fileWritter.close();
    }
}