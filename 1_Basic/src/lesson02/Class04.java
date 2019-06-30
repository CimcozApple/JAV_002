package lesson02;

import java.util.Scanner;

public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personBorn = scanner.nextInt();
        int currentYear = 2018;
        int age = currentYear - personBorn;

        if (age < 18) {
            System.out.println("Готовься, салага");
        } else if (age >= 18 & age < 25) {
            System.out.println("Иди в военкомат");
        } else if (age >= 25 & age < 45) {
            System.out.println("Иди работай");
        } else if (age >= 45 & age < 65) {
            System.out.println("Думай о пенсии");
        } else if (age > 65 & age < 100) {
            System.out.println("Скоро в ящик");
        } else {
            System.out.println("Вам больше 99 лет, вы умерли");
        }
    }
}