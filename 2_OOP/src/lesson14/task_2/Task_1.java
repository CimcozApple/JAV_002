package lesson14.task_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        myMap.put("three", 4);

        System.out.println(myMap);
        System.out.println(myMap.size());
        System.out.println(myMap.values());
        System.out.println(myMap.keySet());
        System.out.println(myMap.containsKey("one"));
        System.out.println(myMap.containsValue(2));
        System.out.println(myMap.get("one"));
        System.out.println(myMap.remove("one"));
        System.out.println(myMap);


        Set<Map.Entry<String, Integer>> set = myMap.entrySet();
        Iterator<Map.Entry<String, Integer>> i = set.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> me = i.next();
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
    }
}


//package lesson14;
//
//        import java.io.*;
//
//public class Task14_2 {
//    public static void main(String[] args)throws IOException {
//        //write();
//        read();
//    }
//    public static void write()throws IOException{
//        String filename = "d:/!/123/text.txt";
//        FileWriter fw = new FileWriter(filename);
//        fw.write("Hello java 1234" + System.lineSeparator());
//        fw.write("Hello java 1234" + System.lineSeparator());
//        fw.write("Hello java 1234" + System.lineSeparator());
//        fw.write("Hello java 1234" + System.lineSeparator());
//
//
//        fw.flush(); // записать все по месту
//        fw.close();
//    }
//
//    public static void read()throws IOException{
//        String filename = "d:/!/123/text.txt";
//        BufferedInputStream fr = new BufferedInputStream(
//                new FileInputStream(filename));
//
//        int ch =0;
//        StringBuilder str = new StringBuilder("");
//
//        while ((ch = fr.read()) != -1) {
//            str.append((char)ch).append((char)10);
//            //System.out.println(ch);
//        }
//
//        System.out.println(str);
//        fr.close();
//    }
//}


// try с ресурсами
//package lesson14;
//
//        import java.io.FileReader;
//        import java.io.FileWriter;
//        import java.io.IOException;
//
//public class Task14_2 {
//    public static void main(String[] args)throws IOException {
//        //write();
//        read();
//    }
//    public static void write()throws IOException{
//        String filename = "d:/!/123/text.txt";
//        FileWriter fw = new FileWriter(filename);
//        fw.write("Hello java 1234" + System.lineSeparator());
//        fw.write("Hello java 1234" + System.lineSeparator());
//        fw.write("Hello java 1234" + System.lineSeparator());
//        fw.write("Hello java 1234" + System.lineSeparator());
//
//
//        fw.flush(); // записать все по месту
//        fw.close();
//    }
//
//    public static void read()throws IOException{
//        String filename = "d:/!/123/text.txt";
//        StringBuilder str = new StringBuilder("");
//        try(FileReader fr = new FileReader(filename)) {
//            int ch = 0;
//            while ((ch = fr.read()) != -1) {
//                str.append((char) ch).append((char) 10);
//            }
//        }
//        System.out.println(str);
//    }
//}


//package lesson14;
//
//        import java.io.*;
//
//public class CopyFile {
//    public static void main(String[] args) throws IOException {
//
//        long before = System.currentTimeMillis();
//
//        int i;
//        String fileSource = "c:\\!\\img13.jpg";
//        String fileDestination = "c:\\!\\img_new.jpg";
//        FileInputStream fin = new FileInputStream(fileSource);
//        FileOutputStream fout = new FileOutputStream(fileDestination);
//
//        while ((i = fin.read()) != -1) {
//            fout.write(i);
//        }
//        fin.close();
//        fout.close();
//
//        long after = System.currentTimeMillis();
//        System.out.println("Time1 = " + (after - before));
//
//        fileDestination = "c:\\!\\img_buff.jpg";
//        before = System.currentTimeMillis();
//
//        BufferedInputStream brin = null;
//        BufferedOutputStream brout = null;
//
//        try {
//            int j;
//            brin = new BufferedInputStream(new FileInputStream(fileSource));
//            brout = new BufferedOutputStream(new FileOutputStream(fileDestination));
//
//            while ((j = brin.read()) != -1) {
//                brout.write(j);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (brin != null) brin.close();
//            if (brout != null) brout.close();
//        }
//
//        after = System.currentTimeMillis();
//        System.out.println("Time2 = " + (after - before));
//    }
//}

// как делают анимацию в консоле
// эксепшины