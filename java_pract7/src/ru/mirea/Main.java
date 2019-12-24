package ru.mirea;

public class Main {

    public static void main(String[] args) {
	String numbers1 = "1 3 5 7 9";
	String numbers2 = "2 4 6 8 0";

	//реализация через Stack
	System.out.println(Game.playStack(numbers1, numbers2));

	//реализация через Queue
    System.out.println(Game.playQueue(numbers1, numbers2));

    //реализация через Dequeue
    System.out.println(Game.playDeque(numbers1, numbers2));

    //реализация через DoubleList
    System.out.println(Game.playList(numbers1, numbers2));
    }
}
