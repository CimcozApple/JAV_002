package lesson05;

import java.util.Arrays;

public class Class02 {
    public static void main(String [] args) {
        char [] arr = {65, 'r', 'r', 'a', 'y'};
        System.out.println(Arrays.toString(arr));

        String str1 = new String("stroka 1");
        String str2 = "stroka 2";

//        Scanner scan = new Scanner(System.in);
//        String str3 = scan.nextLine(); // метод next и nextLine возвращает строку

        String str4 = new String(arr);


        System.out.println(str1);
        System.out.println(str2);
//        System.out.println(str3);
        System.out.println(str4);

        String stringing = "Foo" + 3;
        String stringing2 = "Foo" + 3 + "Bar";
        System.out.println(stringing);
        System.out.println(stringing2);

//            char ch = 'A';
//            char ch2 = 65;//
//            System.out.println(ch + " " + ch2);
//            System.out.println(ch + ch2);
//            System.out.println(ch == ch2);

        System.out.println();
        String test = new String("Test-up and some testing");
//        System.out.println("Test --> charAt(1) - " + test.charAt(1));
//        System.out.println("Test ---> contains(1) - " + test.contains(1));
        System.out.println("Test ---> indexOf() - " + test.indexOf("t", 17) + "\n");
//        System.out.println("Test ---> lastIndexOf() - " + test.lastIndexOf());
//        System.out.println("Test ---> toUpperCase() - " + test.toUpperCase());
//        System.out.println("Test ---> toLowerCase() - " + test.toLowerCase());
//        System.out.println("Test ---> split() - " + test.split("-", 0));
//        System.out.println("Test ---> toCharArray() - " + test.toCharArray());
//        System.out.println("Test ---> length() - " + test.length());
//        System.out.println("Test ---> equalsIgnoreCase() - " + test.equalsIgnoreCase());
//        System.out.println("Test ---> equals() - " + test.equals());
//        System.out.println("Test ---> toCharArray() - " + test.toCharArray());

        for (String st : test.split(" ")) {
            System.out.println(st);
        }
        System.out.println();

        for (String st : test.split("-")) {
            System.out.println(st);
        }
        System.out.println();

        for (String st : test.split(" ", 3)) {
            System.out.println(st);
        }
        System.out.println();

//        for (String st : test.indexOf("up")) {
//            System.out.println(st);
//        }
//        System.out.println();


        /*
        * Пример 2
        * */
        String result = "AND";
        System.out.println(result.charAt(1)); // N (важен к регистру)
        System.out.println(result.contains("AND")); // true (AND содержит AND?)
        System.out.println(result.contains("ANd")); // false
        System.out.println(result.contains("AN")); // true (AND содержит AN?)
        System.out.println(result.equalsIgnoreCase("and")); // true (and содержит and?)
        System.out.println(result.equalsIgnoreCase("AND")); // true
        System.out.println(result.equalsIgnoreCase("ANX")); // false (and содержит anx?)
        System.out.println(result.indexOf('D')); // 2 (int ch - это 'D', регистр важен!)
        System.out.println(result.indexOf('N', 1)); // 1 (int ch, int fromIndex)
        System.out.println(result.indexOf("ND")); // 1 (String str, отображает индекс первой строки вхождения)
        System.out.println(result.indexOf("ND", 1)); //  (String str, int fromIndex)
        System.out.println(result.lastIndexOf('A')); // 2 (также как и indexOf() только ищет с конца в начало)
//        System.out.println(result.lastIndexOf());
//        System.out.println(result.lastIndexOf());
//        System.out.println(result.lastIndexOf());
        System.out.println(result.length()); // 3
        System.out.println(result.substring(0)); // AND
        System.out.println(result.substring(0, 2)); // AN
        System.out.println(result.toUpperCase()); // AND
        System.out.println(result.toLowerCase()); // and
        System.out.println(result.toCharArray()); // AND (превращает строку в char (то есть в массив))
        System.out.println(result.split("N")); // [Ljava.lang.String;@5acf9800
//        System.out.println(result.split());
//        System.out.println(result.); // тестовая сторка, для проверки методов


//            String str = "mama mula ramy mulom";
//            System.out.println(str.charAt(13)); // возвращает символ (char), расположенный по указанному индексу строки
//            System.out.println(str.contains("mul")); // проверяет, входит ли подстрока в строку
//            System.out.println(str.equals("mama mula ramy mulom")); // проверяет идентичность строк
//            System.out.println(str.equalsIgnoreCase("mamA mula raMy mulOm")); // проверяет идентичность строк игнорируя регистр
//            System.out.println(str.indexOf("a")); // возвращает индекс первого вхождения подстроки в строку (слева направо)
//            System.out.println(str.lastIndexOf("a")); // возвращает индекс первого вхождения подстроки в строку (справа налево)
//            System.out.println(str.substring(5, 14)); // возвращает длину строки
//            System.out.println(str.toLowerCase()); // приводит строку к нижнему регистру
//            System.out.println(str.toUpperCase()); // приводит строку к верхнему регистру
//            char [] ch = str.toCharArray(); // приводит строку к массиво символов (char)
//            System.out.println(Arrays.toString(ch));

    }
}