package lesson06;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
* Task 2
* Написать метод, который принимает имя файла
* и возвращает количество строк в файле
* */
public class Class03 {
    public static void main(String [] args) throws IOException {
        String myFile = "files/Lesson06Class03Task2.txt";
        System.out.println(getAmountOfStrings(myFile));
    }

    public static int getAmountOfStrings(String filePath) throws IOException {
        int result = 0;
        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            result++;
        }
        scanner.close();
        return result;
    }
}