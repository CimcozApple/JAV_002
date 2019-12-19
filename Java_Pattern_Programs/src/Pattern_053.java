public class Pattern_053 {
    public static void main(String[] args) {
        /*
        * 53
        * A B C D E F G H I
        *   A B C D E F G
        *     A B C D E
        *       A B C
        *         A
        * change value of 'heightOfPyramid' variable from 1 up to 13
        * */
        int heightOfPyramid = 13;
        int space = 0;
        int upTo = (heightOfPyramid * 2) - 1;

        for (int i = 0; i < heightOfPyramid; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print("  ");
            }

            space++;

            for (int b = 0, firstLetter = 65; b < upTo; b++) {
                System.out.print((char) firstLetter + " ");
                firstLetter++;
            }

            upTo -= 2;
            System.out.println();
        }
    }
}