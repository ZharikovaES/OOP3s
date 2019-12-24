package ru.mirea.z5;

import java.util.*;

public class WordConcatenator {
    public static StringBuilder getLine(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        if (words.length == 1 || words[0].equals("")) return result.append(words[0]);

        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        int index = 0; boolean T = true;
        while(wordsList.size() != 0 && T) {
            String firstWord = wordsList.remove(index);
            result.append(firstWord + " ");
            for(int i = 0; i < wordsList.size(); i++) {
                String secondWord = wordsList.get(i).toLowerCase();
                if (firstWord.toLowerCase().charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
                    index = i;
                    T = true;
                    break;
                }
                else T = false;
            }
        }
        result.setLength(result.length() - 1);
        return result;
    }
}