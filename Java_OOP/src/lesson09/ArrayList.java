package lesson09;

//public class ArrayList {
public class ArrayList <T> { // определение дженерика
//    private int [] arr;
//    private Object [] arr; // для унификации
    private T [] arr; // для унификации
    private int size;

    public ArrayList() {
//        this.arr = new int[10];
//        this.arr = new Object[10];
        this.arr = (T[]) new Object[10];
        this.size = 0;
    }

//    public void addElement(int element) {
//    public void addElement(Object element) {
    public void addElement(T element) {
        this.arr[this.size++] = element;
    }

//    public int getElement(int index) {
//    public Object getElement(int index) {
    public T getElement(int index) {
        return arr[index];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

//        for (int i : arr) { // переписываем это ниже, чтобы не было нулей
//            stringBuilder.append(i).append(" ");
//        }

        for (int i = 0; i < this.size; i++) {
            stringBuilder.append(arr[i]).append(" ");
        }

        return "ArrayList{" + stringBuilder +
        '}';
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.addElement(5);
        list.addElement(6);
        list.addElement(7);

//        list.addElement("Hello");
//        list.addElement(new Double(11.5));

        list.addElement("Hello");
        System.out.println(new Double(11.5));
        System.out.println(list);
        System.out.println(list.getElement(2));
    }
}