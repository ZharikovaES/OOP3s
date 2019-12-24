package ru.mirea;

public class Square extends Rectangle {

    public Square() {
        super();
    }
    public Square(double side) {
        super();
        this.width = this.length = side;
    }
    public Square(double side,  String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return width; }

    public void setSide(double side){
        this.width = this.length = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.width = this.length = length;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.width + ", color: " + this.color + ", Area: " + this.getArea() + ", Perimeter: " +
                this.getPerimeter();
    }
}
