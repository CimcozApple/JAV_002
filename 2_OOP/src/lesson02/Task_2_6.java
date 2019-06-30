package lesson02;

public class Task_2_6 {
    public static void main(String [] args) {
        int [] arr = new int[10];

//        fill(arr, 0); // заполнить массив используя рекурсию
        fillLoop(arr); // заполнить массив используя for ()

//        printArr(arr,0); // отобразить элементы массива
        printArrLoop(arr);

//        System.out.println("Элемент 7 расположен под индектом: " + find(arr, 0, 7)); // найти значение 7 и отобразить его индекс в массиве, поиск с индекса 0
        System.out.println("Элемент 7 расположен под индектом: " + findLoop(arr, 7)); // найти значение 7 и отобразить его индекс в массиве, поиск с индекса 0
    }

    public static int find(int [] arr, int i, int el) {
        if (i < arr.length) {
            if (arr[i] == el) {
                return i;
            } else {
                return find(arr, i + 1, el);
            }
        } else {
            return -1;
        }
    }

    public static int findLoop(int [] arr, int el) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public static void fill(int [] arr, int i) {
        if (i < arr.length) {
            arr[i] = (int) (Math.random() * 10);
            fill(arr, i + 1);
        }
        return;
    }

    public static void fillLoop(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public static void printArr(int [] arr, int i) {
        if (i < arr.length) {
            System.out.print(arr[i] + " ");
            printArr(arr, i + 1);
        }else {
            System.out.println();
        }
    }

    public static void printArrLoop(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}