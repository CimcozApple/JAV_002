public class Pattern_022 {
    public static void main(String[] args) {
        // 22
        // E E E E E
        // D D D D
        // C C C
        // B B
        // A
        for (int i = 5, lastLetter = 69; i >= 1; i--) {
            for (int a = i; a >= 1; a--) {
                System.out.print((char) lastLetter + " ");
            }
            System.out.println();
            lastLetter--;
        }
    }
}