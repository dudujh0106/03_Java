package ch18.sec11;

import java.io.File;
import java.nio.file.Files;

public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("C:/temp/file1.txt");
            if (file.exists()) {
                if (file.isFile()) {
                    System.out.println("파일 경로: " + file.toPath());
                    System.out.println("파일 크기: " + Files.size(file.toPath()) + " bytes");
                }
                else if (file.isDirectory()) {
                    System.out.println("<dir> " + file.toPath());
                }
            }
            else {
                System.out.println("해당 파일은 없는 파일입니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
