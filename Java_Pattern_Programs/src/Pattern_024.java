public class Pattern_024 {
    public static void main(String[] args) {
        // 24
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        for (int i = 1, space = 4; i <= 5; i++) {
            for (int a = space; a >= 1; a--) {
                System.out.print("  ");
            }

            for (int asterisk = 1; asterisk <= i; asterisk++) {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
    }
}