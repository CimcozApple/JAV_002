package lesson02.homework;

import java.util.Arrays;

public class HomeClass01 {
    static int count = 0;

    public static void main(String [] args) {
//        int [] myArray = new int[10];
//        generateMyArrayOfRandomValues(myArray);
//        sortByBubbleFromLowToHighNumber(myArray);
//        sortByBubbleFromHighToLowNumber(myArray);
//        sortBySelectionFromLowToHigh(myArray);
//        sortBySelectionFromHighToLow(myArray);
//        sortByShellFromLowToHigh(myArray);

//        fibonacci();

//        recursion1(1);
//        recursion2(1);
        recursion3(1);
//        System.out.println(fibViaRecur(5));
//        fibViaRecur(5); // check method
//        towerOfHanoi();
//        System.out.println("\n" + count);
    }

    /*
    * Generates my own array with random values in it
    * */
    public static void generateMyArrayOfRandomValues(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Original Array:\n" + Arrays.toString(array));
    }

    /*
    * SortByAgeFrom9To0 by Bubble from low to high number
    * */
    public static void sortByBubbleFromLowToHighNumber(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int a = 0; a < array.length - 1; a++) {
                if (array[a] > array[a + 1]) {
                    int temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Bubble Array To High:\n" + Arrays.toString(array));
    }

    /*
    * SortByAgeFrom9To0 by Bubble from high to low number
    * */
    public static void sortByBubbleFromHighToLowNumber(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int a = 0; a < array.length - 1; a++) {
                if (array[a] < array[a + 1]) {
                    int temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Bubble Array To Low:\n" + Arrays.toString(array));
    }

    /*
    * SortByAgeFrom9To0 by Selection from high to low number
    * Можно искать минимальный элемент и двигать в начало,
    * или искать максимальный элемент и двигать в конец или наоборот
    * */
    public static void sortBySelectionFromLowToHigh(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValue = i;
            for (int a = i + 1; a < array.length; a++) {
                if (array[a] < array[minValue]) {
                    minValue = a;
                }
            }
            int temp = array[i];
            array[i] = array[minValue];
            array[minValue] = temp;
            count++;
        }
        System.out.println("Selection Array To High:\n" + Arrays.toString(array));
    }

    /*
     * SortByAgeFrom9To0 by Selection from low to high number
     * */
    public static void sortBySelectionFromHighToLow(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValue = i;
            for (int a = i + 1; a < array.length; a++) {
                if (array[a] > array[minValue]) {
                    minValue = a;
                }
            }
            int temp = array[i];
            array[i] = array[minValue];
            array[minValue] = temp;
            count++;
        }
        System.out.println("Selection Array To Low: " + Arrays.toString(array));
    }

    /*
     * SortByAgeFrom9To0 by Shell from low to high number
     * */
    public static void sortByShellFromLowToHigh(int [] array) {
        int first = 3;
        int second = 2;
        int third = 1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int a = 0; a < array.length - first; a++) {
                if (array[a] > array[a + first]) {
                    int temp = array[a];
                    array[a] = array[a + first];
                    array[a + first] = temp;
                    count++;
                    if (a - first >= 0) {
                        if (array[a - first] > array[a]) {
                            int temp2 = array[a - first];
                            array[a - first] = array[a];
                            array[a] = temp2;
                            count++;
                        }
                    }
                }
            }

            for (int a = 0; a < array.length - second; a++) {
                if (array[a] > array[a + second]) {
                    int temp = array[a];
                    array[a] = array[a + second];
                    array[a + second] = temp;
                    count++;
                    if (a - second >= 0) {
                        if (array[a - second] > array[a]) {
                            int temp2 = array[a - second];
                            array[a - second] = array[a];
                            array[a] = temp2;
                            count++;
                        }
                    }
                }
            }

            for (int a = 0; a < array.length - third; a++) {
                if (array[a] > array[a + third]) {
                    int temp = array[a];
                    array[a] = array[a + third];
                    array[a + third] = temp;
                    count++;
                    if (a - third >= 0) {
                        if (array[a - third] > array[a]) {
                            int temp2 = array[a - third];
                            array[a - third] = array[a];
                            array[a] = temp2;
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("\nShell:\n" + Arrays.toString(array));
    }

    /*
    * 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
    * */
    public static void fibonacci() {
        int a = 1;
        int b = 1;
        int res = 0;

        for (int i = 3; i <= 10; i++) {
            if (i == 3) {
                System.out.print(a + " " + a + " ");
            }

            res = a + b;
            a = res - a;
            b = res;
            System.out.print(res + " ");
        }
    }

    /*
    * Практика рекурсии 1
    * */
    public static void recursion1(int arg1) {
        System.out.println(arg1);
        if (arg1 < 5) {
            recursion1(arg1 * 2);
        }
    }

    public static void recursion2(int arg1) {
        System.out.println(arg1);
        if (arg1 < 5) {
            recursion2(arg1 * 2);
        }
    }

    public static void recursion3(int arg1) {
        System.out.print(arg1 + " ");
        if (arg1 < 5) {
            recursion3(arg1 + 1);
        }
        System.out.print(arg1 + " ");
    }

    /*
    * Игра Ханойская башня
    * */
    public static void towerOfHanoi() {

    }

    public static int fibViaRecur(int arg) {
        if (arg == 0) {
            return 0;
        } else if (arg == 1) {
            return 1;
        } else {
            System.out.print(" " + arg);
//            return fibViaRecur(arg - 1) + fibViaRecur(arg - 2);
            return fibViaRecur(arg - 2) + fibViaRecur(arg - 1);
        }
    }
}