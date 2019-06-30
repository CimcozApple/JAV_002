package lesson04;

public class Marker {
    private String color;
    private String tradeMark;
    private int length;

    public Marker(String color, String tradeMark, int length) {
        this.color = color;
        this.tradeMark = tradeMark;
        this.length = length;
    }

    public String toString() {
        return "Marker{" +
                "color='" + color + '\'' +
                ", tradeMark='" + tradeMark + '\'' +
                ", length=" + length +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}