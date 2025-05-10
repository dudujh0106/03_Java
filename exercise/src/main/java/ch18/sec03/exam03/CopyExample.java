package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:/temp/test.jpg";
        String targetFileName = "C:/temp/test2.jpg";

        try {
            InputStream in = new FileInputStream(originalFileName);
            OutputStream out = new FileOutputStream(targetFileName);
            byte[] buffer = new byte[1024];
            while (true) {
                int len = in.read(buffer);
                if (len == -1) break;
                out.write(buffer, 0, len);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
