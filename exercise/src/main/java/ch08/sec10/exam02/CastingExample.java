package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare();
        // 인터페이스에는 선언되어있지 않은 메서드를 인터페이스를 통해 호출히여 오류 발생

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
