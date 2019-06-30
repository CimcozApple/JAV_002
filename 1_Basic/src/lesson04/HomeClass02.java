package lesson04;

/*
* Task 2
* Вектор палиндром
* Написать класс с методом,
* определяющий является ли массив палиндромом
* (одинаково читается и справа и слева).
* Имя метода: isVectorPalindrom()
* Пример палиндрома:
* 1234321
* */
public class HomeClass02 {
    public static void main(String [] args) {
//        int [] array = {1, 2, 2, 0}; // 4 false
//        int [] array = {1, 2, 0, 1, 1}; // 5 false
//        int [] array = {0, 4, 0, 1, 4, 0}; // 6 false
//        int [] array = {1, 2, 0, 2, 1}; // 5 true
//        int [] array = {1, 2, 3, 4, 3, 2, 1}; // 7 true
        int [] array = {1, 4, 6, 0, 9, 9, 0, 6, 4, 1}; // 10 true
        System.out.println(isVectorPalindrom(array));
    }

    public static boolean isVectorPalindrom(int [] arrayFromMainMethod) {
        boolean result = false;

        int halfSizeOfArray = arrayFromMainMethod.length / 2;

        if (arrayFromMainMethod.length % 2 == 0) {
            for (int i = 0, k = arrayFromMainMethod.length - 1; i < halfSizeOfArray; i++, k--) {
                if (arrayFromMainMethod[i] != arrayFromMainMethod[k]) {
                    return false;
                } else if (arrayFromMainMethod[i] == arrayFromMainMethod[k]) {
                    result = true;
                }
            }
        } else if (arrayFromMainMethod.length % 2 == 1) {
            for (int i = 0, k = arrayFromMainMethod.length - 1; i < halfSizeOfArray; i++, k--) {
                if (arrayFromMainMethod[i] != arrayFromMainMethod[k]) {
                    return false;
                } else if (arrayFromMainMethod[i] == arrayFromMainMethod[k]) {
                    result = true;
                }
            }
        }
        return result;
    }
}