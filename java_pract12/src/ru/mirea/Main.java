package ru.mirea;

import ru.mirea.z1.Person;
import ru.mirea.z2.Address;
import ru.mirea.z3.Shirt;
import ru.mirea.z4.PhoneParser;
import ru.mirea.z5.WordConcatenator;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //z1
        Person p1 = new Person("Иванов");
        Person p2 = new Person(null, "Петров", "");
        Person p3 = new Person("Сергей", "Цветков", "Сергеевич");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        //z2
        Address a1 = new Address("Россия,  Москва   ,    Москва, проспект Вернадского, 78, 7, Г-226-1", false);
        Address a2 = new Address(" Россия,  Москва  .   Москва, Новокузнецкая, 13; 1, 185", true);
        Address a3 = new Address("Беларусь, Минск, Минск, Улица Маяковского, 15, 1, 4", false);
        Address a4 = new Address("Россия; Санкт-Петербург;      Санкт-Петербург    . Старо-Петергофский прсспект, 12, 1. 1", true);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        //z3
        String[] s = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        Shirt[] shirts = new Shirt[s.length];
        for (int i = 0; i < s.length; i++) {
            shirts[i] = new Shirt(s[i]);
            System.out.println(shirts[i]);
        }

        //z4
        System.out.println(new PhoneParser("88005553535"));
        System.out.println(new PhoneParser("+79623609925"));
        System.out.println(new PhoneParser("+118005553535"));
        System.out.println(new PhoneParser("+1238005553535"));

        //z5
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        StringBuilder ss = new StringBuilder();
        try (FileReader fr = new FileReader(path)) {
            int c;
            while ((c = fr.read()) != -1) {
                ss.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(WordConcatenator.getLine(ss.toString()));
    }
}
