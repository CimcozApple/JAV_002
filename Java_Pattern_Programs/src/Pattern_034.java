public class Pattern_034 {
    public static void main(String[] args) {
        /*
         * 34
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         * */
        for (int i = 0, y = 4, x = 1; i < 5; i++) {
            for (int a = y; a > 0; a--) {
                System.out.print(" ");
            }
            y--;

            for (int b = 0; b < x; b++) {
                System.out.print("*");
            }
            x = x + 2;
            System.out.println();
        }
    }
}