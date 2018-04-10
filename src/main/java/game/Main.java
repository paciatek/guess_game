package game;

import game.game.Game;
import game.player.CpuPlayer;
import game.player.HumanPlayer;
import game.player.Player;
import game.strategy.BinaryStrategy;
import game.strategy.RandomStrategy;

public class Main {

    public static void main(String[] args) {
        Player humanPlayer = new HumanPlayer();
        Player cpuPlayer = new CpuPlayer(new BinaryStrategy());

        Game game = new Game(humanPlayer, cpuPlayer);

        game.start();
    }
}
