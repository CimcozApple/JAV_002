public class Pattern_041 {
    public static void main(String[] args) {
        /*
         * 41
         *         A
         *       A B C
         *     A B C D E
         *   A B C D E F G
         * A B C D E F G H I
         *
         * 'howManyRowsDoYouNeed' value preferably be from 1 up to 13
         * */
        int howManyRowsDoYouNeed = 13;
        int countOfSpacesBeforeFirstNumber = howManyRowsDoYouNeed - 1;

        for (int i = 0, firstLetter = 1; i < howManyRowsDoYouNeed; i++) {
            for (int a = 0; a < countOfSpacesBeforeFirstNumber; a++) {
                System.out.print("  ");
            }
            countOfSpacesBeforeFirstNumber--;

            for (int b = 0, nextLetter = 65; b < firstLetter; b++) {
                System.out.print((char) nextLetter + " ");
                nextLetter++;
            }
            System.out.println();
            firstLetter += 2;
        }
    }
}