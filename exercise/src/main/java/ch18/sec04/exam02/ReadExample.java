package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("C:/temp/test.txt");
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.print((char) data);
            }
            reader.close();
            System.out.println();

            reader = new FileReader("C:/temp/test.txt");
            char[] buffer = new char[1024];
            while (true) {
                int len = reader.read(buffer);
                if (len == -1) break;
                for(int i = 0; i < len; i++) {
                    System.out.print(buffer[i]);
                }
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
