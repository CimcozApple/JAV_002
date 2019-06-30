package lesson02;

/**
 * Возвышение 0
 * Возвышение 1
 * Возвышение 2
 * Возвышение 3
 * Убывание 3
 * Убывание 2
 * Убывание 1
 * Убывание 0
 * */
public class Task_2_4 {
    public static void main(String [] args) {
        hi(0);
    }

    public static void hi(int i) {
        if (i > 3) {
            return;
        }

        System.out.println("Возвышение " + i);
        hi(i + 1);
        System.out.println("Убывание " + i);
        return;
    }
}