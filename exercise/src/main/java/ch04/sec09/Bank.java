package ch04.sec09;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 0;
        int menu = 0;
        while (menu != 4) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("예금액>");
                    balance += sc.nextInt();
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= sc.nextInt();
                    break;
                case 3:
                    System.out.println("잔고>" + balance);
                    break;
            }
            System.out.println();
        }

    }
}
