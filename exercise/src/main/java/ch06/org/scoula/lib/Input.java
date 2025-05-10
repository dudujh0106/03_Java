package ch06.org.scoula.lib;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title);
        return scanner.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.print(title);
        String value = scanner.nextLine();
        if (value.equals("")) {
            return defaultValue;
        }
        return value;
    }

    public static int readInt(String title) {
        System.out.print(title);
        return Integer.parseInt(scanner.nextLine());
    }

    public static boolean confirm(String title, boolean defaultValue) {
        System.out.print(title);
        if (defaultValue) {
            System.out.print(" (Y/n): ");
        }
        else {
            System.out.print(" (y/N): ");
        }
        String value = scanner.nextLine();
        if (value.equals("")) {
            return defaultValue;
        }
        return value.equalsIgnoreCase("y");
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
