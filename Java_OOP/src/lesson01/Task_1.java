package lesson01;

import java.util.Arrays;

public class Task_1 {
    byte b = 99; // todo example for test todo keyword
    static int count;

    public static void main(String [] args) {
        int [] myArray = new int[3];
//        prePostIncrement();
        generateRandomNumbers(myArray);
//        sortArrayBubbleLowToHigh(myArray);
//        sortArrayBubbleHighToLow(myArray);
//        sortArraySelectionLowToHigh(myArray);
        sortArrayInsertionLowToHigh(myArray);

        System.out.print("\nOperations: " + count);
    }

    public static void showArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void generateRandomNumbers(int [] array) {
        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100 - 50); // от -50 до +50
            array[i] = (int) (Math.random() * 100); // явное приведение типов int
//            array[i] = (int) (Math.random() * 10); // явное приведение типов int
        }
        System.out.println("Origin Array: " + Arrays.toString(array));
    }

    // Сортировка пузырьком (большее число) поднимается вверх
    public static void sortArrayBubbleLowToHigh(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int a = 0; a < array.length - 1; a++) {
                if (array[a] > array[a + 1]) {
                    swap(array, a, a + 1);
                }
            }
        }
        System.out.println("Bubble SortByAgeFrom9To0 From Low To High: " + Arrays.toString(array));
    }

    // Сортировка пузырьком (большее число) спускается вниз
    public static void sortArrayBubbleHighToLow(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int a = 0; a < array.length - 1; a++) {
                if (array[a] < array[a + 1]) {
                    swap(array, a, a + 1);
                }
            }
        }
        System.out.println("Bubble SortByAgeFrom9To0 From High To Low: " + Arrays.toString(array));
    }

    // Сортировка выборкой, выбираем минимальную позицию
    public static void sortArraySelectionLowToHigh(int [] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int a = i + 1; a < array.length; a++) {
                if (array[a] < array[min]) {
                    min = a;
                }
            }
            swap(array, i, min);
//            System.out.println(Arrays.toString(array));
        }
        System.out.println("Selection SortByAgeFrom9To0 From Low To High: " + Arrays.toString(array) + "");
    }

    // Сортировка вставкой
    public static void sortArrayInsertionLowToHigh(int [] array) {
        for (int i = 1; i < array.length; i++) {
            for (int a = i; a > 0 && (array[a] < array[a - 1]); a--) {
                swap(array, a, a - 1);
            }
        }
        System.out.println("Insertion SortByAgeFrom9To0: " + Arrays.toString(array) + "");
    }

    public static void swap(int [] array, int iValue, int minValue) {
        int temp = array[iValue]; // 11 in temp
        array[iValue] = array[minValue]; // 11 in 11
        array[minValue] = temp; // 11 in 11
        count++;
    }

    public static void prePostIncrement() {
        int a = 1;
        System.out.print("Pre & Post Increment: ");
        System.out.println(a++ + ++a - --a + a++ + --a);
        // 1 + 3 - 2 + 2 + 2 = 6
    }
}