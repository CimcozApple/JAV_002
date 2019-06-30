package lesson09;

public enum Week {
    MON(1), THU(2), WEN(3), TUE(4), FRI(5), SAT(6), SUN(7);

    private int number;

    private Week(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}