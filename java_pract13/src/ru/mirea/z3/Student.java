package ru.mirea.z3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student  implements Comparable<Student> {
    private int idNumber;
    private String name;
    private int GPA;
    private Calendar date = new GregorianCalendar();

    Student(int idNumber, String name, int GPA, Calendar date) {
        this.idNumber= idNumber;
        this.name = name;
        this.GPA = GPA;
        this.date = date;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public int getGPA() { return GPA; }

    public Calendar getDateOfBirth() { return date; }

    @Override
    public String toString() {
        return "id: " + idNumber + ", ФИО: " + name + ", Итоговый балл: " + GPA +
                ", Дата рождения: " + new SimpleDateFormat("EEEE dd LLLLL yyyy hh:mm:ss").format(date.getTime());
    }

    public String toString(SimpleDateFormat format) {
        return "id: " + idNumber + ", ФИО: " + name + ", Итоговый балл: " + GPA +
                ", Дата рождения: " + format.format(date.getTime());
    }

//    public String toString(String r) {
//        switch (r){
//            case "small": { return this + ", Дата рождения: " + getSmallFormatDate(); }
//            case "middle": { return this + ", Дата рождения: " + getMiddleFormatDate(); }
//            case "big": { return this + ", Дата рождения: " + getBigFormatDate(); }
//        }
//        return this.toString();
//    }

    @Override
    public int compareTo(Student o) {
        return this.idNumber - o.idNumber;
    }
}
