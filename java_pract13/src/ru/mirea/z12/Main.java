package ru.mirea.z12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("Дата и время выдачи задания: " + getDateOfBegin() +
                "\nДата и время сдачи задания: " + getDateOfFinish() + "\n");

        //задание 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате дд.мм.гггг (пример: 09.10.2019):");
        String d = sc.nextLine();
        System.out.println(compareDates(d));
    }

    static Date getDateOfBegin() {
        return new Date(1575723600000L);
    }

    static Date getDateOfFinish() {
        Date dateOfFinish = getDateOfBegin();
        Long time = dateOfFinish.getTime();
        time = time + (1000 * 60 * 60 * 24 * 7);
        return new Date(time);
    }

    public static String compareDates(String s) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Calendar date = new GregorianCalendar(), now = new GregorianCalendar();
        try {
            date.setTime(format.parse(s));
            now.set(GregorianCalendar.HOUR_OF_DAY, 0);
            now.set(Calendar.MINUTE, 0);
            now.set(Calendar.SECOND, 0);
            now.set(Calendar.MILLISECOND, 0);
            if (now.before(date))
                return "текущая дата (" + format.format(now.getTime()) +
                        ") раньше введенной даты (" + format.format(date.getTime()) + ")";
            if (now.after(date))
                return "введенная дата (" + format.format(date.getTime()) +
                        ") раньше текущей даты (" + format.format(now.getTime()) + ")";
            return "текущая дата (" + format.format(now.getTime()) +
                    ") и введенная дата (" + format.format(date.getTime()) + ") равны";
        }
        catch (Exception ex) {
            return ex.getMessage();
        }
    }
}
