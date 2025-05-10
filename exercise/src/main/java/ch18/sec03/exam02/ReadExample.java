package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        byte[] data;

        try {
            InputStream in = new FileInputStream("C:/temp/test2.db");

            data = new byte[in.available()]; // available -> 읽을 수 있는 바이트 수 반환
            while (true) {
                int d = in.read(data);
                if (d == -1) break;
                for (int i = 0; i < d; i++) {
                    System.out.println(data[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
