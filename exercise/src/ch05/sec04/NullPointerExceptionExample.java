package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        //intArray[0] = 10;

        String str = null;
        //System.out.println("총 문자 수 : " + str.length());
        //null인 상태에서 객체의 데이터를 사용하려 했기 때문에 NullPointerException 발생
    }
}