public class Pattern_016 {
    public static void main(String[] args) {
        // 16
        // 1 1 1 1 1
        // 2 2 2 2
        // 3 3 3
        // 4 4
        // 5
        for (int i = 5, b = 1; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print(b + " ");
            }
            b++;
            System.out.println();
        }
        System.out.println();
    }
}