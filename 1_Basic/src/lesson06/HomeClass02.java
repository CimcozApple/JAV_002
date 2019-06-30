package lesson06;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Task 5
* Написать метод, который выводит список на экран,
* формат вывода:
* [0] = 10
* [1] = 20
* [2] = 30
* */
public class HomeClass02 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну вашего массива: ");
        int length = scanner.nextInt();
        ArrayList <Integer> arrayList = new ArrayList<>();

        showArrayList(arrayList, length);
    }

    public static void showArrayList(ArrayList <Integer> arrayListFromMain, int arrayLength) {
        int plusTen = 10;

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("[" + i + "] = ");
            arrayListFromMain.add(plusTen);
            plusTen = plusTen + 10;
            System.out.println(arrayListFromMain.get(i));
        }
    }
}