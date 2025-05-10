package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
        // parent.method3();
        // 부모 클래스 타입은 자식 클래스의 메서드를 사용할 수 없음
    }
}
