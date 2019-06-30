package lesson02;

/*
 * Обмен
 * Объявить две переменные типа byte и float,
 * вывести на экран (сначала byte, затем float),
 * поменять их значения местами,
 * не используя дополнительной переменной
 * и вывести на экран в том же порядке
 * Пример:
 * 20 4.0
 * 4 20.0
 * */
public class HomeClass07 {
    public static void main(String[] args) {
        byte a = 20;
        float b = (float) 4.0;
        System.out.println(a + " " + b);

        a = (byte) ((byte) a + b); // 20 + 4 = 24
        b = (float) a - b; // 24 - 4 = 20
        a = (byte) ((byte) a - b); // 24 - 20 = 4

        System.out.println(a + " " + b);
    }
}