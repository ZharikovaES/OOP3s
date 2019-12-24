package ru.mirea;
import java.util.Scanner;

public class Functions {
    public static String isPalindrome(String word) {
        if (word.length() <= 1) return "YES";
        if (word.toLowerCase().charAt(0) != word.toLowerCase().charAt(word.length()-1)) return "NO";
        word = word.substring(1,word.length()-1);
        return isPalindrome(word);
    }

    public static int withoutTwoZeros(int a, int b) {
        if (a - b > 1) return 0;
        if (a == 0 || a == b + 1) return 1;
        return withoutTwoZeros(a, b - 1) + withoutTwoZeros(a - 1, b - 1);
    }

    public static int numberReversal(int n) {
        return numberReversal(n, 0);
    }

    private static int numberReversal(int n, int a) {
        if (n == 0) return a;
        return numberReversal(n / 10, 10 * a + n % 10);
    }

    private static int inputNumber() {
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();
        return num;
    }

    public static int numberUnits() {
        int number = inputNumber();
        if (number == 1) return numberUnits() + 1;
        if (number == 0 && inputNumber() == 0) return 0;
        return numberUnits();
    }

    public static void oddNumbers() {
        int number = inputNumber();
        if  (number % 2 == 1) System.out.println(number);
        if (number != 0) oddNumbers();
    }
}
