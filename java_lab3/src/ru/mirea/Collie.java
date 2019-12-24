package ru.mirea;

public class Collie extends Dog {

    public Collie(String nickname, int age, String gender, double height, double weight) {
        super(nickname, age, gender, height, weight);
        super.size = "большой";
        super.country = "Шотландия";
    }

    public void setHeight(double height) {
        if (height >= 56 && height <= 61 && gender == "самец" || height >= 51 && height <= 56 && gender == "самка")
            this.height = Math.round(height * 100) / 100;
    }

    public void setWeight(double weight) {
        if (weight >= 20 && weight <= 29  && gender == "самец" || weight >= 18 && weight <= 25 && gender == "самка")
            this.weight = Math.round(weight * 1000) / 1000;
    }

    public String toString()
    {
        return "Порода собаки: колли\nРазмер собаки: " + super.size + "\nСтрана происхождения породы: "
                + super.country + "\nКличка собаки: " + super.nickname + "\nВозраст собаки: " + super.age +
                "\nПол собаки: " + super.gender + "\nРост собаки: " + super.height + "\nВес собаки: " + super.weight;
    }
}
