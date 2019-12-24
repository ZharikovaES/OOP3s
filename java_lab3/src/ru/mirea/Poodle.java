package ru.mirea;

public class Poodle extends Dog {

    public Poodle(String nickname, int age, String gender, double height, double weight) {
        super(nickname, age, gender, height, weight);
        super.size = "средний";
        super.country = "Франция";
    }

    public void setHeight(double height) {
        if (height >= 35 && height <=47)
            this.height = Math.round(height * 100) / 100;
    }

    public void setWeight(double weight) {
        if (weight >= 20 && weight <= 32)
            this.weight = Math.round(weight * 1000) / 1000;
    }

    public String toString()
    {
        return "Порода собаки: пудель\nРазмер собаки: " + super.size + "\nСтрана происхождения породы: "
                + super.country + "\nКличка собаки: " + super.nickname + "\nВозраст собаки: " + super.age +
                "\nПол собаки: " + super.gender + "\nРост собаки: " + super.height + "\nВес собаки: " + super.weight;
    }

}
