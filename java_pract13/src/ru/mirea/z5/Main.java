package ru.mirea.z5;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayListN<Integer> a = new ArrayListN<>();
        LinkedList<Integer> l = new LinkedList<>();
        long start, finish, time;
        //добавление элемента

        for (int i = 0; i < 10; i++) {
            start = System.nanoTime();
            a.add(1);
            finish = System.nanoTime();
            time = finish - start;
            System.out.println("Операция добавление элемента в ArrayList заняла: " + time);
            start = System.nanoTime();
            l.add(1);
            finish = System.nanoTime();
            time = finish - start;
            System.out.println("Операция добавление элемента в LinkedList заняла: " + time);
        }
        System.out.println("\n" + a);
        System.out.println("LinkedList: " + l);

        //удаление элемента по индексу
        for (int i = 0; i < 5; i++) {
            start = System.nanoTime();
            a.remove(i);
            finish = System.nanoTime();
            time = finish - start;
            System.out.println("Операция удаления по индексу " + i + " в ArrayList заняла: " + time);
            start = System.nanoTime();
            l.remove(i);
            finish = System.nanoTime();
            time = finish - start;
            System.out.println("Операция удаления по индексу " + i + " в LinkedList заняла: " + time);
        }
        System.out.println("\n" + a);
        System.out.println("LinkedList: " + l);

        //вставка элемента по индексу
        start = System.nanoTime();
        a.add(0, 2);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция вставки элемента 2 по индексу 0 в ArrayList заняла: " + time);
        start = System.nanoTime();
        l.add(0, 2);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция вставки элемента 2 по индексу 0 в LinkedList заняла: " + time);
        start = System.nanoTime();
        a.add(4, 3);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция вставки элемента 3 по индексу 4 в ArrayList заняла: " + time);
        start = System.nanoTime();
        l.add(4, 3);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция вставки элемента 3 по индексу 4 в LinkedList заняла: " + time);
        start = System.nanoTime();
        a.add(7, 4);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция вставки элемента 4 по индексу 7 в ArrayList заняла: " + time);
        start = System.nanoTime();
        l.add(7, 4);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция вставки элемента 4 по индексу 7 в LinkedList заняла: " + time);
        System.out.println("\n" + a);
        System.out.println("LinkedList: " + l);

        //поиск по элементу
        start = System.nanoTime();
        a.get(2);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция поиска элемента 2 в ArrayList заняла: " + time);
        start = System.nanoTime();
        l.get(2);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция поиска элемента 2 в LinkedList заняла: " + time);
        start = System.nanoTime();
        a.get(1);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция поиска элемента 1 в ArrayList заняла: " + time);
        start = System.nanoTime();
        l.get(1);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция поиска элемента 1 в LinkedList заняла: " + time);
        start = System.nanoTime();
        a.get(3);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция поиска элемента 3 в ArrayList заняла: " + time);
        start = System.nanoTime();
        l.get(3);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция поиска элемента 3 в LinkedList заняла: " + time);
        start = System.nanoTime();
        a.get(4);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция поиска элемента 4 в ArrayList заняла: " + time);
        start = System.nanoTime();
        l.get(4);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Операция поиска элемента 4 в LinkedList заняла: " + time);
        System.out.println("\n" + a);
        System.out.println("LinkedList: " + l);
    }
}
