package ch04.sec09;

public class TriangleExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("*".repeat(i+1));
        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
