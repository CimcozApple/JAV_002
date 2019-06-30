package lesson06;

public class CatRunner {
    public static void main(String[] args) {
        Cat[] myCats = {new Cat(), new BritishCat(), new PersianCat()};

//        Object cat = new Cat();
//        cat.

        for (Cat cat : myCats) {
            cat.move();
        }

//        for (int i = 0; i < myCats.length; i++) {
//            Cat c = myCats[i];
//            c.move();
//        }

        Cat c = new Cat();
//        c. // нет метода sound

        BritishCat catty = new BritishCat();
        catty.sound(); // есть метода sound

//        Cat myCat1 = new BritishCat();
//        BritishCat myCat2 = (BritishCat)myCat1;
//        System.out.println(myCat1 instanceof PersianCat);
//        if (myCat1 instanceof PersianCat) {
//            PersianCat myCat3 = (PersianCat) myCat1;
//        }
    }
}