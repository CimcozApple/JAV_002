package package1;

public interface MyData {
    default void print(String string) {
        if (!isNull(string)) {
            System.out.println("package1.MyData prints line" + string);
        }
    }

    static boolean isNull(String string) {
        System.out.println("Static method is checking for null");
        return string == null ? true : "".equals(string.trim()) ? true : false;
    }
}