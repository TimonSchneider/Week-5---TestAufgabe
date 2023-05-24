package ch.zhaw.springboot.demo;

public class ScoreKeeper {
    private int scoreTeamA;
    private int scoreTeamB;

    public ScoreKeeper() {
        this.scoreTeamA = 0;
        this.scoreTeamB = 0;
    }

    public String getScore() {
        return String.format("%03d:%03d", this.scoreTeamA, this.scoreTeamB);
    }
}
