package lesson03;

import java.util.Arrays;

/*
* Массив - структура данных для хранения элементов одного типа.
* Массив объект как и Scanner
* В массив можно положить любой объект
*
* Пример:
* int [] arr;
* int arr [];
*
* Null - это не инициализированный объект
*
* Массив не может быть измненен в будущем
* */
public class Class11 {
    public static void main(String[] args) {
        int [] arr = new int[2]; // размер массива может быть от 0 до 2_147_483_647, если тип int
        int [] arr2 = {1, 3, 5}; // размер массива 3, значения элементов 1, 3, 5
        System.out.println(Arrays.toString(arr));// вывод содержания элементов в консоль
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr.length); // вывод длинну массива
        System.out.println(arr2.length); // вывод длинну массива

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}