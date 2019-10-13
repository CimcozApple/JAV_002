public class Pattern_018 {
    public static void main(String[] args) {
        // 18
        // A A A A A
        // B B B B
        // C C C
        // D D
        // E
        for (int i = 65, letter = 5; i <= 70; i++) {
            for (int a = letter; a >= 1; a--) {
                System.out.print((char) i + " ");
            }
            letter--;
            System.out.println();
        }
    }
}