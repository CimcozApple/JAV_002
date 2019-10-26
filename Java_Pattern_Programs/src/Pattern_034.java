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
        for (int i = 0, spaces = 4, asterisk = 1; i < 5; i++) {
            for (int a = spaces; a > 0; a--) {
                System.out.print(" ");
            }
            spaces--;

            for (int b = 0; b < asterisk; b++) {
                System.out.print("*");
            }
            asterisk = asterisk + 2;
            System.out.println();
        }
    }
}