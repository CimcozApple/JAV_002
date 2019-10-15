public class Pattern_023 {
    public static void main(String[] args) {
        // 23
        // E D C B A
        // E D C B
        // E D C
        // E D
        // E
        for (int i = 5; i >= 1; i--) {
            for (int a = i, lastLetter = 69; a >= 1; a--) {
                System.out.print((char) lastLetter + " ");
                lastLetter--;
            }
            System.out.println();
        }
    }
}