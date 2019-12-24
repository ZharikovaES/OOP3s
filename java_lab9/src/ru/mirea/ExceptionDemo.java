package ru.mirea;

import java.util.Scanner;

public class ExceptionDemo {
    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void exceptionDemo1() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer");
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Сообщение выведется на экран.");
        }
    }

}
