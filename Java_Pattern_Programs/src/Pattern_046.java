public class Pattern_046 {
    public static void main(String[] args) {
        /*
        * 46
        *         A
        *       A B A
        *     A B C B A
        *   A B C D C B A
        * A B C D E D C B A
        * change only 'numberRowsOfPyramid' value for increase or decrease height of pyramid, preferably from 1 up to 26
        * */
        int numberRowsOfPyramid = 26;
        int spacesBeforeLetter = numberRowsOfPyramid - 1;

        for (int i = 0; i < numberRowsOfPyramid; i++) {
            for (int a = 0; a < spacesBeforeLetter; a++) {
                System.out.print("  ");
            }
            spacesBeforeLetter--;

            int aLetter = 65;
            for (int b = -1; b < i; b++) { // first part of A B
                System.out.print((char) aLetter + " ");
                aLetter++;
            }

            --aLetter;
            for (int c = 0; c < i; c++) { // second part of B A
                --aLetter;
                System.out.print((char) aLetter + " ");
            }
            System.out.println();
        }
    }
}