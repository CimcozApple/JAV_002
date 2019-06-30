package lesson06;

import java.util.ArrayList;

/*
* Коллекции
* ArrayList
* Динамичесий массив
* Списочный массив
* Не работают с примитивами, только с объектами
* Объектное отображение Byte или Integer и т. д. (Byte, Integer... Character (char))
* */
public class Class04 {
    public static void main(String[] args) {
//        Byte b;
//        Short s;
//        Integer i = 5;
//        int var = i; // автоупаковка

        /*
        * рассмотреть класс обертки это домашнее задание
        * <> diamond syntax
        * надстрок над структурами данных
        * */

        /*
         * Формула автоувеличения коллекции (OS - Old Size):
         * (OC * 3) / 2 + 1
         * 10 ---> 16
         * 20 ---> 31
         * 50 ---> 76
         * */

        //по умолчанию создаётся на 10 элементов,
        // если нужно много, можно указать 100, c 7 java <тут можно не писать>
        // в новой Java 8 можно не писать
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        /*
        * Добавить в массив
        * */
        // добавить новый элемент, указываем индексом куда добавить, но следующий элемент сдвинется вправо (не удалиться)
        list.add(1, 88);
        list.add(4, 99);
//        System.out.println(list);

        /*
        * Удалить
        * */
        list.remove(1); // удалить элемент
//        System.out.println(list);

        list.set(1, 44); // заменить на другой элемент

        list.indexOf(5);

//        System.out.println(list.indexOf(5));
        System.out.println(list);
//        System.out.println(list.size());
    }
}