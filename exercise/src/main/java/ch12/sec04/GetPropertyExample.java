package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("osName: " + osName);
        System.out.println("userName: " + userName);
        System.out.println("userHome: " + userHome);
        System.out.println();

        Properties props = System.getProperties();
        Set<Object> keys = props.keySet();

        for (Object key : keys) {
            System.out.println(key + ": " + props.get(key));

        }
    }
}
