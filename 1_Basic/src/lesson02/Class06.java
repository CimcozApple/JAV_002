package lesson02;

import java.util.Scanner;

/*
* Ввести значение переменной,
* определить отрицательное,
* цифра или число (отобразить только слова, без цифр/чисел)
* Output the value of var, define negative number or digit
* */
public class Class06 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше число: ");
        int value = scanner.nextInt();

        if (value < 0 && value > -10) {
            System.out.println("Цифра отрицательная: '" + value + "'");
        } else if (value < -9 && value >= -2_147_483_648) {
            System.out.println("Число отрицательное: '" + value + "'");
        } else if (value > 0 && value < 10) {
            System.out.println("Цифра положительная: '" + value +  "'");
        } else if (value > 9 && value <= 2_147_483_647) {
            System.out.println("Число положительное: '" + value + "'");
        } else {
            System.out.println("Число не положительное и не отрицательное");
        }
    }
}