package ru.mirea;
import java.util.*;

public class Game {
    public static String playStack(String str1, String str2) {
        int k = 0;
        Stack<Integer> cardsFirst1 = new Stack<>(),
                cardsSecond1 = new Stack<>(),
                cardsFirst2 = new Stack<>(),
                cardsSecond2 = new Stack<>();
        for (int i = 8; i >=0; i -= 2) {
            if (Character.isDigit(str1.charAt(i)) && Character.isDigit(str2.charAt(i))) {
                cardsFirst1.push(Character.getNumericValue(str1.charAt(i)));
                cardsSecond1.push(Character.getNumericValue(str2.charAt(i)));
            }
        }
        while (k != 106 && (!cardsFirst1.isEmpty() && !cardsSecond1.isEmpty())) {
            if (cardsFirst1.peek() > cardsSecond1.peek() && (cardsFirst1.peek() != 9 && cardsSecond1.peek() != 0)
                    || (cardsSecond1.peek() == 9 && cardsFirst1.peek() == 0)) {
                cardsFirst2.push(cardsSecond1.pop());
                cardsFirst2.push(cardsFirst1.pop());
            } else {
                cardsSecond2.push(cardsSecond1.pop());
                cardsSecond2.push(cardsFirst1.pop());
            }
            if (cardsFirst1.isEmpty()) {
                cardsFirst1 = cardsFirst2;
            }
            if (cardsSecond1.isEmpty()) {
                cardsSecond1 = cardsSecond2;
            }
            k++;
        }
        if (k == 106) return "botva";
        if (cardsFirst1.isEmpty()) return "second " + k;
        else return "first " + k;
    }

    public static String playQueue(String str1, String str2) {
        int k = 0;
        Queue<Integer> cardsFirst = new LinkedList<>(), cardsSecond = new LinkedList<>();
        for (int i = 0; i < 10; i += 2) {
            if (Character.isDigit(str1.charAt(i)) && Character.isDigit(str2.charAt(i))) {
                cardsFirst.add(Character.getNumericValue(str1.charAt(i)));
                cardsSecond.add(Character.getNumericValue(str2.charAt(i)));
            }
        }
        while (k != 106 && (!cardsFirst.isEmpty() && !cardsSecond.isEmpty())) {
            if (cardsFirst.peek() > cardsSecond.peek() && (cardsFirst.peek() != 9 && cardsSecond.peek() != 0)
                    || (cardsSecond.peek() == 9 && cardsFirst.peek() == 0)) {
                cardsFirst.add(cardsFirst.poll());
                cardsFirst.add(cardsSecond.poll());
            } else {
                cardsSecond.add(cardsFirst.poll());
                cardsSecond.add(cardsSecond.poll());
            }
            k++;
        }
        if (k == 106) return "botva";
        if (cardsFirst.isEmpty()) return "second " + k;
        else return "first " + k;
    }


    public static String playDeque(String str1, String str2) {
        int k = 0, t;
        Deque<Integer> cardsFirst = new LinkedList<>(), cardsSecond = new LinkedList<>();
        for (int i = 0; i < 10; i += 2) {
            if (Character.isDigit(str1.charAt(i)) && Character.isDigit(str2.charAt(i))) {
                cardsFirst.addFirst(Character.getNumericValue(str1.charAt(i)));
                cardsSecond.addFirst(Character.getNumericValue(str2.charAt(i)));
            }
        }
        while (k != 106 && (!cardsFirst.isEmpty() && !cardsSecond.isEmpty())) {
            if (cardsFirst.getLast() > cardsSecond.getLast() && (cardsFirst.getLast() != 9
                    && cardsSecond.getLast() != 0)  || (cardsSecond.getLast() == 9 && cardsFirst.getLast() == 0)) {
                cardsFirst.addFirst(cardsFirst.removeLast());
                cardsFirst.addFirst(cardsSecond.removeLast());
            } else {
                cardsSecond.addFirst(cardsFirst.removeLast());
                cardsSecond.addFirst(cardsSecond.removeLast());
            }
            k++;
        }
        if (k == 106) return "botva";
        if (cardsFirst.isEmpty()) return "second " + k;
        else return "first " + k;
    }

    public static String playList(String str1, String str2) {
        int k = 0;
        List<Integer> cardsFirst = new LinkedList<>(), cardsSecond = new LinkedList<>();
        for (int i = 8; i >=0; i -= 2) {
            if (Character.isDigit(str1.charAt(i)) && Character.isDigit(str2.charAt(i))) {
                cardsFirst.add(Character.getNumericValue(str1.charAt(i)));
                cardsSecond.add(Character.getNumericValue(str2.charAt(i)));
            }
        }
        while (k != 106 && (!cardsFirst.isEmpty() && !cardsSecond.isEmpty())) {
            if (cardsFirst.get(cardsFirst.size() - 1) > cardsSecond.get(cardsSecond.size() - 1)
                    && (cardsFirst.get(cardsFirst.size() - 1) != 9 && cardsSecond.get(cardsSecond.size() - 1) != 0) ||
                    (cardsSecond.get(cardsSecond.size() - 1) == 9 && cardsFirst.get(cardsFirst.size() - 1) == 0)) {
                cardsFirst.add(0, cardsFirst.remove(cardsFirst.size() - 1));
                cardsFirst.add(0, cardsSecond.remove(cardsSecond.size() - 1));
            } else {
                cardsSecond.add(0, cardsFirst.remove(cardsFirst.size() - 1));
                cardsSecond.add(0, cardsSecond.remove(cardsSecond.size() - 1));
            }
            k++;
        }
        if (k == 106) return "botva";
        if (cardsFirst.isEmpty()) return "second " + k;
        else return "first " + k;
    }
}
