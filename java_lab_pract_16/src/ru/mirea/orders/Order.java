package ru.mirea.orders;

import ru.mirea.customers.Customer;
import ru.mirea.exceptons.AlcoholForNotMatureCustomerException;
import ru.mirea.menu.MenuItem;

public interface Order {
    //Добавление позиции в заказ
    boolean add(MenuItem item) throws AlcoholForNotMatureCustomerException;
    // Возвращение названий позиций заказа
    String[] itemsNames();
    // Уоличество элементов заказа
    int itemsQuantity();
    // Количество элементов с таким названием в заказе
    int itemQuantity(String itemName);
    //Количество таких же элементов в заказе
    int itemQuantity(MenuItem item);
    // Все элементы заказа (без повторов)
    MenuItem[] getItems();
    // Удаление по названию
    boolean remove(String itemName);
    // Удаление по сравнению
    boolean remove(MenuItem item);
    // удаление всех элементов заказа с названием
    int removeAll(String itemName);
    // удаление всех элементов заказа по сравнению
    int removeAll(MenuItem item);
    // То же, что getItems, но с сортировкой по убыванию цены
    MenuItem[] sortedItemsByCostDesc();
    // Суммарная цена за все позиции заказа
    double costTotal();
    // Заказчик
    Customer getCustomer();
    //Изменение заказчика
    void setCustomer(Customer newCustomer) throws AlcoholForNotMatureCustomerException;
}
