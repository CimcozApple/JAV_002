package lesson12;

public class Task_12_1 {
    public static void main(String[] args) {
        int x = 10;
//        int y = 0;
        int y = 10;
        int arr [] = new int [5];

//        try {
//            d = x / y;
//        } catch (Exception e) {
//            System.out.println("Ошибка. Деление на ноль");
////            e.printStackTrace();
//        }
//        System.out.println(d);

        System.out.println(foo(x, y, arr));
    }

    private static double foo(int x, int y, int [] arr) {
        double d = 0;
        try {
            d = x / y;
            System.out.println(arr[10]);
//        } catch (Exception e) {
        } catch (ArithmeticException e) {
            System.out.println("Ошибка. Деление на ноль");
            e.printStackTrace(); // можно понять, где мы в стеке поломались
        } catch (ArrayIndexOutOfBoundsException aioobe) { // можно через OR перечислять, перечилсять по иерархии снизу вверх
            System.out.println("Вышли за массив");
            aioobe.printStackTrace();
        } catch (RuntimeException rte) {
            rte.printStackTrace();
        }
        return d;
    }
}