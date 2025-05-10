package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) {
        String str = "문자 변환 스트림을 사용합니다.";
        try {
            OutputStream out = new FileOutputStream("C:/temp/test.txt");
            Writer writer = new OutputStreamWriter(out, "UTF-8");
            writer.write(str);
            writer.close();

            InputStream in = new FileInputStream("C:/temp/test.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            char[] buf = new char[1024];
            int len = reader.read(buf);
            String str2 = new String(buf, 0, len);
            System.out.println(str2);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
