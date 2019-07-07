package lesson06;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Task 6
* Написать метод, который вставляет элемент внутрь списка (ArrayList) и возвращает его,
* insertElement(ArrayList <Integer> vector, int index, Integer element)
* */
public class HomeClass03 {
    public static void main(String [] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        System.out.println("Вывод из массива: " + insertElement(arrayList, getIndex(), getValue()));
    }

    public static Integer getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элемент для вставки в массив: ");
        Integer userValue = scanner.nextInt();
        return userValue;
    }

    public static int getIndex() {
        int index = 0;
        return index;
    }

    public static ArrayList <Integer> insertElement(ArrayList <Integer> vector, int index, Integer el) {
        vector.add(index, el);
        return vector;
    }
}