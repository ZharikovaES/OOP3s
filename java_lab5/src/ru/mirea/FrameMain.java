package ru.mirea;

import javax.swing.*;

public class FrameMain extends JFrame {
    private JLabel labelImg;

    FrameMain(String p) {
        ImageIcon image = new ImageIcon(p);
        setSize(image.getIconWidth(), image.getIconHeight());

        labelImg = new JLabel(image, SwingConstants.CENTER);
        getContentPane().add(labelImg);
    }

    public static void main(String[] args) {
        FrameMain frame = new FrameMain(args[0]);
        frame.setVisible(true);
    }
}
