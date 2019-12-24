package ru.mirea;

public abstract class Dog {
    protected String nickname;
    protected int age;
    protected String gender;
    protected double height;
    protected double weight;
    protected String name;
    protected String size;
    protected String country;

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getCountry() {
        return country;
    }

    public void setAge(int age) {
        if (age > 0 && age < 30) this.age = age;
    }

    public abstract void setHeight(double height);

    public abstract void setWeight(double weight);

    public Dog(String nickname, int age, String gender, double height, double weight) {
        this.nickname = nickname;
        if (age > 0 && age < 30) this.age = age;
        this.gender = gender;
        this.setHeight(height);
        this.setWeight(weight);
    }

    public abstract String toString();
}


