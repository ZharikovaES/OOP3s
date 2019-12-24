package ru.mirea;

public class Main {
    //Палиндром
    public static void main(String[] args) {
        System.out.println("Слово \"слон\" - палиндром? - " + Functions.isPalindrome("слон"));
        System.out.println("Слово \"око\" - палиндром? - " + Functions.isPalindrome("око"));
        System.out.println("Слово \"к\" - палиндром? - " + Functions.isPalindrome("к"));
        System.out.println("Слово \"ЗакАз\" - палиндром? - " + Functions.isPalindrome("ЗакАз"));
        System.out.println("Слово \"абБа\" - палиндром? - " + Functions.isPalindrome("абБа"));
        System.out.println("Слово \"abcdsba\" - палиндром? - " + Functions.isPalindrome("abcdsba"));

    //без 2-х нулей
        System.out.println("\n0: 1; 1: 1\nКоличество последовательностей: " + Functions.withoutTwoZeros(1, 1));
        System.out.println("0: 2; 1: 4\nКоличество последовательностей: " + Functions.withoutTwoZeros(2, 4));
        System.out.println("0: 3; 1: 1\nКоличество последовательностей: " + Functions.withoutTwoZeros(3, 1));
        System.out.println("0: 1; 1: 10\nКоличество последовательностей: " + Functions.withoutTwoZeros(1, 10));

    //Разворот числа
        System.out.println("\nn = 321\nЧисло, записанное теми же цифрами, в противоположном порядке: "
                + Functions.numberReversal(321));
        System.out.println("\nn = 98787\nЧисло, записанное теми же цифрами, в противоположном порядке: "
                + Functions.numberReversal(98787));
        System.out.println("\nn = 56789\nЧисло, записанное теми же цифрами, в противоположном порядке: "
                + Functions.numberReversal(56789));

    //Количество единиц
        System.out.println("Вводите по одному натуральному числу в строке. Чтобы завершить ввод, введите два нуля:" +
                " по нулю в строке:");
        int k = Functions.numberUnits();
        System.out.println("Количество единиц в введенной последовательности: " + k);

    //Вывести нечетные числа последовательности
        System.out.println("Вводите по одному натуральному числу в строке. Чтобы завершить ввод, введите 0:");
        Functions.oddNumbers();

    }
}
