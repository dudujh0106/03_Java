package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/temp/originalFile1.jpg");
            FileOutputStream fos = new FileOutputStream("C:/temp/originalFile2.jpg");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            long start = System.nanoTime();
            while (true) {
                int data = bis.read();
                if (data == -1) break;
                bos.write(data);
            }
            long end = System.nanoTime();
            System.out.println("걸린 시간: " + (end - start));

            bis.close();
            bos.close();
            fis.close();
            fos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
