public class Pattern_040 {
    public static void main(String[] args) {
        /*
         * 40
         *         1
         *       3 2 1
         *     5 4 3 2 1
         *   7 6 5 4 3 2 1
         * 9 8 7 6 5 4 3 2 1
         *
         * row value preferably be from 1 up to 5
         * */
        int rows = 5;
        int spaces = rows - 1;

        for (int i = 0, digit = 1; i < rows; i++) {
            for (int a = 0; a < spaces; a++) {
                System.out.print("  ");
            }
            spaces--;

            int backCount = digit;
            for (int b = 0; b < digit; b++) {
                System.out.print(backCount + " ");
                backCount--;
            }
            System.out.println();
            digit += 2;
        }
    }
}