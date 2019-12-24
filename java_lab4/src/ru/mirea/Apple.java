package ru.mirea;

public class Apple implements Priceable {
    private String name;
    private int PriceKilogram;
    private int Kilograms;

    Apple(String name, int PriceKilogram, int Kilograms) {
        this.name = name;
        if (PriceKilogram > 0)
            this.PriceKilogram = PriceKilogram;
        if (Kilograms > 0)
            this.Kilograms = Kilograms;
    }

    public String getName() {
        return name;
    }

    public int getPriceKilogram() {
        return PriceKilogram;
    }

    public int getKilograms() {
        return Kilograms;
    }

    public void setKilograms(int Kilograms) {
        if (Kilograms > 0)
            this.Kilograms = Kilograms;
    }

    @Override
    public int getPrice() {
        return Kilograms * PriceKilogram;
    }
}
