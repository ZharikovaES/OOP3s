package ru.mirea;

public class Main {

    public static void main(String[] args) {
        Priceable product1 = new Bread("хлеб \"Коломенский хлебозавод\"", 30),
                product2 = new Apple("яблоки \"Golden\"", 90, 5);

        //Вывод цены хлеба
        System.out.println("Цена product1: " + product1.getPrice());

        //Вывод цены яблок
        System.out.println("Цена product2: " + product2.getPrice() + '\n');

        //Установка количества килограмм у яблок
        ((Apple) product2).setKilograms(10);

        Priceable[] mass = {product1, product2};
        print(mass);
    }

    static void print(Priceable[] m) {
        System.out.println("Цены всех продуктов:");
        for (Priceable i : m) {
            System.out.println(i.getPrice());
        }

    }
}
