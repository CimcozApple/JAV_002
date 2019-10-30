public class Pattern_038 {
    public static void main(String[] args) {
        /*
         * 38
         *         A
         *       C C C
         *     E E E E E
         *   G G G G G G G
         * I I I I I I I I I
         *
         * 'rows' value preferably be from 1 up to 13
         * */
        int rows = 13;
        int spaces = rows - 1;

        for (int i = 0, letter = 65, countOfLetters = 1; i < rows; i++) {
            for (int a = 0; a < spaces; a++) {
                System.out.print("  ");
            }
            spaces--;

            for (int b = 0; b < countOfLetters; b++) {
                System.out.print((char) letter + " ");
            }
            System.out.println();
            countOfLetters += 2;
            letter += 2;
        }
    }
}