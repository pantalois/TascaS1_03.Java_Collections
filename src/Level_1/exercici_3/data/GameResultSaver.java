package level_1.exercici_3.data;

import level_1.exercici_3.model.Player;

import java.io.FileWriter;
import java.io.IOException;

public class GameResultSaver {

    private final String scoreSaverPath;

    public GameResultSaver() {
        this.scoreSaverPath = "src/level_1/exercici_3/classification.txt";
    }

    public void saveResult(Player player) {
        try (FileWriter fileWriter = new FileWriter(this.scoreSaverPath, true)){
            fileWriter.write("Player " + player.getName() + " - " + player.getScore() + " points\n");
        }catch (IOException e) {
            throw new RuntimeException("Error saving result "+ e.getMessage());
        }
    }

}
