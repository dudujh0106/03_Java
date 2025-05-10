package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:/temp/test1.db");
            while (true) {
                int data = in.read();
                if (data == -1) break;
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
