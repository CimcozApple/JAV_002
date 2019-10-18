public class Pattern_027 {
    public static void main(String[] args) {
        // 27
        //         A
        //       B B
        //     C C C
        //   D D D D
        // E E E E E
        for (char i = 65, spacesBeforeLetter = 4, letter = 65; i <= 69; i++) {
            for (int a = spacesBeforeLetter; a >= 1; a--) {
                System.out.print("  ");
            }
            spacesBeforeLetter--;

            for (char b = 65; b <= letter; b++) {
                System.out.print(letter + " ");
            }

            letter++;
            System.out.println();
        }
    }
}