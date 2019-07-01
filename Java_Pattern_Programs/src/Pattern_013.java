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
    }
}