package lesson16;

public class Class1 {
}
//package lesson16;
//
//public class VolatileTest {
//    private static volatile int varVolat = 0;
//    private static int varNonVolat = 0;
//
//    public static void main(String[] args) {
//        ChangeListener thread1 = new ChangeListener();
//        ChangeMaker thread2 = new ChangeMaker();
//        thread1.start();
//        thread2.start();
//        try { Thread.sleep(500);
//        } catch (InterruptedException e) { }
//        thread1.interrupt();
//        thread2.interrupt();
//    }
//    static class ChangeMaker extends Thread {
//        @Override
//        public void run() {
//            int local_value = 0;
//            while ( !isInterrupted() ) {
//                varVolat = varNonVolat = ++local_value;
//            }
//        }
//    }
//    static class ChangeListener extends Thread {
//        @Override
//        public void run() {
//            while ( !isInterrupted() ) {
//                if (varVolat != varNonVolat) {
//                    System.out.println("Error: " + varVolat +
//                            " != " + varNonVolat);
//                }
//            }
//        }
//    }
//}



//package lesson16;
//
//public class TwoThreads {
//    public static void main(String args[]) {
//        final StringBuffer s = new StringBuffer();
//        new Thread() {
//            public void run() {
//                int i = 0;
//                synchronized (s){
//                    while (i++ < 3) {
//                        s.append("A");
//                        try { sleep(15);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(s);
//                    }}}}.start();
//
//        new Thread() {
//            public void run() {
//                int j = 0;
//                synchronized (s){
//                    while (j++ < 3) {
//                        s.append("B");
//                        try { sleep(10);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(s);
//                    }}}}.start();
//    }
//}



//package lesson16;
//
//        import java.io.File;
//        import java.io.IOException;
//        import java.io.RandomAccessFile;
//
//public class SynchroThreads {
//    public static void main(String[] args) {
//        Synhro s = new Synhro();
//        T t1 = new T("First", s);
//        T t2 = new T("Second", s);
//        t1.start();
//        t2.start();
//    }
//}
//
//class T extends Thread {
//    private String str;
//    private Synhro s;
//
//    public T(String str, Synhro s) {
//        this.str = str;
//        this.s = s;
//    }
//
//    public void run() {
//        for (int i = 0; i < 5; i++)
//            s.writing(str, i);
//    }
//}
//
//class Synhro {
//    private File f = new File("d:\\data.txt");
//
//    public Synhro() {
//        try {
//            f.delete();
//            f.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public synchronized void writing(String str, int i) {
//        try {
//            RandomAccessFile raf = new RandomAccessFile(f, "rw");
//            raf.seek(raf.length());
//            System.out.print(str);
//            raf.writeBytes(str);
//            Thread.sleep((long) (Math.random() * 15));
//            System.out.println("->" + i);
//            raf.writeBytes("->" + i + " ");
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}



//package lesson16;
//
//        import java.util.concurrent.atomic.AtomicInteger;
//
//public class Task16_2 {
//    public static void main(String[] args) {
//        MyCounter meter = new MyCounter();
//        MyCountThread[] tgs = new MyCountThread[100];
//        for (int i = 0; i < 100; i++)
//            tgs[i] = new MyCountThread(meter, 100_000);
//        for (MyCountThread thread : tgs)
//            thread.start();
//        try {
//            for (MyCountThread thread : tgs)
//                thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("int: " + meter.count1 + "\nvolatile: "
//                + meter.count2 + "\nAtomic: " + meter.count3);
//    }
//}
//
//class MyCounter {
//    public int count1;
//    public volatile int count2;
//    public AtomicInteger count3 = new AtomicInteger(0);
//}
//
//class MyCountThread extends Thread {
//    MyCounter meter;
//    int number;
//
//    public MyCountThread(MyCounter m, int n) {
//        this.meter = m;
//        this.number = n;
//    }
//
//    public void run() {
//        for (int i = 0; i < number; i++) {
//            this.meter.count1++;
//            this.meter.count2++;
//            this.meter.count3.getAndIncrement();
//        }
//    }
//}



//package lesson16;
//
//public class WaitNotify {
//    public static void main(String[] args) {
//        Q obj = new Q();
//        new OOO(obj);
//        new PPP(obj);
//        System.out.println("Для остановки нажмите Ctrl+C");
//    }
//}
//
//class OOO implements Runnable {
//    Q stock;
//
//    OOO(Q stock) {
//        this.stock = stock;
//        new Thread(this, "Поставщик").start();
//    }
//
//    public void run() {
//        int number = 0;
//        while (true)
//            stock.set(++number);
//    }
//}
//
//class PPP implements Runnable {
//    Q stock;
//
//    PPP(Q stock) {
//        this.stock = stock;
//        new Thread(this, "Потребитель").start();
//    }
//
//    public void run() {
//        while (true)
//            stock.get();
//    }
//}
//
//class Q {
//    int amount;
//    boolean value = false;
//
//    synchronized int get() {
//        while (!value)
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        System.out.println("Получено: " + amount);
//        value = false;
//        notify();
//        return amount;
//    }
//
//    synchronized void set(int n) {
//        while (value)
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        amount = n;
//        System.out.println("Отправлено: " + amount);
//        value = true;
//        notify();
//    }
//}

//package lesson16;
//
//        import java.util.*;
//        import java.util.concurrent.*;
//
//public class ABQApp {
//    public static void main(String[] args) {
//        BlockingQueue<String> drop = new ArrayBlockingQueue(1, true);
//        (new Thread(new Producer(drop))).start();
//        (new Thread(new Consumer(drop))).start();
//    }
//}
//
//class Producer implements Runnable {
//    private BlockingQueue<String> drop;
//    List<String> messages = Arrays.asList(
//            "1",
//            "2",
//            "3",
//            "4",
//            "5",
//            "6",
//            "7");
//
//    public Producer(BlockingQueue<String> d) {
//        this.drop = d;
//    }
//
//    public void run() {
//        try {
//            for (String s : messages) {
//                drop.put(s);
//                System.out.println("I've put "+ s);
//                Thread.sleep(1000);
//            }
//            drop.put("DONE");
//        } catch (InterruptedException intEx) {
//            System.out.println("Interrupted! " +
//                    "Last one out, turn out the lights!");
//        }
//    }
//}
//
//class Consumer implements Runnable {
//    private BlockingQueue<String> drop;
//
//    public Consumer(BlockingQueue<String> d) {
//        this.drop = d;
//    }
//
//    public void run() {
//        try {
//            String msg = null;
//            while (!((msg = drop.take()).equals("DONE"))) {
//                System.out.println("I've just read");
//                System.out.println(msg);
//            }
//        } catch (InterruptedException intEx) {
//            System.out.println("Interrupted! " +
//                    "Last one out, turn out the lights!");
//        }
//    }
//}



//package lesson16;
//
//        import java.io.File;
//        import java.io.FileInputStream;
//        import java.io.IOException;
//        import java.util.ArrayList;
//        import java.util.Scanner;
//        import java.util.concurrent.Callable;
//        import java.util.concurrent.ExecutionException;
//        import java.util.concurrent.Future;
//        import java.util.concurrent.FutureTask;
//
//
//public class Task16_3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter directory -> ");
//        String dir = sc.next();
//        System.out.print("Enter keyword -> ");
//        String word = sc.next();
//        Counter counter = new Counter(new File(dir), word);
//        FutureTask<Integer> task = new FutureTask <Integer> (counter);
//        new Thread(task).start();
//        try {
//            System.out.println(task.get() + " files.");
//        } catch (ExecutionException | InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class Counter implements Callable<Integer> {
//    private File dir; private String word;
//    public Counter(File dir, String word) {
//        this.dir = dir;
//        this.word = word;
//    }
//    public boolean search(File ff) {
//        try (Scanner sc = new Scanner(new FileInputStream(ff))) {
//            boolean flag = false;
//            while ( !flag && sc.hasNextLine()) {
//                String str = sc.nextLine();
//                if (str.contains(word))
//                    flag = true;
//            }
//            return flag;
//        } catch (IOException e) { return false; }
//    }
//
//    public Integer call() {
//        int count = 0;
//        try {
//            File[] files = dir.listFiles();
//            ArrayList<Future<Integer>> result = new ArrayList<>();
//            for (File ff : files)
//                if (ff.isDirectory()) {
//                    Counter counter = new Counter(ff, word);
//                    FutureTask<Integer> task = new FutureTask <Integer> (counter);
//                    result.add(task);
//                    new Thread(task).start();
//                }
//                else if ( search(ff) )
//                    count++;
//            for (Future<Integer> rez : result)
//                count += rez.get();
//        } catch (ExecutionException | InterruptedException e) {
//            e.printStackTrace();
//        }
//        return count;
//    }
//}



//package lesson16;
//
//        import java.util.concurrent.Callable;
//        import java.util.concurrent.ExecutorService;
//        import java.util.concurrent.Executors;
//        import java.util.concurrent.Future;
//
//public class Task16_4 {
//    public static void main(String[] args) {
//        int numOfWorks = 1000;
//        ExecutorService pool = Executors.newFixedThreadPool(50);
//        MyTestCallable works[] = new MyTestCallable[numOfWorks];
//        Future[] futures = new Future[numOfWorks];
//        for (int i = 0; i < numOfWorks; ++i) {
//            works[i] = new MyTestCallable(i + 1);
//            futures[i] = pool.submit(works[i]);
//        }
//        for (int i = 0; i < numOfWorks; ++i) {
//            try {
//                System.out.println(futures[i].get() + " ended");
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//}
//
//class MyTestCallable implements Callable<String> {
//    private int workNumber;
//    MyTestCallable(int workNumber) {
//        this.workNumber = workNumber;
//    }
//    public String call() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Work" + workNumber + ": " + i);
//            try {
//                Thread.sleep((int) (Math.random() * 1000));
//            } catch (InterruptedException e) { }
//        }
//        return "work " + workNumber;
//    }
//}

// https://habr.com/post/277669/