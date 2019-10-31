public class Pattern_043 {
    public static void main(String[] args) {
        /*
         * 43
         *         0
         *       1 0 1
         *     2 1 0 1 2
         *   3 2 1 0 1 2 3
         * 4 3 2 1 0 1 2 3 4
         *
         * 'howManyRowsDoYouNeed' value preferably be from 1 up to 10
         * */
        int howManyRowsDoYouNeed = 10;
        int countOfSpacesBeforeFirstNumber = howManyRowsDoYouNeed - 1;

        for (int i = 0, countDigit = 1, digit = 0, newRightDigit = 0; i < howManyRowsDoYouNeed; i++) {
            for (int a = 0; a < countOfSpacesBeforeFirstNumber; a++) {
                System.out.print("  ");
            }
            countOfSpacesBeforeFirstNumber--;

            for (int b = 0; b < countDigit; b++) {
                System.out.print(digit + " ");
                digit--;
            }

            for (int c = 0, aw = 1; c < newRightDigit; c++) {
                System.out.print(aw + " ");
                aw++;
            }
            System.out.println();
            newRightDigit++;
            digit = countDigit;
            countDigit += 1;
        }
    }
}