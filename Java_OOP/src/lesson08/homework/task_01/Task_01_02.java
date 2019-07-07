package lesson08.homework.task_01;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 1.2.
* Напишите консольное приложение,
* которое находит все совершенные числа в диапазоне от 1 по некоторое заданное положительное число
* и выводит их (совершенное число – это число, которое равно сумме всех своих делителей, кроме самого себя.
* Например: 6 = 1 + 2 + 3).
* */
public class Task_01_02 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your value from 1 up to: ");
        int userValue = scanner.nextInt();
        getPerfectNumbers(userValue);
    }

    public static void getPerfectNumbers(int checkUpToThisUserValue) {
        for (int i = 1; i <= checkUpToThisUserValue; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int res1 = 0;
            int res2 = 0;
            int sum = 0;

            for (int k = 2; k <= checkUpToThisUserValue; k++) {
                res1 = i / k;
                res2 = i % k;
                if (res2 == 0) {
                    arrayList.add(res1);
                }

                if (i == k || i == 1) {
                    break;
                }
            }

            for (int n = 0; n < arrayList.size(); n++) {
                sum = sum + arrayList.get(n);
            }

            if (sum == i) {
                System.out.println("Perfect Number is: " + sum);
            }

        }
    }
}