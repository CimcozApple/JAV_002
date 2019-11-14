public class Pattern_046 {
    public static void main(String[] args) {
        /*
        * 46
        *         A
        *       A B A
        *     A B C B A
        *   A B C D C B A
        * A B C D E D C B A
        * */
        int numberRowsOfPyramid = 2;
        int spacesBeforeLetter = numberRowsOfPyramid - 1;
        int zLetter = 91;

        for (int i = 0; i < numberRowsOfPyramid; i++) {
            for (int a = 0; a < spacesBeforeLetter; a++) {
                System.out.print("  ");
            }
            spacesBeforeLetter--;

            for (int b = -1, aLetter = 65; b < i; b++) { // first part of A B
                System.out.print((char) aLetter + " ");
                aLetter++;
            }

//            for (int c = 0; c < ) { // second part of B A
//
//            }

            System.out.println();
        }
    }
}