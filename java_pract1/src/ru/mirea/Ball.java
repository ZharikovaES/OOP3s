package ru.mirea;

public class Ball {

    private String color;
    private String size;

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Ball(String color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Мяч имеет размер: " + size + " и цвет: " + color;
    }
}
