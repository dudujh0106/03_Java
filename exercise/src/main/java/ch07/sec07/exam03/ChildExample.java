package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        //parent.field2 = "data2";
        //parent.method3();
        // 부모 클래스는 자식의 필드와 메서드를 참조할 수 없음

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
