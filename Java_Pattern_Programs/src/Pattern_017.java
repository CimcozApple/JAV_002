public class Pattern_017 {
    public static void main(String[] args) {
        // 17
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        for (int i = 5, b = 1; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}