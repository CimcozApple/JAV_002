package lesson01;

public class Class02 {
    // ЦЕЛОЧИСЛЕННЫЕ
    // byte - занимает 1 байт (256 значений) = от -128 до 127
    // short - занимает 2 байта = -32768 до 32767
    // int - заниммает 4 байта = 2 147 483 648 до 2 147 483 647
    // long - занимает 8 байт - 9...... до 9.....

    // ВЕЩСТВЕННЫЙ
    // float - занимает 4 байта = 7 цифр после запятой
    // double - занимает 8 байт = 15-16 цифр после запятой

    // СИМВОЛЬНЫЙ
    // char - 2 занимает байт = 0 - 65536 первый символов из АСКИ

    // ЛОГИЧЕСКИЙ
    // boolean - занимает 1 байт = true/false

    public static void main(String [] args) {
        int age = 28, var2, var3, var4 = 1; // один из видов объявления и инициализации
        float fl = 4.34F;
        double dou = 43.5;
        char ch = 'A';
        boolean boo2 = false;
        System.out.println(age);
/*************************/
        // унарные операторы
        // ++ -- инкремент и декремент
        int abc = 1;
        abc++; // суфикс
        ++abc; // префикс
        System.out.println(abc);
/*************************/
        // бинарные операторы a + b
        // + - / * %
        int var = 5;
        System.out.println(var / 2);
/*************************/
        int a = 5;
        int b = 8;
        double c = 2.8;
        double d = 3.3;

        double res = (a + b + c + d) / 4;
        System.out.println("Среднее арифметическое - " + res);
    }
}