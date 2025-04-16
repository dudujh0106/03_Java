package ch03.sec11;

public class TrapezoidalArea {
    public static void main(String[] args) {
        int top = 5;
        int bottom = 10;
        int height = 7;
        double area = (top + bottom) * height / 2.0;
        System.out.println("사다리꼴 넓이: " + area);
    }
}
