package ch08.sec11.exam01;

public class Car {
    private Tire tire1 = new HankookTire();
    private Tire tire2 = new HankookTire();

    public Car() {}

    public Car(Tire tire1, Tire tire2) {
        this.tire1 = tire1;
        this.tire2 = tire2;
    }

    public void run() {
        this.tire1.roll();
        this.tire2.roll();
    }
}
