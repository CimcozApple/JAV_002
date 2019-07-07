package lesson06;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Task 7
* Написать метод, который ищет элемент в списке
* и возвращает кол-во этих элементов.
* getCountElementByArrayList(ArrayList <Integer> vector, Integer element)
* */
public class HomeClass04 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число которое нужно найти и посчитать в массиве: ");
        Integer findElement = scanner.nextInt();
        System.out.print("Введите размер массива: ");
        int userCount = scanner.nextInt();
        ArrayList <Integer> arrayList = new ArrayList<>();
        System.out.println(getCountElementByArrayList(arrayList, findElement, userCount));
    }

    public static int getCountElementByArrayList(ArrayList <Integer> vector, Integer el, int count) {
        int howManyTimes = 0;
        for (int i = 0; i < count; i++) {
            vector.add((int) (Math.random() * 100));
            if (vector.get(i) == el) {
                howManyTimes++;
            }
        }
        System.out.println(vector);
        System.out.println("Элемент '" + el + "' повторяется в массиве '" + howManyTimes + "' раз/за");
        return howManyTimes;
    }
}