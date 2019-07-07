package lesson02;

/**
 * Hello 5
 * Hello 5
 * Hello 4
 * Hello 4
 * Hello 3
 * Hello 3
 * Hello 2
 * Hello 2
 * Hello 1
 * Hello 1
 * Hello 0
 * */
public class Task_2_3 {
    public static void main(String[] args) {
        hi(5);
    }

    public static void hi(int i) {
        System.out.println("Hello " + i);

        if (i == 0) {
            return;
        }

        System.out.println("Hello " + i);
        hi(--i);
    }
}