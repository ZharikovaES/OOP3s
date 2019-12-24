package ru.mirea.z4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Integer[] arr = new Integer[6];
            for (int i = 0; i < 6; i++) {
                switch (i) {
                    case 0:
                        System.out.println("Введите год: ");
                        break;
                    case 1:
                        System.out.println("Введите номер месяца: ");
                        break;
                    case 2:
                        System.out.println("Введите число: ");
                        break;
                    case 3:
                        System.out.println("Введите час: ");
                        break;
                    case 4:
                        System.out.println("Введите минуты: ");
                        break;
                    case 5:
                        System.out.println("Введите секунды: ");
                        break;
                }
                arr[i] = sc.nextInt();
            }
            Date date = new Date();
            date.setYear(arr[0] - 1900);
            date.setMonth(arr[1] - 1);
            date.setDate(arr[2]);
            date.setHours(arr[3]);
            date.setMinutes(arr[4]);
            date.setSeconds(arr[5]);
            System.out.println(date);
            Calendar calendar = new GregorianCalendar(arr[0], arr[1] + 1, arr[2], arr[3], arr[4], arr[5]);
            System.out.println(calendar.getTime());
        }
        catch(Exception err) {
            err.printStackTrace();
        }
    }
}
