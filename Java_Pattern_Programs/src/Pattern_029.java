public class Pattern_029 {
    public static void main(String[] args) {
        // 29
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *
        System.out.println("----------29");
        int agf = 1;
        for (int i = 0; i <= 4; i++) {
            for (int axv = 1; axv <= i; axv++) {
                System.out.print("  ");
            }

            for (int ax = 5; ax >= agf; ax--) {
                System.out.print("* ");
            }
            agf++;
            System.out.println();
        }
        System.out.println();
    }
}