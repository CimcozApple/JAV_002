package lesson04;

import java.util.Arrays;

/*
* Task 6
* Обмен половин
* Написать класс с методом меняющий местами половины массива, если размер нечетный - центральный элемент не учитывается
* Название метода: swapHalves
* Пример:
* swapHalves(int[] vector); // [1234567]
* [5674123]
* */
public class HomeClass04 {
    public static void main(String [] args) {
//        int [] array = {1, 2, 3}; // не четное
//        int [] array = {1, 2, 3, 4, 5, 6, 7}; // не четное
//        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // не четное
//        int [] array = {1, 2}; // четное
//        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // четное
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // четное
        swapHalves(array);
    }

    public static void swapHalves(int [] vector) {
        int halfSizeOfArray = vector.length / 2;
        if (vector.length % 2 == 0) {
            for (int i = 0, k = vector.length - halfSizeOfArray; i < halfSizeOfArray; i++, k++) {
                int a = vector[i];
                vector[i] = vector[k];
                vector[k] = a;
            }
        } else if (vector.length % 2 == 1) {
            for (int i = 0, k = vector.length - halfSizeOfArray; i < halfSizeOfArray; i++, k++) {
                int a = vector[i];
                vector[i] = vector[k];
                vector[k] = a;
            }
        }
        System.out.println(Arrays.toString(vector));
    }
}