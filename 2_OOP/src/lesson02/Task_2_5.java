package lesson02;

public class Task_2_5 {
    static int count;

    public static void main(String[] args) {
        /*
        * Чему равняется число Fibonacci под номером N (e. g. "12") ---> 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        * https://www.youtube.com/watch?v=-JKw6n7CLmo
        * http://geleot.ru/education/math/analytic_geometry/other/Fibonacci_number
        * https://en.wikipedia.org/wiki/Fibonacci_number
        *
        * Console:
        * Fibonacci: 13
        * */
        System.out.println("Fibonacci: " + fibonacci(7));

        /*
        * Вычислить Factorial числа 4, который равен 24.
        * Решение - 4 * 3 * 2 * 1
        *
        * Console:
        * Factorial: 24
        * */
        System.out.println("Factorial: " + factorial(4));

        /*
        * Console:
        * Exponentiation: 4611686018427387904
        * */
        System.out.println("Exponentiation: " + exponentiation(2, 62));

        System.out.print("\nOperations: " + count);
//        System.out.println("\n" + Math.random()); // 0 целый и квадрилионная 10 (15)
    }

    public static int fibonacci(int i) {
        count++;
        if (i == 0) return 0;
        if (i == 1) return 1;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static int factorial(int n) {
        /*
        * Делаем рекурсией
        * */
//        int temp = 1;
//        if (n == 1) {
//            return temp;
//        } else {
//            temp = n * factorial(n - 1);
//            return temp;
//        }

        // способ, где меньше кода
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

        /*
        * Аналог тернарным способом
        * */
//        return n == 1 ? 1 : n * factorial(n - 1);
    }

    /*
    * Возведение в степень
    * */
    public static long exponentiation(long number, long exp) {
        // My variant
        if (exp == 0) {
            return 1; // ставлю 0 и возвращает 0 вместо правильного числа
        }
        return number * exponentiation(number, exp - 1);

        /*
        * Правильный вариант 1
        * */
//        if (exp == 0) {
//            return 1;
//        } else {
//            return number * exponentiation(number, exp - 1);
//        }

        /*
        * Правильный вариант 2
        * */
//        return (exp == 0) ? 1 : number * exponentiation(number, exp - 1);
    }
}