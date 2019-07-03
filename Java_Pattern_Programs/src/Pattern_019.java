public class Pattern_019 {
    public static void main(String[] args) {
        // 19
        // A B C D E
        // A B C D
        // A B C
        // A B
        // A
        char b = 69;
        for (int i = 5; i >= 1; i--) {
            for (char a = 65; a <= b; a++) {
                System.out.print(a + " ");
            }
            b--;
            System.out.println();
        }
        System.out.println();
    }
}