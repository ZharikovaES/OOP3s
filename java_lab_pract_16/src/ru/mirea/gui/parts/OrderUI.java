package ru.mirea.gui.parts;

import ru.mirea.menu.Drink;
import ru.mirea.menu.MenuItem;
import ru.mirea.orders.Order;

import javax.swing.*;

public class OrderUI extends JPanel {
    public OrderUI(Order order){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        MenuItem[] items = order.getItems();
        for (MenuItem item : items) {
            JLabel l = new JLabel(item.getName() + "\t: " + order.itemQuantity(item));
            StringBuilder sb = new StringBuilder();
            if (item instanceof Drink) {
                sb.append("Тип: ").append(((Drink) item).getType()).append("\nАлкоголя: ").append(((Drink) item).getAlcoholVol()).append("\n");
            }
            sb.append(item.getDescription());
            l.setToolTipText(sb.toString());
            add(l);
        }
    }
}
