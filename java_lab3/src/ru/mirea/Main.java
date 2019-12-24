package ru.mirea;

public class Main {

    public static void main(String[] args) {
        BullDog dog1 = new BullDog("Шарик", 20, "самец", 30, 10.5);

        //Вывод информации о собаке dog1
        System.out.println("Информация о собаке dog1:\n" + dog1 + "\n");

        //Установка возраста dog1
        dog1.setAge(10);
        System.out.println("Возраст dog1: " + dog1.getAge() + "\n");

        //Страна происхождения породы gog1
        System.out.println("Страна происхождения породы собаки dog1: " + dog1.getCountry() + "\n");

        //Вывод всей информации о dog1
        System.out.println(dog1);

        Collie dog2 = new Collie("Вега", 8, "самка", 50.1, 19);

        //Вывод роста dog2
        System.out.println("Вывод роста dog2: " + dog2.getHeight() + "\n");

        //Установка допустимого роста dog2
        dog2.setHeight(55);

        //Вывод роста dog2
        System.out.println("Вывод допустимого роста dog2: " + dog2.getHeight() + "\n");

        Poodle dog3 = new Poodle("Тузик", 12, "самец", 40.75, 30.875);


        //Вывод всей информации о собках dog1, dog2, dog3
        Dog[] mass = {dog1, dog2, dog3};
        System.out.println("Вывод всей информации о собках dog1, dog2, dog3\n");
        for (Dog i : mass) {
            System.out.println(i + "\n");
        }
    }
}
