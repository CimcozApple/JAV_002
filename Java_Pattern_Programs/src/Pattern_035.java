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
         * 'numberOfRowsInPyramid' value preferably be from 1 up to 9
         * */
        int numberOfRowsInPyramid = 9;
        for (int i = 1, spaces = numberOfRowsInPyramid - 1, digit = 1; i <= numberOfRowsInPyramid; i++) {
            for (int a = 0; a < spaces; a++) {
                System.out.print("  ");
            }
            spaces--;

            for (int b = 0; b < digit; b++) {
                System.out.print(i + " ");
            }
            digit = digit + 2;
            System.out.println();
        }
    }
}