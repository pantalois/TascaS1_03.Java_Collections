package level_1.exercici_3.App;

import level_1.exercici_3.data.CountryLoader;
import level_1.exercici_3.service.GameManagement;
import level_1.exercici_3.service.GameService;

public class Main {
    public static void main(String[] args) {

        GameService gameService = new GameService();

        GameManagement gameManagement = new GameManagement(gameService);

        gameManagement.run();


    }
}
