public class Pattern_029 {
    public static void main(String[] args) {
        // 29
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *
        for (int i = 0, asterisk = 1; i <= 4; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("  ");
            }

            for (int b = 5; b >= asterisk; b--) {
                System.out.print("* ");
            }
            asterisk++;
            System.out.println();
        }
    }
}