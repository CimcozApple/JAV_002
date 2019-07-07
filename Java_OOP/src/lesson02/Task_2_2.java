package lesson02;


/**
 * Hello 5
 * */
public class Task_2_2 {
    static int count = 0;

    public static void main(String[] args) {
        hi(5);
    }

    public static void hi(int i) {
        count++;
        System.out.println("Hello " + i);

        if (count == 10) {
            return;
        }
    }
}