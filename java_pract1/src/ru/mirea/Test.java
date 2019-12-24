package ru.mirea;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Ball b1 = new Ball("красный", "маленький");

        b1.setColor("желтый");
        System.out.println(b1.getColor());
        System.out.println(b1.toString());

        Book k1 = new Book("Сборник произведений", "Пушкин А.С.", 300);
        k1.setPages(250);
        System.out.println(k1);
    }
}
