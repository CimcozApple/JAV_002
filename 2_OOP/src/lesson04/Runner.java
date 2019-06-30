package lesson04;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Marker marker1 = new Marker("Red", "Microsoft", 20);
        Marker marker2 = new Marker("Black", "Oracle", 15);
        Marker marker3 = new Marker("White", "BuroMax", 18);

//        Marker [] arr = new Marker[3];
//        arr[0] = marker1;
//        arr[1] = marker2;
//        arr[2] = marker3;
//
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for (Marker m: arr) {
//            System.out.println(m);
//        }

        /*
        * Коллекция основанная на массиве, ArrayList
        * */
        ArrayList <Marker> arrayList = new ArrayList<>();
//        ArrayList arrayList = new ArrayList();
        arrayList.add(marker1);
        arrayList.add(marker2);
        arrayList.add(marker3);
//        System.out.println(arrayList);

        for (Marker m : arrayList) {
            System.out.println(m);
        }
    }
}