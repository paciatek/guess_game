package game.player;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HumanPlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new HumanPlayer();
    }

    @Test
    public void shouldReadInputFromScanner() {

        System.setIn(new ByteArrayInputStream("29".getBytes()));

        int choice = player.getChoice();

        Assert.assertEquals(29, choice);

    }


    @Test
    public void shouldReadInputFromScannerWhenGuess(){

        System.setIn(new ByteArrayInputStream("55".getBytes()));

        int guess = player.getGuess();

        Assert.assertEquals(55, guess);

    }

}