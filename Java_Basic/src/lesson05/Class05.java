package lesson05;

/*
* Task 7
* Написать метод, принимающий в качестве параметра строку,
* возвратить индекс первого вхождения символа "a" этой строки.
* */
public class Class05 {
    public static void main(String[] args) {
        System.out.println("Index: " + getIndexOfA("MacBook"));
    }

    public static int getIndexOfA(String s) {
        // вариант 1
//        int index = -1;
//        index = s.indexOf('a');
//        return index;

        // вариант 2
        return s.indexOf('a');
    }
}