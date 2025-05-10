package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] selectNum = new int[6];

        System.out.print("선택 번호:");
        for (int i = 0; i < 6; i++) {
            selectNum[i] = new Random().nextInt(45) + 1;
            System.out.print(selectNum[i] + " ");
        }
        System.out.println();

        int[] winningNum = new int[6];

        System.out.print("당첨 번호:");
        for (int i = 0; i < 6; i++) {
            winningNum[i] = new Random().nextInt(45) + 1;
            System.out.print(winningNum[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNum);
        Arrays.sort(winningNum);
        boolean result = Arrays.equals(selectNum, winningNum);
        if (result) {
            System.out.println("당첨되었습니다.");
        }
        else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
