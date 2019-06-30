package lesson05;

/*
 * char это символьный тип
 * */
public class Class01 {
    public static void main(String [] args) {
        char a = 'A'; // можем написать только один символ, можно хранить 65536 значений первых, по индексам, по таблице юникода
        char b = 65; // можем написать только один код ASCII
//        System.out.println(a);
//        System.out.println(b);

        /*
        * Вся таблица символов
        * */
        for (int i = 0, k = 0; i <= 65_535; i++, k++) {
            System.out.print(k + " - ");
            System.out.println((char) i);
        }
//        System.out.println(Arrays.toString(tableOfChar));
    }
}