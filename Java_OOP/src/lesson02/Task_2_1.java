package lesson02;

/**
 * Main Start
 * Hello, World!
 * Main End
 * */
public class Task_2_1 {
    public static void main(String[] args) {
        System.out.println("Main Start");
        hi(true);
        System.out.println("Main End");
    }

    public static void hi(boolean a) {
        if (a == false) {
            return;
        } else {
            System.out.println("Hello, World!");
        }
    }
}