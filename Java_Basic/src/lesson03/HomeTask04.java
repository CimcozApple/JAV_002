package lesson03;

import java.util.Arrays;
import java.util.Scanner;

/*
* (*) Task 13
* Создать массив из N элементов.
* Заполнить массив числами:
* посередине 0,
* затем вправо и влево увеличиваем на 1.
* Если количество элементов четное, то внутри должно быть 2 нуля.
* Вывести массив на экран.
* Пример: 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5
* * */
public class HomeTask04 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of your array: ");
        int a = scanner.nextInt();
        int [] b = new int [a];
        System.out.print("Your empty array: " + Arrays.toString(b));
        System.out.println();

        if ((a - 1) % 2 == 0) {
            System.out.print("[ ");
            int num1 = a / 2;
            int num3 = (a - a) + 1;
            int i = 0;
            for (i = 0; i <= b.length; i++) {
                b[i] = num1--;
                System.out.print(b[i] + " ");
                if (b[i] == 0) {
                   break;
                }
            }

            for (i = i; i <= b.length - 2; i++) {
                b[i] = num3++;
                System.out.print(b[i] + " ");
            }
            System.out.println("]");
        } else if ((a - 1) % 2 >= 1) {
            System.out.print("[ ");
            int num2 = (a / 2) - 1;
            int i = 0;
            int num3 = a - a;
            for (i = 0; i <= b.length; i++) {
                b[i] = num2--;
                System.out.print(b[i] + " ");
                if (b[i] == 0) {
                    break;
                }
            }

            for (i = i; i <= b.length - 2; i++) {
                b[i] = num3++;
                System.out.print(b[i] + " ");
            }
            System.out.println("]");
        }
    }
}