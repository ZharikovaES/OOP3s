package ru.mirea.z3;

public class Shirt {
    private String article, fullName, color, size;

    public Shirt(String stringToParse){
        String[] s = stringToParse.split(",");
        article = s[0];
        fullName = s[1];
        color = s[2];
        size = s[3];
    }

    @Override
    public String toString() {
        return "артикль: " + article + ";\nполное название: " + fullName + ";\nцвет: " + color + ";\nразмер: " + size;
    }
}