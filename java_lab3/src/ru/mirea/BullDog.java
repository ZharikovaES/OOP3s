package ru.mirea;

public class BullDog extends Dog {

    public BullDog(String nickname, int age, String gender, double height, double weight) {
        super(nickname, age, gender, height, weight);
        super.size = "маленький";
        super.country = "Франция";
    }

    public void setHeight(double height) {
        if (height >= 27 && height <= 35 && gender == "самец" || height >= 24 && height <= 32 && gender == "самка")
            this.height = Math.round(height * 100) / 100;

    }

    public void setWeight(double weight) {
        if (weight >= 9 && weight <= 14  && gender == "самец" || weight >= 8 && weight <= 13 && gender == "самка")
            this.weight = Math.round(weight * 1000) / 1000;
    }

    public String toString()
    {
        return "Порода собаки: французский бульдог\nРазмер собаки: " + super.size + "\nСтрана происхождения породы: "
                + super.country + "\nКличка собаки: " + super.nickname + "\nВозраст собаки: " + super.age +
                "\nПол собаки: " + super.gender + "\nРост собаки: " + super.height + "\nВес собаки: " + super.weight;
    }
}
