public class Pattern_048 {
    public static void main(String[] args) {
        /*
        * 48
        * 5 5 5 5 5 5 5 5 5
        *   4 4 4 4 4 4 4
        *     3 3 3 3 3
        *       2 2 2
        *         1
        * change only 'height' variable
        * 'height' value should prefer from 1 up to 9
        * */
        int height = 9;
        int digitWhichShouldBeInConsole = height;
        int space = 0;
        int numberOfDigitsInRow = (height * 2) - 1;

        for (int i = 0; i < height; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print("  ");
            }

            space++;

            for (int b = 0; b < numberOfDigitsInRow; b++) {
                System.out.print(digitWhichShouldBeInConsole + " ");
            }

            numberOfDigitsInRow -= 2;
            digitWhichShouldBeInConsole--;
            System.out.println();
        }
    }
}