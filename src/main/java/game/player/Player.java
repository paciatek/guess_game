package game.player;

public interface Player {

    int getChoice();

    int getGuess();

    void updateStatus(String status);
}
