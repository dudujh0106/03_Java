package ch09.sec06.exam01;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();

        class OkListener implements Button.ClickListener {
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }
    }
}
