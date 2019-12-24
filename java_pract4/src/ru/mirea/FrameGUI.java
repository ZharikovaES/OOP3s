package ru.mirea;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameGUI extends JFrame {
    Team team1 = new Team("AC Milan");
    Team team2 = new Team("Real Madrid");
    JButton button1 = new JButton(team1.getName());
    JButton button2 = new JButton(team2.getName());
    JButton button3 = new JButton("Reset the game score");
    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");


    FrameGUI() {
        super("Таблица результатов матчей");
        setLayout(null);
        setResizable(false);
        button1.setBounds(20, 20, 120, 30);
        button2.setBounds(20, 70, 120, 30);

        label1.setBounds(160, 20,150, 30);
        label2.setBounds(160, 70,150, 30);
        label3.setBounds(160, 120,150, 30);

        button3.setBounds(310, 120, 160, 30);

        add(button1);
        add(button2);
        add(label1);
        add(label2);
        add(label3);
        add(button3);

        setSize(500, 200);

        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Functions.addPoinFirstTeam(team1, team2, label1, label2, label3);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Functions.addPoinSecondTeam(team1, team2, label1, label2, label3);
            }

        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Functions.clearFrame(team1, team2, label1, label2, label3);
            }

        });
    }
}
