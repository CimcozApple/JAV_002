public class Pattern_044 {
    public static void main(String[] args) {
        /*
        * 44
        *         A
        *       B A B
        *     C B A B C
        *   D C B A B C D
        * E D C B A B C D E
        * change only 'howManyRowsDoYouNeed' value before general loop for increase or decrease height of pyramid
        * char 'howManyRowsDoYouNeed' value preferably be from 1 up to 26
        * */
        int howManyRowsDoYouNeed = 26;
        int countOfSpacesBeforeLetter = howManyRowsDoYouNeed - 1;
        int firstChar = 65;

        for (int i = 0; i < howManyRowsDoYouNeed; i++) {
            int upToFirstChar = firstChar + i;
            int afterFirstChar = firstChar + 1;

            for (int a = 0; a < countOfSpacesBeforeLetter; a++) {
                System.out.print("  ");
            }

            countOfSpacesBeforeLetter--;

            for (int b = -1; b < i; b++) {
                System.out.print((char) upToFirstChar + " ");
                upToFirstChar--;
            }

            for (int c = 0; c < i; c++) {
                System.out.print((char) afterFirstChar + " ");
                afterFirstChar++;
            }

            System.out.println();
        }
    }
}