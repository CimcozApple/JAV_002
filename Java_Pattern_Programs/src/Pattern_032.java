public class Pattern_032 {
    public static void main(String[] args) {
        // 32
        // E E E E E
        //   D D D D
        //     C C C
        //       B B
        //         A
        for (int i = 1, firstLetter = 65, lastLetter = 69; i <= 5; i++) {
            for (int a = 1; a < i; a++) {
                System.out.print("  ");
            }

            for (char b = 69; b >= firstLetter; b--) {
                System.out.print((char) lastLetter + " ");
            }
            firstLetter++;
            lastLetter--;
            System.out.println();
        }
    }
}