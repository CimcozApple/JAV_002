package lesson04;

import java.util.Arrays;
import java.util.Scanner;

/*
* Task 7
* Написать класс с методами,
* метод заполнения массива случайными числами от 0 до 100,
* метод вывода на экран - красивый,
* метод вывода части массива, который принимает в качестве параметров:
* массив, индекс элемента с которого выводить и индекс элемента по который выводить,
* метод который принимает в качестве параметра массив и возвращает его размер,
* главный метод (main).
* * */
public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш предпочитаемый размер массива: ");
        int userArraySize = scanner.nextInt();
        int [] a = new int[userArraySize];
        System.out.println("Ваш пустой массив: " + Arrays.toString(a));

        fillArray(a);
        getValueOfArray(a, userArraySize);

        System.out.print("Ваш начальный индекс отображения массива: ");
        int userFirstIndexOfArray = scanner.nextInt();
        System.out.print("Ваш конечный индекс отображения массива: ");
        int userSecondIndexOfArray = scanner.nextInt();

        getPartOfFilledArray(a, userFirstIndexOfArray, userSecondIndexOfArray);
    }

    /*
    * Заполняем массив случайными числами от 0 до 100
    * */
    public static void fillArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    /*
     * Выводим в консоль заполненный массив
     * */
    public static void getValueOfArray(int [] fillArray, int a) {
        System.out.print("Ваш заполненный массив: [");
        for (int i = 0; i < fillArray.length - 1; i++) {
            System.out.print(fillArray[i] + ", ");
        }

        if (fillArray[a - 1] >= 0) {
            for (int x = a - 1; x >= 0; x++) {
                System.out.print(fillArray[x] + "]");
                break;
            }
        }
        System.out.println();
    }

    public static int getPartOfFilledArray(int [] readyArray, int a, int b) {
        int sizeOfArray = (b - a) + 1;
        int j = a;
        int [] secondArray = new int[sizeOfArray];

        /*
        * Выбираем конкретные элементы заданные пользователем от "числа" до "числа"
        * */
        System.out.print("Элементы выбранных ячеек: [");
        for (int i = a; i <= b - 1; i++) {
            System.out.print(readyArray[i] + ", ");
        }
        if (b >= 0) {
            for (int c = b; c > 0; c++) {
                System.out.print(readyArray[c] + "]");
                break;
            }
        }

        /*
        * Записываем в новый массив, который вернет длинну конечного массива
        * */
        for (int k = 0; k < sizeOfArray; k++) {
            secondArray[k] = readyArray[j++];
//            System.out.print(secondArray[k] + " ");
        }
        System.out.println();

        /*
        * Вывожим финальную длинну нового массива
        * */
        int arraySize = secondArray.length;
        System.out.print("Финальный размер массива: " + arraySize);
        return arraySize;
    }
}