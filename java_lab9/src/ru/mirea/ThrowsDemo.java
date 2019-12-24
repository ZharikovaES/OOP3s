package ru.mirea;
import java.util.Scanner;

public class ThrowsDemo {
    private static String getDetails(String key) throws Exception{
        if (key.equals("")) throw new Exception("Key set to empty string");
        return "data for " + key;
    }

    public static void getKey() {
        boolean T = true;
        while(T) {
            try {
                System.out.println("Enter Key");
                Scanner sc = new Scanner(System.in);
                String key = sc.nextLine();
                printDetails(key);
            }
            catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    public static void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println(message);
    }

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
