package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // B b3 = e;
        // C c2 = d;
        // A -> B, C -> D, E
        // e는 클래스 E로 C를 상속 받고 C는 A를 상속 받음
        // d는 클래스 D로 B를 상속 받고 B는 A를 상속 받음
        // 위와 같은 이유로 전혀 상관없는 클래스 타입에 할당하려 해서 타입 오류 벌생 (상속 관계에 있지 않음)
    }
}
