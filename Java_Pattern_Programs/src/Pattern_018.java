public class Pattern_018 {
    public static void main(String[] args) {
        // 18
        // A A A A A
        // B B B B
        // C C C
        // D D
        // E
        int c = 5;
        for (char i = 65; i <= 70; i++) {
            for (int a = c; a >= 1; a--) {
                System.out.print(i + " ");
            }
            c--;
            System.out.println();
        }
    }
}