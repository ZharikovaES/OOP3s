package ru.mirea.orders.managers;

import ru.mirea.menu.MenuItem;
import ru.mirea.orders.Order;

public interface OrderManager {
    // Количество элементов с именем во всех заказах
    int itemsQuantity(String itemName);
    // Количество таких же элементов во всех заказах
    int itemsQuantity(MenuItem item);
    // Все заказы
    Order[] getOrders();
    // Сумма цен всех заказов
    double ordersCostSummary();
    //количество заказов
    int ordersQuantity();
}
