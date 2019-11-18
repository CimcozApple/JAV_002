public class Pattern_047 {
    public static void main(String[] args) {
        /*
        * 47
        * * * * * * * * * *
        *   * * * * * * *
        *     * * * * *
        *       * * *
        *         *
        * */
        int height = 10;
        int space = 0;
        int numberOfStars = height * 2 - 1;

        for (int i = 0; i < height; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print("  ");
            }

            space++;

            for (int b = 0; b < numberOfStars; b++) {
                System.out.print("* ");
            }

            numberOfStars -= 2;
            System.out.println();
        }
    }
}