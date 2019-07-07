package lesson08;

public class Task_8_2 {
     public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = "Hello";
        String s4 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        s4 = s4 + "  world";
        System.out.println(s4);
        s2 = foo(s2);
        System.out.println(s2);
    }

    public static String foo(String s2) {
        s2 = s2 + " world";
        return s2;
    }
}