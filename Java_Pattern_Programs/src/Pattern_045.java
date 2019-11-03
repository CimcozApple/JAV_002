public class Pattern_045 {
    public static void main(String[] args) {
        /*
        * 45
        *         1
        *       1 2 1
        *     1 2 3 2 1
        *   1 2 3 4 3 2 1
        * 1 2 3 4 5 4 3 2 1
        * */
        int countOfRows = 3;
        int countOfSpacesBeforeFirstDigit = countOfRows - 1;

        for (int i = 0; i < countOfRows; i++) {
            for (int a = 0; a < countOfSpacesBeforeFirstDigit; a++) {
                System.out.print("  ");
            }

            countOfSpacesBeforeFirstDigit--;

            for (int b = 0; b < 1; b++) {

            }

            System.out.println();
        }
    }
}