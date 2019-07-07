package lesson06;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Task 4
* Написать метод, заполнения списка (ArrayList) случайными целыми числами от 0 до 100,
* метод принимает список и кол-во элементов.
* */
public class HomeClass01 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вашу длинну массива: ");
        int length = scanner.nextInt();
        ArrayList <Integer> arrayList = new ArrayList<>();

        fillRandomValues(arrayList, length);
    }

    public static void fillRandomValues(ArrayList <Integer> array, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            array.add((int) (Math.random() * 100));
        }
        System.out.println("Заполненный массива: " + array);
    }
}