package lesson09;

public class Num <E extends Number> { // если <super Number> то будет идти вверх
    private E x;
    private E y;

//    private <E> double sum() {
//
//    }


    public Num(E x, E y) {
        this.x = x;
        this.y = y;
    }

//    public <E> double sum() {
    public <E> Number sum() {
        return this.x.doubleValue() + this.y.doubleValue();
//        return ((Number)this.x).doubleValue() + ((Number)this.y).doubleValue(); // если не ограничивать вверху классом Number, оставить пустым, просто <E>, то нужно в этой строке приводить к Number
    }

//    public boolean equelsNum(Num<E> data) {
//    public boolean equelsNum(Num<?> data) { // <?> - любой тип wild card
    public boolean equelsNum(Num<? extends Number> data) { // <?> - любой тип wild card и если тут нужно ограничить
        if (this.sum() == data.sum()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Num <Double> n1 = new Num<>(2.1, 3.0);
//        Num <Double> n2 = new Num<>(2.1, 3.0);
        System.out.println(n1.sum());

//        Num<Integer> n2 = new Num<>(2,3);
//        System.out.println(n2.sum());

        Num<Double> n2 = new Num<>(2.0,3.0);
        System.out.println(n2.sum());
        System.out.println(n1.equelsNum(n2));

    }
}