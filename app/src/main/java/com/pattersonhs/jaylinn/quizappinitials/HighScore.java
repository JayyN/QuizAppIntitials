package com.pattersonhs.jaylinn.quizappinitials;

public class HighScore {
    int score;
    String name;
    int rank;

public HighScore(String newName, int newScore, int newRank){
        name = newName;
        score = newScore;
        rank = newRank;
    }

    public String getName() {return name;}

    public int getScore() {return score;}

    public int getRank() {return rank;}

    public void setName(String name) {this.name = name;}

    public void setScore(int score) {this.score = score;}

    public void setRank(int rank) {this.rank = rank;}
}
