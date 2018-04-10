package game.game;

import game.player.Player;

public class Game {

    private Player firstPlayer;
    private Player secondPlayer;

    public Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {

        int step = 0;

        int choice = firstPlayer.getChoice();
        int guess = -1;

        while (guess != choice) {
            ++step;
            guess = secondPlayer.getGuess();
            String status = getStatus(choice, guess);
            secondPlayer.updateStatus(status);

        }

        System.out.println("Gratulacje wygrales. Potrzebowales " + step + " ruchow");

    }

    private String getStatus(int choosen, int actual) {
        if (choosen < actual) {
            return "LESS";
        } else if (choosen > actual) {
            return "MORE";
        } else {
            return "WIN";
        }
    }
}
