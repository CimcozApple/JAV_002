public class Pattern_042 {
    public static void main(String[] args) {
        /*
         * 42
         *         A
         *       C B A
         *     E D C B A
         *   G F E D C B A
         * I H G F E D C B A
         *
         * 'howManyRowsDoYouNeed' value preferably be from 1 up to 13
         * */
        int howManyRowsDoYouNeed = 13;
        int countOfSpacesBeforeFirstNumber = howManyRowsDoYouNeed - 1;

        for (int i = 0, backLetter = 1, letter = 65; i < howManyRowsDoYouNeed; i++) {
            for (int a = 0; a < countOfSpacesBeforeFirstNumber; a++) {
                System.out.print("  ");
            }
            countOfSpacesBeforeFirstNumber--;

            for (int b = 0; b < backLetter; b++) {
                System.out.print((char) letter + " ");
                letter--;
            }
            System.out.println();
            backLetter += 2;
            letter = letter + backLetter;
        }
    }
}