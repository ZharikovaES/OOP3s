package ru.mirea;

public class Main {

    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гаромнического ряда:");
        double x;
        for (double i = 1; i < 11; i++) {
            x = 1 / i;
            System.out.print(x + " + ");
        }
        System.out.print("...");
    }
}
