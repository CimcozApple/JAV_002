public class Pattern_024 {
    public static void main(String[] args) {
        // 24
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        int k = 4;
        for (int i = 1; i <= 5; i++) {
            for (int a = k; a >= 1; a--) {
                System.out.print("  ");
            }

            for (int m = 1;m <= i; m++) {
                System.out.print("* ");
            }
            k--;
            System.out.println();
        }
        System.out.println();
    }
}