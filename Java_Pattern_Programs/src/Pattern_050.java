public class Pattern_050 {
    public static void main(String[] args) {
        /*
        * 50
        * 1 2 3 4 5 6 7 8 9
        *   1 2 3 4 5 6 7
        *     1 2 3 4 5
        *       1 2 3
        *         1
        * */
        int heightOfUpsideDownPyramid = 5;
        int space = 0;
        int numberInRow = heightOfUpsideDownPyramid * 2 - 1;

        for (int i = 0; i < heightOfUpsideDownPyramid; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print("  ");
            }

            space++;

            int digit = 1;
            for (int b = 0; b < numberInRow; b++) {
                System.out.print(digit + " ");
                digit++;
            }

            numberInRow -= 2;
            System.out.println();
        }
    }
}