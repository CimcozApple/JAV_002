package lesson05;

/*
* Task 9
* Написать метод, возвращающий вторую половину строки.
* Пример:
* МАМА МЫЛА РАМУ МЫЛОМ
* РАМУ МЫЛОМ
* */
public class Class07 {
    public static void main(String[] args) {
        String fullString = "МАМА МЫЛА РАМУ МЫЛОМ";
        System.out.println("'Second part' of string: " + getSecondPartOfString(fullString));
        System.out.print("\n- - - - - - - - - - - - - - -PROGRAM IS ENDED");
    }

    public static String getSecondPartOfString(String s) {
        System.out.println("- - - - - - - - - - - - - - -PROGRAM IS STARTED\n");
        String result = s;
        System.out.println("'Full' string: " + result);

        // вариант 1
//        result = result.substring(result.length() / 2);

        // вариант 2
//        result = result.substring(10, 20);

        // вариант 3
//        result = result.substring(10);

        // вариант 4
        int halfOfString = result.length() / 2;
        char [] array = result.toCharArray();
        char [] array2 = new char [halfOfString];
        for (int i = halfOfString, k = 0; i < result.length(); i++, k++) {
//            System.out.print(array[i] + "");
            array2[k] = array[i];
//            System.out.println(Arrays.toString(array2));
        }

        String convert = String.valueOf(array2);
        result = convert;
//        System.out.println(result);
        return  result;
    }
}