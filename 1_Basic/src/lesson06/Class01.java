package lesson06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Class01 {
    public static void main(String [] args) throws IOException {
        /*
        * nextLine() и next()
        * */

//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next(); // возвращает набор символов до пробела
//        String b = scanner.nextLine(); // возвращает набор символов, всю строку
//        System.out.println(scanner);

//        scanner.hasNext();

//        if (scanner.hasNextInt()) {
//        }

//        char f = scanner.next().charAt(0);
//        char f = scanner.next().substring(1).charAt(0); // yes ---> e

        /*
        * специальные символы (\ экранирование символа) и служебные символы ("")
        * \t - табуляция
        * \n - ентер
        * \n\r - тоже самое, работает сто пудово в винде
        * \f - переход на новую строануц
        * \r - возврат на начло строки
        * */

        /*
        * fileReader FileRider - это объекты, вообще их много,
        * потоки выполнения, потоки ввода и вывода/стримы
        * */

        // для работы с таблицами например:
        // \t в бок
        // \n абзац например для экселя

        /*
        * абсолютный путь - конкретный диск, папка и т. д.
        * относительный путь - относительно проекта, где запускаем файл
        * */

        /*
        * Записать в файл
        * */
        FileWriter fileWriter = new FileWriter("files/Lesson06Class01.txt"); // путь к файлу указываем в виде строки, будет перезаписывать файл
//        FileWriter fileWriter = new FileWriter("files/Lesson06Class01.txt", true); // если нужно дописать в файл (а не перезаписать), ставим - true
        fileWriter.write("string 1\n");
//        fileWriter.write("str 2\n");
//        fileWriter.write("str 3\n");
        fileWriter.flush();// принудительно ... метод close вызывает flush, но лучше нписать еще раз
        fileWriter.close(); // нужно закрывать его


//        Scanner scan = new Scanner(System.in);
//        if(scan.hasNextInt()) {
//            int a = scan.nextInt();
//            System.out.println(a);
//        } else {
//            scan.next();
//            System.out.println("error");
//        }

//        Scanner scan = new Scanner(System.in);
//        char ch = scan.next().charAt(0);
//        System.out.println(ch);



        /*
        * Прочитать из файла, вариант 1
        * */
//        FileReader fileReader = new FileReader("files/Lesson06Class01.txt"); // читает по символьно, возвразает в виде int, номерами
//        Scanner scanner2 = new Scanner(fileReader);
//        System.out.println(scanner2.nextLine());
//        System.out.println(scanner2.nextLine());
//        System.out.println(scanner2.nextLine());
//        System.out.println(scanner2.nextLine()); // если в документе три строки, четвертый запрос будет лишним, будет ошибка
//        System.out.println(scanner2.next()); // next() возвращает набор символов до первого пробела


//        int numOfStrings = 0;
//        while (scanner2.hasNextLine()) { // (аналог (пока документ != null)) чтобы прочитать весь документ и не знаем сколько там еще строк
//            System.out.println(scanner2.nextLine());
//            scanner2.nextLine();
//            numOfStrings++;
//        }
//        System.out.println(numOfStrings);
//        scanner2.close();

        /*
         * Прочитать из файла, вариант 2
         * */
//        while (fileReader.ready()) {
//            System.out.print((char) fileReader.read()); // reader возвращает int и работает только один раз, возвращает -1, то есть нужно после каждоой проверки создавать новый объект для считывания
//        }
//        fileReader.close();
    }
}