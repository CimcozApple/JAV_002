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
        int countOfRows = 9;
        int countOfSpacesBeforeFirstDigit = countOfRows - 1;

        for (int i = 0; i < countOfRows; i++) {
            for (int a = 0; a < countOfSpacesBeforeFirstDigit; a++) {
                System.out.print("  ");
            }

            countOfSpacesBeforeFirstDigit--;

            int firstDigit = 1;
            for (int b = 0; b <= i; b++) {
                System.out.print(firstDigit + " ");
                firstDigit++;
            }

            int minusOneFromFirstDigit = firstDigit - 1;
            for (int c = 0; c < i; c++) {
                minusOneFromFirstDigit -= 1;
                System.out.print(minusOneFromFirstDigit + " ");
            }

            System.out.println();
        }
    }
}