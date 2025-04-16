package ch05.sec11;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int n = 0;
        int[] scores = new int[5];
        while (menu != 5) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("학생수> ");
                n = sc.nextInt();
                scores = new int[n];
            }
            else if (menu == 2) {
                for (int i = 0; i < n; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = sc.nextInt();
                }
            }
            else if (menu == 3) {
                for (int i = 0; i < n; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            }
            else if (menu == 4) {
                double sum = 0.0;
                int max = scores[0];
                for (int i = 0; i < n; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + sum / n);
            }
        }
        System.out.println("프로그램 종료");
    }
}
