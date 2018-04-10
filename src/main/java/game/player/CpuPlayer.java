package game.player;

import java.util.Random;

import game.strategy.PlayStrategy;

public class CpuPlayer implements Player {

    private PlayStrategy playStrategy;
    private Random random;

    public CpuPlayer(PlayStrategy playStrategy) {
        random = new Random();
        this.playStrategy = playStrategy;
    }

    @Override
    public int getChoice() {
        return random.nextInt(100) + 1;
    }

    @Override
    public int getGuess() {
        return playStrategy.nextGuess();
    }

    @Override
    public void updateStatus(String status) {
        playStrategy.updateStatus(status);
    }
}
