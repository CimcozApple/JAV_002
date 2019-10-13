public class Pattern_015 {
    public static void main(String[] args) {
        // 15
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        for (int i = 5; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}