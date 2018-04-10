package game.strategy;

import java.util.Random;

public class RandomStrategy implements PlayStrategy {

    private Random random;

    public RandomStrategy() {
        random = new Random();
    }

    @Override
    public int nextGuess() {
        return random.nextInt(100) + 1;
    }

    @Override
    public void updateStatus(String status) {

    }
}
