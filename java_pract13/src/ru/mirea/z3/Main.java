package ru.mirea.z3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        //задание 3
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        Calendar date = new GregorianCalendar(), now = new GregorianCalendar();
        try {
            date.setTime(format.parse("10.5.2010 10:5"));
            Student s1 = new Student(1, "Петров И.В.", 75, date);
            System.out.println(s1.toString());

            SimpleDateFormat f1 = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat f2 = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
            SimpleDateFormat f3 =  new SimpleDateFormat("E dd LLLLL yyyy hh:mm:ss");

            System.out.println(s1.toString(f1));
            System.out.println(s1.toString(f2));
            System.out.println(s1.toString(f3));
        }
        catch (Exception ex) {
            ex.getMessage();
        }
    }
}
