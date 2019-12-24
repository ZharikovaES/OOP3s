package com.company;

public class Human {
    private String surname;
    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;

    public void setSurname(String surname) { this.surname = surname; }
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }
    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
    }
    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
    }
    public String getSurname() { return this.surname; }
    public String getName() { return this.name; }
    public String getGender() { return this.surname; }
    public int getAge() { return this.age; }
    public int getHeight() { return this.height; }
    public int getWeight() { return this.weight; }

    class Head {
        private String color_hair;
        private String hair_length;
        private String color_eye;

        public void setColor_hair(String color_hair) { this.color_hair = color_hair; }
        public void setHair_length(String hair_length) { this.hair_length = hair_length; }
        public void setColor_eye(String color_eye) { this.color_eye = color_eye; }
        public String getColor_hair () { return this.color_hair; }
        public String getHair_length () { return this.hair_length; }
        public String getColor_eye () { return this.color_eye; }
    }

    Head head = new Head();

    class Hand {
        private int hand_length;
        private Boolean IsHold = false;

        public void setHand_length (int hand_length) {
            if (hand_length > 0)
                this.hand_length = hand_length;
        }
        public int getHand_length() { return hand_length; }
        public Boolean getLeg_IsHold() { return IsHold; }
    }

    Hand hand_right = new Hand();
    Hand hand_left = new Hand();

    class Leg {
        private int leg_length;
        private Boolean IsGo = false;

        public void setLeg_length(int leg_length) {
            if (leg_length > 0)
                this.leg_length = leg_length;
        }
        public int getLeg_length() { return leg_length; }
        public Boolean getLeg_IsGo() { return IsGo; }
    }

    Leg leg_right = new Leg();
    Leg leg_left = new Leg();

    public Human() {
        surname = "default";
        name = "default";
        gender = "default";
        age = 0;
        height = 0;
        weight = 0;
        head.color_hair = "default";
        head.hair_length = "default";
        head.color_eye = "default";
        hand_right.hand_length = 0;
        hand_left.hand_length = 0;
        leg_right.leg_length = 0;
        leg_left.leg_length = 0;
    }

    public Human(String name, String surname, String gender, int age, int height, int weight, String color_hair,
                 String hair_length, String color_eye, int hand_length_right, int hand_length_left,
                 int leg_length_right, int leg_length_left) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        if (age > 0)
            this.age = age;
        if (height > 0)
            this.height = height;
        if (weight > 0)
            this.weight = weight;
        head.color_hair = color_hair;
        head.hair_length = hair_length;
        head.color_eye = color_eye;
        if (hand_length_right > 0)
            hand_right.hand_length = hand_length_right;
        if (hand_length_left > 0)
            hand_left.hand_length = hand_length_left;
        if (leg_length_right > 0)
            leg_right.leg_length = leg_length_right;
        if (leg_length_left > 0)
            leg_left.leg_length = leg_length_left;
    }

    public String ToString() {
        return "Фамилия: " + this.surname + "\nИмя: " + this.name + "\nПол: " + this.gender + "\nВозраст: "
                + this.age + " лет\nРост: " + this.height + "см\nВес: " + this.weight + "кг\nЦвет волос: " +
                this.head.color_hair + "\nДлина волос: " + this.head.hair_length + "\nЦвет глаз: " +
                this.head.color_eye + "\nДлина правой руки: " + this.hand_right.hand_length + "см\nДлина левой руки: " +
                this.hand_left.hand_length + "см\nДлина правой ноги: " + this.leg_right.leg_length +
                "см\nДлина правой ноги: " + this.leg_left.leg_length + "см";
    }

    public String go() {
        leg_right.IsGo = true;
        leg_left.IsGo = true;
        return "Человек, " + this.name + " " + this.surname + ", пошел.";
    }

    public String stop() {
        leg_right.IsGo = false;
        leg_left.IsGo = false;
        return "Человек, " + this.name + " " + this.surname + ", остановился.";
    }

    public String TakeThingRight(String thing) {
        hand_right.IsHold = true;
        return "Человек, " + this.name + " " + this.surname + ", правой рукой взял предмет - " + thing;
    }

    public String TakeThingLeft(String thing) {
        hand_left.IsHold = true;
        return "Человек, " + this.name + " " + this.surname + ", левой рукой взял предмет - " + thing;
    }

    public String PutThingRight() {
        hand_right.IsHold = false;
        return "Человек, " + this.name + " " + this.surname + ", правой рукой положил предмет";
    }

    public String PutThingLeft() {
        hand_left.IsHold = false;
        return "Человек, " + this.name + " " + this.surname + ", левой рукой положил предмет";
    }

    public String Say(String words) {
        hand_left.IsHold = false;
        return this.name + " " + this.surname + " сказал: \"" + words + "\"";
    }
}