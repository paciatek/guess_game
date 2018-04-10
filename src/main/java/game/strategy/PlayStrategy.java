package game.strategy;

public interface PlayStrategy {

    int nextGuess();

    void updateStatus(String status);
}
