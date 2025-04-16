package ch06.sec08.exam01;

public class Calculator {
    boolean isPower;

    public Calculator() {
    }

    void powerOn() {
        isPower = true;
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        isPower = false;
        System.out.println("전원을 끕니다.");
    }

    int plus(int a, int b) {
        return a + b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }
}
