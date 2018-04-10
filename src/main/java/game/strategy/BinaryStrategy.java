package game.strategy;

public class BinaryStrategy implements PlayStrategy {


    private int beginValue;
    private int endValue;
    private int guess;

    public BinaryStrategy () {
        beginValue = 1;
        endValue = 100;

    }
    @Override
    public int nextGuess() {
        guess = (endValue+beginValue)/2;
        return guess;
    }

    @Override
    public void updateStatus(String status) {
        if (status.equals("LESS")) {
            endValue = guess - 1;
        } else if (status.equals("MORE")) {
            beginValue = guess + 1;
        }

    }
}
