package ru.mirea;

public class Bread implements Priceable {
    private String name;
    private int price;

    Bread(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
