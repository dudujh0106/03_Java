package ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char[] arr = {'C', 'D', 'E'};

        try (Writer writer = new FileWriter("C:/temp/test.txt")) {
            writer.write(a);
            writer.write(b);
            writer.write(arr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
