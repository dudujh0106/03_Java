package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        myCar = new Car(new KumhoTire(), new KumhoTire());
        myCar.run();
    }
}
