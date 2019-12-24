package ru.mirea;

public class Main {

    public static void main(String[] args) {

        //создание экземпляра класса MovableCircle
        MovableCircle c1 = new MovableCircle(0, -2, 5, 7, 10);
        System.out.println(c1);
        c1.moveUp();
        System.out.println("Сдвигаем окружность вверх:\n" + c1);
        c1.moveLeft();
        System.out.println("Сдвигаем окружность влево:\n" + c1 + '\n');

        //создание экземпляра класса MovableRectangle
        MovableRectangle r1 = new MovableRectangle(1, 0, -1, -4, 4, 7);
        System.out.println(r1);
        r1.moveDown();
        System.out.println("Сдвигаем прямоугольник вниз:\n" + r1);
        r1.moveRight();
        System.out.println("Сдвигаем прямоугольник вправо:\n" + r1);
    }
}
