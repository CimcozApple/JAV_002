package lesson04;

import java.util.Scanner;

/*
* Task 6
* Написать простой калькулятор:
* метод int getInt(),
* считывающий с консоли целое число и возвращающий его,
* метод char getOperation(),
* считывающий с консоли какое-то значение
* и возвращающий символ с операцией (+, -, * или /),
* метод int calc(int a, int b, char p),
* выполняя над числами a и b арифметическую операцию, заданную p.,
* метод main считывает два числа (с помощью getInt),
* считать операцию (с помощью getOperation()),
* передать все методу calc и вывести на экран результат.
* Примечание: метод getOperation() можно реализовать так - с консоли считывает целое число.
* Если вводится 1, то возвращать '+', 2 - '-', 3 - '*' и если вводится 4, то возвращать '/'.
* Написать калькулятор, вводится два числа, 3-им оператор, методы выводят результат математической операции (+ - * / sqrt pow)
* */
public class Class04 {
    static int a = 0;
    static int b = 0;
    static char value = 'a';
    static int result = 0;

    public static void main(String[] args) {
        System.out.print("Input your first number: ");
        a = getInt();

        System.out.print("Input your arithmetical action/operation: ");
        value = getOperation();

        System.out.print("Input your second number: ");
        b = getInt();

        System.out.print("Result is: ");
        System.out.print(result = calc(a, b, value));
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        char value = scanner.next().charAt(0);

        if (value == '+') {
            return '+';
        } else if (value == '-') {
            return '-';
        } else if (value == '/') {
            return '/';
        } else if (value == '*') {
            return '*';
        } else {
            System.out.println("https://www.youtube.com/watch?v=gZA69ipQkJU");
        }
        return value;
    }

    public static int calc(int a, int b, char c) {
        int result = 0;
        if (c == '+') {
            result = a + b;
        } else if (c == '-') {
            result = a - b;
        } else if (c == '/') {
            result = a / b;
        } else if (c == '*') {
            result = a * b;
        } else {

        }
        return result;
    }
}