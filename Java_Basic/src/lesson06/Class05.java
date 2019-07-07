package lesson06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
* Task 3
* Написать метод, который принимает имя файла и строку.
* Данный метод добавляет строку в файл,
* учитывая, что в этом файле уже есть какие-то строки
* */
public class Class05 {
    public static void main(String [] args) throws IOException {
        String pathToFile = "files/Lesson06Class05Task3.txt";

        getCurrentTextFromFile(pathToFile);
        addTextToFile(pathToFile, textFromUser());
        getCurrentTextFromFile(pathToFile);
    }

    public static void getCurrentTextFromFile(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);

        System.out.println("START - CURRENT TEXT IN FILE:\n");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println("\nFINISH - CURRENT TEXT IN FILE:");
        System.out.println();
        scanner.close();
    }

    public static String textFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your text please: ");
        String userText = scanner.nextLine();
        return userText;
    }

    public static void addTextToFile(String path, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        fileWriter.write("\n" + text);
        fileWriter.close();
    }
}