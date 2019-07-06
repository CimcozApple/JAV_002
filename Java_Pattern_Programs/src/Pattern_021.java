public class Pattern_021 {
    public static void main(String[] args) {
        // 21
        // 5 4 3 2 1
        // 5 4 3 2
        // 5 4 3
        // 5 4
        // 5
        // определить сколько раз по ширине
        // определить сколько раз по высоте
        // определить что будем показывать
        for (int i = 5; i >= 1; i--) {
            int g = 5;
            for (int a = i; a >= 1; a--) {
                System.out.print(g + " ");
                g--;
            }
            System.out.println();
        }
        System.out.println();

    }
}