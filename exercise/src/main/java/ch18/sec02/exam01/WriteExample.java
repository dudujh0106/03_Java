package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        byte a = 65;
        byte b = 66;
        byte c = 67;

        try {
            OutputStream out = new FileOutputStream("C:/temp/test1.db");

            out.write(a);
            out.write(b);
            out.write(c);

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
