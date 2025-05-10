package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startT = System.nanoTime();
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        long endT = System.nanoTime();

        System.out.println("1부터 1000000까지의 합: " + sum);
        System.out.println("계산까지 걸린 시간(나노초): " + (endT - startT));
    }
}
