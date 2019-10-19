public class Pattern_028 {
    public static void main(String[] args) {
        // 28
        //         A
        //       A B
        //     A B C
        //   A B C D
        // A B C D E
        for (char i = 65, letter = 65, spaces = 68; i <= 69; i++) {
            for (char a = spaces; a >= 65; a--) {
                System.out.print("  ");
            }
            spaces--;

            for (char b = letter; b <= i; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}