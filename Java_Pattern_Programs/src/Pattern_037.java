public class Pattern_037 {
    public static void main(String[] args) {
        /*
         * 37
         *         A
         *       B B B
         *     C C C C C
         *   D D D D D D D
         * E E E E E E E E E
         *
         * row value preferably be from 1 up to 26
         * */
        int rows = 26;
        int spaces = rows - 1;

        for (int i = 0, firstLetter = 65, countOfRepeats = 1; i < rows; i++) {
            for (int a = 0; a < spaces; a++) {
                System.out.print("  ");
            }
            spaces--;

            for (int b = 0; b < countOfRepeats; b++) {
                System.out.print((char) firstLetter + " ");
            }
            countOfRepeats += 2;
            firstLetter++;
            System.out.println();
        }
    }
}