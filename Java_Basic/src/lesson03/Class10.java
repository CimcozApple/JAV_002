package lesson03;

import java.util.Scanner;

/*
* (*) Угадай число
* Рандомно задается число от 1-го до 10,
* пользователь вводит число с консоли,
* если угадал выводится сообщение победа,
* если нет попытка повторяется
* */
public class Class10 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
//        System.out.println("Lucky Random Number: " + random);

        int a = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input your guess number: ");
            a = scanner.nextInt();
        } while (a != random);
        System.out.println("You Won");
    }
}