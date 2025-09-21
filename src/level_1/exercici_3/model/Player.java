package level_1.exercici_3.model;

public class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }


    public String getName() {
        return this.name;
    }


    public int getScore() {
        return score;
    }


    public void addPoints(int points) {
        this.score = this.score + points;
    }

    @Override
    public String toString() {
        return "PLAYER:\n"
                + "name: " + this.name
                + "score: " + this.score;
    }
}
