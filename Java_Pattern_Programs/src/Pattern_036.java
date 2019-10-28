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
        int numberOfRowsInPyramid = 5;
        int spacesBeforeDigit = numberOfRowsInPyramid - 1;
        int digit = 1;

        for (int i = 0; i < numberOfRowsInPyramid; i++) {
            for (int a = 0; a < spacesBeforeDigit; a++) {
                System.out.print("  ");
            }
            spacesBeforeDigit--;

            for (int b = 0; b < digit; b++) {
                System.out.print(digit + " ");
            }
            digit = digit + 2;
            System.out.println();
        }
    }
}