package lesson03;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 12 - ПЕРЕДЕЛАТЬ!
* Создать массив из N элементов,
* с заполнением последовательностью M, M-2, M-4 и так далее.
* Вывести массив на экран, с консоли считать N и M.
* * */
public class HomeTask03 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your size of array: ");
        int a = scanner.nextInt();

        System.out.print("Input your sequence between of number: ");
        int b = scanner.nextInt();

        int [] c = new int [a];
        for (int i = 0; i < c.length; i++) {
            c[i] = i * b;
        }
        System.out.println("" + Arrays.toString(c));
    }
}