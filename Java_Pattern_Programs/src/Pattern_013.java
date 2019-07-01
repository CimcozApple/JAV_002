/*
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * */
public class Pattern_013 {
    public static void main(String[] args) {
        char foo4 = 65; // A
        char fooE4 = 69; // E

        for (char i = 1, letter = 65; i <= 5; i++, letter++) {
            for (char a = i; a <= i + i - 1; a++) {
                System.out.print(letter);
            }
            System.out.println();
        }

        // 13
        // a
        // b b
        // c c c
        // d d d d
        // e e e e e
//        char s = 64;
//        char f = 69;
//        int x = 1;

//        for (char i = s; i <= f; i++) {
//            for (int a = 1; a < x; a++) {
//                System.out.print(i + " ");
//            }
//            x++;
//            System.out.println();
//        }

    }
}