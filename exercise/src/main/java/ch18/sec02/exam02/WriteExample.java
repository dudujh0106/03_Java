package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        byte[] array = { 65, 66, 67 };

        try {
            OutputStream out = new FileOutputStream("C:/temp/test2.db");

            out.write(array);

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
