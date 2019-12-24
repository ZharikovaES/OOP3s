package ru.mirea;

public class Team {
    private String name;
    private int score;
    Team(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void resetScore() {
        score = 0;
    }

    public void addPoint() {
        score++;
    }
}
