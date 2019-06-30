package lesson02;

import java.util.Scanner;

/*
* Квадратное уравнение (формула - ax2 + bx + c = 0).
* Пользователь вводит коэффициенты квадратного уравнения.
* Вывести на экран корни уравнения.
* Если первый коэффициент равен нулю, то вывести «Первый коэффициент не может быть 0".
* Если уравнение не имеет корней, то вывести «Нет действительных решений уравнения».
* Если уравнение имеет два решения, то вывести их в строку через пробел.
* Пример:
* 1
* 3
* -4
* 1 -4
* */
public class Class08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число в переменную/коэффициент 'a': ");
        int a = scanner.nextInt();
        while (a == 0) {
            System.out.println("- - - - -");
            System.out.println("ВНИМАНИЕ! - Переменная/коэффициент 'a' не должна содержать: '" + a + "'!");
            System.out.print("Введите число в переменную/коэффициент 'a' еще раз: ");
            a = scanner.nextInt();
        }
        System.out.print("Введите число в переменную/коэффициент 'b': ");
        int b = scanner.nextInt();
        System.out.print("Введите число в переменную/коэффициент 'c': ");
        int c = scanner.nextInt();

        System.out.println("- - - - -");
        System.out.println("Итого, квадратное уравнение: " + a + "x2 + " + b + "x + " + c + " = 0");
        System.out.println("- - - - -");
        System.out.println("Чтобы решить квадратное уравнение, нужно найти дискриминант");
        System.out.println("Формула, чтобы найти дискриминант: D = b2 – 4 * a * c");
        System.out.println("Если результат будет < 0: то квадратное уравнение не имеет корней");
        System.out.println("Если результат будет = 0: то квадратное уравнение имеет один корень");
        System.out.println("Если результат будет > 0: то квадратное уравнение имеет два корня");

        System.out.println("- - - - -РЕШЕНИЕ- - - - -");
        int discriminant = b * b - 4 * a * c;
        System.out.println("Дискриминант равен: '" + discriminant + "'");

        if (discriminant < 0) {
            System.out.println("Нет действительных решений уравнения, т. к. дискриминант равен: '" + discriminant + "'");
        } else if (discriminant == 0) {
            System.out.println("Квадратное уравнение имеет один корень, т. к. дискриминант равен: '" + discriminant + "'");
        } else {
            System.out.println("Есть два корня, т. к. дискриминант равен: '" + discriminant + "'");
            double radical1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
            double radical2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни равны:");
            System.out.println("x1 = '" + radical1 + "'");
            System.out.println("x2 = '" + radical2 + "'");
        }
    }
}