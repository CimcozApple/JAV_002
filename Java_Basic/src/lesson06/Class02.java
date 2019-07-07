package lesson06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
* Task 1
* Записать метод, который заполняет файл четными числами от к1 до к2,
* все числа в отдельной строке,
* этот метод принимает имя файла, к1 и к2 в качестве параметра.
* */
public class Class02 {
    public static void main(String[] args) throws IOException {
        String pathToFile = "files/Lesson06Class02Task1.txt";
        inputValueFromFile(pathToFile, getUserValue(), getUserValue());
    }

    public static int getUserValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public static void inputValueFromFile(String filePath, int from, int upTo) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        if (from % 2 == 0) {
            for (int i = from; i <= upTo; i = i + 2) {
                fileWriter.write(i + "\n");
                System.out.print(i + " ");
            }
            fileWriter.flush();
            fileWriter.close();
        } else if (from % 2 >= 1) {
            from++;
            for (int i = from; i <= upTo; i = i + 2) {
                fileWriter.write(i + "\n");
                System.out.print(i + " ");
            }
            fileWriter.flush();
            fileWriter.close();
        }
    }
}