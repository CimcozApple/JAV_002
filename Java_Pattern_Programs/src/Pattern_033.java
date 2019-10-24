public class Pattern_033 {
    public static void main(String[] args) {
        // 33
        // A B C D E
        //   A B C D
        //     A B C
        //       A B
        //         A
        for (int i = 0, lastLetter = 70, count = 0; i <= 4; i++) {
            for (int a = 0; a < count; a++) {
                System.out.print("  ");
            }
            count++;

            for (int b = 65; b < lastLetter; b++) {
                System.out.print((char) b + " ");
            }
            lastLetter--;
            System.out.println();
        }
    }
}