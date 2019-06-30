package lesson15;

// паравозик
public class Class {
}
//package lesson15;
//
//        import java.io.*;
//
//public class Task15_1 {
//    public static void main(String[] args) {
//        try (DataOutputStream out = new DataOutputStream(
//                new BufferedOutputStream(
//                        new FileOutputStream("dataout.dat")));) {
//            out.writeShort(1200);
//            out.writeInt(50000);
//            out.writeLong(12345678L);
//            out.writeDouble(55.66);
//            out.writeBoolean(true);
//            out.writeUTF("Hello!!!");
//            out.flush();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        try(DataInputStream in = new DataInputStream(
//                new BufferedInputStream(
//                        new FileInputStream("dataout.dat")));) {
//
//            System.out.println("short: " + in.readShort());
//            System.out.println("int: " + in.readInt());
//            System.out.println("long: " + in.readLong());
//            System.out.println("double: " + in.readDouble());
//            System.out.println("boolean: " + in.readBoolean());
//            System.out.println("String UTF: " + in.readUTF());
//            System.out.println();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        try(ObjectOutputStream out = new ObjectOutputStream(
//                new FileOutputStream("data.ser"))) {
//            Integer A = 55;
//            Float F = new Float(5.5f);
//            User u = new User("Anna", 18, "123");
//            out.writeObject(A);
//            out.writeObject(F);
//            out.writeObject(u);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try(ObjectInputStream out = new ObjectInputStream(
//                new FileInputStream("data.ser"))) {
//            Integer A = (Integer) out.readObject();
//            Float F = (Float)out.readObject();;
//            User u = (User) out.readObject();
//            System.out.println(A + " " + F + " " + u);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

//package lesson15;
//
//        import java.io.Serializable;
//        import java.util.Objects;
//
//public class User implements Serializable{
//    private String name;
//    private  int age;
//    transient private String password;
//
//
//    public User(String name, int age, String password) {
//        this.name = name;
//        this.age = age;
//        this.password = password;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age && Objects.equals(name, user.name)
//                ;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = 17;
//        result = 31 * result + name.hashCode();
//        result = 31 * result + age;
//        return 1;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", passw=" + password +
//                '}';
//    }
//}

//package lesson15;
//
//        import java.lang.reflect.*;
//
//public class Reflection {
//
//    static private final class Test {
//        public String p = "Test string";
//        private int a = 7;
//        protected long b = 8;
//
//        public Test() {
//        }
//
//        public Test(int a) {
//            this.a = a;
//        }
//
//        public Test(int a, long b) {
//            this.a = a;
//            this.b = b;
//        }
//
//        private int getA() {
//            return a;
//        }
//
//        public long getB() {
//            return b;
//        }
//
//        public void setA(int a) {
//            this.a = a;
//        }
//    }
//
//    public static void main(String[] args) {
//        final Class<?> cls = Test.class;
//
//        System.out.println("Class name: " + cls.getName());
//
//        System.out.print("Modifiers: ");
//        int mods = cls.getModifiers();
//        if (Modifier.isPrivate(mods))
//            System.out.print("private ");
//        if (Modifier.isAbstract(mods))
//            System.out.print("abstract ");
//        if (Modifier.isFinal(mods))
//            System.out.print("final ");
//
//        System.out.println("Public fields:");
//        Field[] fields1 = cls.getFields();
//        for (Field field : fields1) {
//            Class<?> fieldType = field.getType();
//            System.out.println("\tName: " + field.getName());
//            System.out.println("\tType: " + fieldType.getName());
//        }
//
//        System.out.println("All fields:");
//        Field[] fields = cls.getDeclaredFields();
//        for (Field field : fields) {
//            Class<?> fieldType = field.getType();
//            System.out.println("\tName: " + field.getName());
//            System.out.println("\tType: " + fieldType.getName());
//        }
//
//        System.out.println("Constructors:");
//        Constructor<?>[] constrs = cls.getConstructors();
//        for (Constructor<?> ctr : constrs) {
//            Class<?>[] paramTypes = ctr.getParameterTypes();
//            for (Class<?> paramType : paramTypes) {
//                System.out.print(paramType.getName() + " ");
//            }
//            System.out.println();
//        }
//
//        try {
//            Class<?>[] paramTypes = new Class<?>[]{int.class};
//            Constructor<?> ctr = cls.getConstructor(paramTypes);
//            Test t = (Test) ctr.newInstance(1);
//            System.out.println("Fields: " + t.getA() + ", " + t.getB());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//        Method[] methods = cls.getMethods();
//        for (Method method : methods) {
//            System.out.println("Name: " + method.getName());
//            System.out.println("\tReturn type: " + method.getReturnType().getName());
//
//            Class<?>[] paramTypes = method.getParameterTypes();
//            System.out.print("\tParam types:");
//            for (Class<?> paramType : paramTypes) {
//                System.out.print(" " + paramType.getName());
//            }
//            System.out.println();
//        }
//
//        try {
//            Test obj = new Test();
//            Class<?>[] paramTypes = new Class<?>[]{int.class};
//            Method method = cls.getMethod("setA", paramTypes);
//            method.invoke(obj, 55);
//
//            System.out.println("A: " + obj.getA());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//        try {
//            Test obj = new Test();
//            Class<?>[] paramTypes = new Class<?>[]{int.class};
//            Method method = cls.getMethod("someUnknownMethod", paramTypes);
//            method.invoke(obj, 55);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Test obj = new Test();
//            Field field = cls.getDeclaredField("a");
//            field.setAccessible(true);
//            System.out.println("Private field value: " + field.getInt(obj));
//            field.setInt(obj, 100);
//            System.out.println("New private field value: " + field.getInt(obj));
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//}

// потоки
//package lesson15;
//
//public class Task15_2 {
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()+ " Start");
//        MyTread t1 = new MyTread();
//        MyTread t2 = new MyTread();
//        t1.start();
//        t2.start();
//        System.out.println(Thread.currentThread().getName()+ " End");
//    }
//}
//
//class MyTread extends Thread{
//    public void run(){
//        for(int i =1; i<=5; i++){
//            System.out.println(Thread.currentThread().getName() + " " +i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

// потоки 2, еще есть интерфейс такой же

