public class Pattern_052 {
    public static void main(String[] args) {
        /*
        * 52
        * I I I I I I I I I
        *   G G G G G G G
        *     E E E E E
        *       C C C
        *         A
        *
        * */
        int heightOfPyramid = 5;
        int space = 0;
        int letter = (65 + (heightOfPyramid * 2)) - 2;
        int count = heightOfPyramid * 2 - 1;

        for (int i = 0; i < heightOfPyramid; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print("  ");
            }

            space++;

            for (int b = 0; b < count; b++) {
                System.out.print((char) letter + " ");
            }

            letter -= 2;
            count -= 2;
            System.out.println();
        }
    }
}