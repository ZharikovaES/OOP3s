package ru.mirea.gui.parts;

import ru.mirea.gui.MainFrame;
import ru.mirea.menu.DrinkTypeEnum;

import javax.swing.*;
import java.awt.*;


public class OrderPane extends JTabbedPane {
    private int tNum;
    public OrderPane(int tNum){
        this.tNum = tNum;
        this.setTabPlacement(LEFT);
        addOrderTab();
        this.addChangeListener(e->{
            if(this.getSelectedIndex() == this.getTabCount()-1){
                addOrderTab();
            }
        });

    }

    public static class SinOrderPane extends JPanel{
        private JComboBox<String> cb;
        private JComboBox<DrinkTypeEnum> dt;
        private JTextField tf, name, desc, cost;
        private JPanel mp;

        public String [] getData(){
            String[] s = new String[mp.getComponentCount()==12?5:3];
            s[0] = name.getText();
            s[1] = desc.getText();
            s[2] = cost.getText();
            if(s.length == 5){
                s[3] = ((JTextField)mp.getComponent(mp.getComponentCount()-1)).getText();
                s[4] = ((JComboBox)mp.getComponent(mp.getComponentCount()-3)).getSelectedItem().toString();
            }
            return s;
        }

        SinOrderPane(int tNum){

            mp = new JPanel();

            cb = new JComboBox<>(new String[]{
                    "Блюдо", "Напиток"
            });
            cb.addItemListener(e->{
                if(cb.getSelectedIndex() == 1 && dt == null){
                    dt = new JComboBox<>(DrinkTypeEnum.values());
                    JLabel l = new JLabel("Тип напитка: ");
                    l.setLabelFor(dt);
                    tf = new JTextField();
                    JLabel l2 = new JLabel("Алкоголь: ");
                    l2.setLabelFor(tf);

                    mp.add(l);
                    mp.add(dt);
                    mp.add(l2);
                    mp.add(tf);
                }else if(cb.getSelectedIndex() != 1 && dt != null){
                    for(int i = 0; i < 4; i++)
                        mp.remove(mp.getComponentCount()-1);
                    dt = null;
                    tf = null;
                }
                this.updateUI();
            });
            name = new JTextField();
            name.setPreferredSize(new Dimension(300, 20));
            JLabel l = new JLabel("Название: ");
            l.setLabelFor(name);
            desc = new JTextField();
            desc.setPreferredSize(new Dimension(60, 20));
            JLabel ld = new JLabel("Описание: ");
            ld.setLabelFor(name);
            cost = new JTextField();
            cost.setPreferredSize(new Dimension(60, 20));
            JLabel l2 = new JLabel("Цена: ");
            l2.setLabelFor(name);

            mp.setLayout(new GridLayout(0, 2));
            mp.add(cb);
            mp.add(new JPanel());
            mp.add(l);
            mp.add(name);
            mp.add(ld);
            mp.add(desc);
            mp.add(l2);
            mp.add(cost);
            this.add(mp, BorderLayout.CENTER);
            if(tNum>0){
                JButton add = new JButton("Добавить в заказ");
                add.addActionListener(e-> MainFrame.getInstance().addToOrder(getData(), tNum));
                this.add(add, BorderLayout.SOUTH);

            }
        }
    }

    private void addOrderTab(){
        if(this.getTabCount()>0) {
            this.setSelectedIndex(0);
            removeTabAt(getTabCount()-1);
        }
        this.addTab("Элемент " + (this.getTabCount()+1), new SinOrderPane(tNum));

        this.addTab("+", new JPanel());

    }
}
