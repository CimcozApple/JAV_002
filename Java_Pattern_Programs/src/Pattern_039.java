public class Pattern_039 {
    public static void main(String[] args) {
        /*
         * 39
         *         1
         *       1 2 3
         *     1 2 3 4 5
         *   1 2 3 4 5 6 7
         * 1 2 3 4 5 6 7 8 9
         *
         * row value preferably be from 1 up to 6
         * */
        int rows = 5;
        int spaces = rows - 1;

        for (int i = 0, count = 1; i < rows; i++) {
            for (int a = 0; a < spaces; a++) {
                System.out.print("  ");
            }
            spaces--;

            for (int b = 0, digit = 1; b < count; b++) {
                System.out.print(digit + " ");
                digit++;
            }
            System.out.println();
            count += 2;
        }
    }
}