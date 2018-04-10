package game.player;

import java.util.Scanner;

public class HumanPlayer implements Player {

    @Override
    public int getChoice() {
        System.out.println("Wymyśl liczbę [1-100]");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public int getGuess() {
        System.out.println("Podaj następną liczbę");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void updateStatus(String status) {
        System.out.println("Status: " + status);
    }
}
