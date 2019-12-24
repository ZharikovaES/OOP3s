package ru.mirea;

public class Test {

    public static void main(String[] args) {

        //Тест класса Author
        Author a1 = new Author("Пушкин А.С.", "PushkinAS@gmail.com", 'м');
        System.out.println("ФИО автора: " + a1.getName() + '\n');

        a1.setEmail("ASPushkin@gmail.com");
        System.out.println(a1);

        //Тест класса Ball
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
