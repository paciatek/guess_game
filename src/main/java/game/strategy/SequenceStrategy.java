package game.strategy;

public class SequenceStrategy implements PlayStrategy {

    private int counter;

    public SequenceStrategy() {
        counter = 1;
    }

    @Override
    public int nextGuess() {
        return counter++;
    }

    @Override
    public void updateStatus(String status) {

    }
}
