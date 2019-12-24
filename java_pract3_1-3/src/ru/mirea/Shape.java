package ru.mirea;

abstract public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public Boolean isFilled() {
        return filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
