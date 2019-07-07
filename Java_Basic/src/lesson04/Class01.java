package lesson04;

/*
 * for each
 * */

/*
 * Методы/Процедуры/Функции
 * Именованный блок кода, у него есть имя и описаны инструкции.
 * Внутри метода нельзя писать другой метод, можно вызывать другой метод.
 * */
public class Class01 {
    public static void main(String[] args) {
        printFoo();
        printFoo2(5);

        int res = sum(3, 3);
        System.out.println(res);

        int a = 10;
    }

    /*
     * Три состояния
     *
     * Метод можно определить, то есть описать внутри блок кода.
     * Для чего метод? Чтобы вынести отдельный, законченный кусок логического кода.
     * Домашку сделать в разных методах.
     * */

    /*
    * break применяется в циклах либо свитч
    * continue итерация в циках
    * return возвращает в методе
    * */
    public static void printFoo() {
        System.out.println("Foo");
        System.out.println("Foo");
        return;
    }

    public static void printFoo2(int a) {
        System.out.println(a);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void foo() {
        /*
        * Примитивы передаются по значению (создаются в стеке)
        * Объекты, (например массив) передаюьтся по ссылке (создаются в куче), пример ниже:
        * */
//        public static void main(String[] args) {
//            int [] arr = {1, 2, 3, 4, 5};
//            foo(arr);
//            System.out.println(Arrays.toString(arr));
//        }

//        public static void foo(int [] arr) {
//            arr[1] = 99;
//        }
    }
}