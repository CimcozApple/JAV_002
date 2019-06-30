package lesson04;

import java.util.Arrays;

/*
* Task 5
* Векторный переворот - ПЕРЕДЕЛАТЬ с любым массивом и с числами в разброс
* Написать класс с методом,
* размещающий элементы массива в обратном порядке
* (именно размещающий, а не выводящий на экран).
* Название метода: revertVector()
* Пример:
* revertVector(int [] vector); // [1234567]
* [7654321]
* */
public class HomeClass03 {
    public static void main(String [] args) {
//        int [] array = {1, 2, 3};
//        int [] array = {1, 2, 3, 4, 5};
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        revertVector(array);
    }

    public static void revertVector(int [] vector) {
        for (int i = 0; i < vector.length; i++) {
            // вариант 1
//            int a = vector[vector.length - 1]--;
//            vector[i] = a;

            // вариант 2
            vector[i] = vector[vector.length - 1]--;
        }
        System.out.println(Arrays.toString(vector));
    }
}