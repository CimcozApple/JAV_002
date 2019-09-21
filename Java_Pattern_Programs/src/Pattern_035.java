public class Pattern_035 {
    public static void main(String[] args) {
        /*
         * 35
         *         1
         *       2 2 2
         *     3 3 3 3 3
         *   4 4 4 4 4 4 4
         * 5 5 5 5 5 5 5 5 5
         *
         * row value preferably be from 1 up to 9
         * */
        int row = 9;
        for (int i = 1, x = row - 1, y = 1; i <= row; i++) {
            for (int a = 0; a < x; a++) {
                System.out.print("  ");
            }
            x--;

            for (int b = 0; b < y; b++) {
                System.out.print(i + " ");
            }
            y = y + 2;
            System.out.println();
        }
    }
}