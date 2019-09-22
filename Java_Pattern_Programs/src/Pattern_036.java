public class Pattern_036 {
    public static void main(String[] args) {
        /*
         * 36
         *         1
         *       3 3 3
         *     5 5 5 5 5
         *   7 7 7 7 7 7 7
         * 9 9 9 9 9 9 9 9 9
         *
         * row value preferably be from 1 up to 5
         * */
        int row = 5;
        int spaces = row - 1;
        int digits = 1;

        for (int i = 0; i < row; i++) {
            for (int a = 0; a < spaces; a++) {
                System.out.print("  ");
            }
            spaces--;

            for (int b = 0; b < digits; b++) {
                System.out.print(digits + " ");
            }
            digits = digits + 2;
            System.out.println();
        }
    }
}