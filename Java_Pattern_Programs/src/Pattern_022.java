public class Pattern_022 {
    public static void main(String[] args) {
        // 22
        // E E E E E
        // D D D D
        // C C C
        // B B
        // A
        char h = 69;
        for (int i = 5; i >= 1; i--) {
            for (int a = i; a >= 1; a--) {
                System.out.print(h + " ");
            }
            System.out.println();
            h--;
        }
        System.out.println();
    }
}