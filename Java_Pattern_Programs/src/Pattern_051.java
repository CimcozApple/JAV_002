public class Pattern_051 {
    public static void main(String[] args) {
        /*
        * 51
        * E E E E E E E E E
        *   D D D D D D D
        *     C C C C C
        *       B B B
        *         A
        * change only 'height' value from 1 to 26
        * */
        int height = 26;
        int space = 0;
        int firstLetter = 65;
        int letterToConsole = (firstLetter + height) - 1;
        int numberOfLettersToConsole = height * 2 - 1;

        for (int i = 0; i < height; i++) {
            for (int a = 1; a <= space; a++) {
                System.out.print("  ");
            }

            space++;

            for (int b = 0; b < numberOfLettersToConsole; b++) {
                System.out.print((char) letterToConsole + " ");
            }

            numberOfLettersToConsole -= 2;
            --letterToConsole;
            System.out.println();
        }
    }
}