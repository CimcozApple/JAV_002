package lesson03;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 10
* Создать массив из N элементов целых чисел.
* Считать N с консоли.
* Заполнить случайными значениями от 0 до 100.
* Во 2-й элемент поместить сумму 2-го и 3-го элемента.
* Вывести на экран
* * * */
public class HomeTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 0 до 50: ");
        int a = scanner.nextInt();
        int [] b = new int [a];
        System.out.println("Ваш пустой массив " + Arrays.toString(b));

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        System.out.println("Ваш заполненный массив " + Arrays.toString(b));
//        System.out.print("Значение элемента 2:" + Arrays.toString(b[1]));
//        System.out.print("Значение элемента 3:" + Arrays.toString(b[2]));

        if (b[3] > 0 & b[3] < 100) {
            b[1] = b[1] + b[2];
        }
        System.out.println("Элемент 2 это сумма второго и третьего элементов\n" + Arrays.toString(b));
    }
}