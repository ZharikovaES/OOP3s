package com.company;

public class Main {

    public static void main(String[] args) {
        //создание объекта класса Human
        Human human1 = new Human("Ivan", "Ivanov", "man", 18, 175, 70,
                "blond", "short", "blue", 70, 70,
                100, 100);

        //вывод информации об объекте human1
        System.out.println(human1.ToString() + "\n");

        //вывод некоторой информации об объекте human1
        System.out.println("Вывод некоторой информации об объекте human1.\n");
        System.out.println("Имя объекта human1: " + human1.getName());
        System.out.println("Рост объекта human1: " + human1.getHeight());
        System.out.println("Цвет глаз объекта human1: " + human1.head.getColor_eye());
        System.out.println("Длина правой руки объекта human1: " + human1.hand_right.getHand_length());
        System.out.println("Длина левой ноги объекта human1: " + human1.leg_left.getLeg_length() + "\n");

        //изменение веса объекта human1
        System.out.println("Изменение веса объекта human1.\n");
        human1.setWeight(-5);
        System.out.println("Вес объекта human1: " + human1.getWeight());
        human1.setWeight(75);
        System.out.println("Новый вес объекта human1: " + human1.getWeight() + "\n");

        //объект human1 правой рукой берет предмет
        System.out.println("Объект human1 правой рукой берет и кладет предмет.\n");
        String ball = "Мяч";
        System.out.println(human1.TakeThingRight(ball));
        System.out.println(human1.PutThingRight() + "\n");

        //объект human1 правой рукой берет предмет
        System.out.println("Объект human1 начинает идти и останавливается.\n");
        System.out.println(human1.go());
        System.out.println(human1.stop() + "\n");

        //объект human1 говорит
        System.out.println("Объект human1 говорит 'Привет'.\n");
        System.out.println(human1.Say("Привет" + "\n"));

        //создание объекта human2 конструктором по умолчанию
        System.out.println("Создание объекта human2 конструктором по умолчанию.\n");
        Human human2 = new Human();
        System.out.println(human2.ToString());

    }
}
