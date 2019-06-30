/*
* 5 4 3 2 1
* 5 4 3 2 1
* 5 4 3 2 1
* 5 4 3 2 1
* 5 4 3 2 1
* */
public class Pattern_007 {
    public static void main(String[] args) {
        // pattern 7
        int foo3 = 5;
        int fooE3 = 1;
        for (int i = foo3; i >= fooE3; i--) {
            for (int a = foo3; a >= fooE3; a--) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}