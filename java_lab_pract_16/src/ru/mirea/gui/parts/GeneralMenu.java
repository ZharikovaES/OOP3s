package ru.mirea.gui.parts;

import ru.mirea.gui.MainFrame;

import javax.swing.*;
import java.awt.*;

public class GeneralMenu extends JMenuBar {

    public GeneralMenu(Component parent, JMenu[] others){
        JMenu fileMenu = new JMenu("Файл");

        JMenuItem showAll = new JMenuItem("Показать все окна");
        showAll.addActionListener(e-> MainFrame.getInstance().showAll());
        fileMenu.add(showAll);

        JMenuItem exit = new JMenuItem("Выход");
        exit.addActionListener(e->System.exit(0));
        fileMenu.add(exit);

        this.add(fileMenu);

        for(JMenuItem m: others){
            this.add(m);
        }
    }
}
