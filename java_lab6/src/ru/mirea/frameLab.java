package ru.mirea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frameLab extends JFrame {
    private frameLab() {
        super("Л/р 6");
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        class JP extends JPanel {
            JP(String part) {
                super( new BorderLayout());
                setBorder(BorderFactory.createLineBorder(Color.black));
                JLabel lb = new JLabel(part);
                lb.setHorizontalAlignment(JLabel.CENTER);
                add(lb, BorderLayout.CENTER);
            }
        }

        JP[] arr = {new JP("WEST"), new JP("EAST"), new JP("SOUTH"),
                    new JP("NORTH"), new JP("CENTER")};

        class CustomListener extends MouseAdapter {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на запад");
            }
        }

        class CustomListener1 extends MouseAdapter {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на восток");
            }
        }

        class CustomListener2 extends MouseAdapter {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на юг");
            }
        }

        class CustomListener3 extends MouseAdapter {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на север");
            }
        }

        class CustomListener4 extends MouseAdapter {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в центр");
            }
        }

        arr[0].addMouseListener(new CustomListener());
        arr[1].addMouseListener(new CustomListener1());
        arr[2].addMouseListener(new CustomListener2());
        arr[3].addMouseListener(new CustomListener3());
        arr[4].addMouseListener(new CustomListener4());

        getContentPane().add(arr[0], BorderLayout.WEST);
        getContentPane().add(arr[1], BorderLayout.EAST);
        getContentPane().add(arr[2], BorderLayout.SOUTH);
        getContentPane().add(arr[3], BorderLayout.NORTH);
        getContentPane().add(arr[4], BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new frameLab().setVisible(true);
    }
}
