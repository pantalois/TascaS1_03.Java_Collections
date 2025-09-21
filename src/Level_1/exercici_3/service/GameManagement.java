package level_1.exercici_3.service;

import level_1.exercici_3.data.GameResultSaver;
import level_1.exercici_3.model.Player;

import java.util.Scanner;

public class GameManagement{
    GameService gameService;
    Scanner sc = new Scanner(System.in);
    GameResultSaver gameResultSaver;

    public GameManagement(GameService gameService) {
        this.gameService = gameService;
        this.gameResultSaver = new GameResultSaver();
    }

    public void run()
    {
        Player player = createPlayerName();
        int playedTimes = 0;
        while (playedTimes < 10) {
            if (gameService.askUserForAnswer(gameService.getRandomCountry())){
                player.addPoints(1);
            }
            playedTimes = playedTimes + 1;
        }

        this.gameResultSaver.saveResult(player);
        finalMessage(player);
    }

    private void finalMessage(Player player) {
        System.out.println("The game has ended, the player " + player.getName() + " ended with " + player.getScore() + " points.");
    }

    private Player createPlayerName(){
        System.out.println("Please enter the name of the player: ");
        String name = sc.nextLine();
        return new Player(name);
    }
}