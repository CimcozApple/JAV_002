package lesson04;

public class Class02 {
    public static void main(String[] args) {
        // Task 1
        fromLowToHigh(10);
        fromHighToLow(50);

        // Task 2
        getMax(3 ,1);

        // Task 3
        method3(1, 43);

        // Task 4
        rightTriangle(4, 15);
    }

    /*
    * Task 1
    * Создать два метода,
    * один выводит числа от переданного значения до 20 в порядке увеличения,
    * второй в порядке уменьшения.
    * В метод передаем один аргумент, цифру.
    * */
    public static void fromLowToHigh(int fromNumber) {
        for (int i = fromNumber; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void fromHighToLow(int fromNumber) {
        for (int i = fromNumber; i >= 20; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
    * Task 2
    * Написать метод getMax,
    * который принимает два целых числа
    * и возвращает максимальное.
    * В main считать два целых числа,
    * передать методу getMax
    * и вывести результат на экран.
    * */
    public static int getMax(int a, int b) {
        int result = 0;
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        }
        return result;
    }

    /*
    * Task 3
    * Написать метод (void),
    * который принимает в качестве параметра числа K и N.
    * Этот метод выводит все четные числа от K до N на экран.
    * В main считать два числа и передать этому методу.
    * */
    public static void method3(int k, int n) {
        for (int i = k; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " "); // четное
            } else {
            }
        }
        System.out.println();
    }

    /*
    * Task 4
    * Теорема Пифагора.
    * Для прямоугольного треугольника написать метод,
    * который возвратит сторону гипотенузы,
    * в качестве параметров метод должен принимать 2 переменные с размерами катетов.
    * */
    public static double rightTriangle(int a, int b) {
        double result = Math.sqrt((a * a) + (b * b));
        System.out.println(result);
        return result;
    }

    // Task 5 в классе "Class03"
    // Task 6 в классе "Class04"
    // Task 7 в классе "Class05"
}