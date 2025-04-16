package ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        while (true) {
            System.out.print("입력 문자열: ");
            str = sc.nextLine();
            if (str.equals("q")) {
                System.out.println("종료");
                break;
            }
            System.out.printf("출력 문자열: %s\n\n", str);
        }
    }
}
