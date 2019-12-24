package ru.mirea;
import java.awt.event.*;
import javax.swing.*;

public class Functions {
    public static void addPoinFirstTeam(Team team1, Team team2, JLabel label1, JLabel label2, JLabel label3) {
        team1.addPoint();
        searchWinner(team1, team2, label1, label3);
        label2.setText("Last Scorer: " + team1.getName());
    }

    public static void addPoinSecondTeam(Team team1, Team team2, JLabel label1, JLabel label2, JLabel label3) {
        team2.addPoint();
        searchWinner(team1, team2, label1, label3);
        label2.setText("Last Scorer: " + team2.getName());
    }

    public static void clearFrame(Team team1, Team team2, JLabel label1, JLabel label2, JLabel label3) {
        team1.resetScore();
        team2.resetScore();
        label1.setText("Result: 0 X 0");
        label2.setText("Last Scorer: N/A");
        label3.setText("Winner: DRAW");
    }

    private static void searchWinner(Team team1, Team team2, JLabel label1, JLabel label3) {
        label1.setText("Result: " + team1.getScore() + " X " + team2.getScore());
        if (team1.getScore() > team2.getScore())
            label3.setText("Winner: " + team1.getName());
        else if (team1.getScore() == team2.getScore())
            label3.setText("Winner: DRAW");
        else label3.setText("Winner: " + team2.getName());
    }
}
