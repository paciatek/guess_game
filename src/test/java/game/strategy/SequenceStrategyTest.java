package game.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SequenceStrategyTest {

    private PlayStrategy playStrategy;

    @Before
    public void setUp() {
        playStrategy = new SequenceStrategy();
    }

    @Test
    public void shouldGuess1AsAFirstTime() {
        int actual = playStrategy.nextGuess();

        Assert.assertEquals(1, actual);
    }

    @Test
    public void shouldGuessSequentially() {
        for (int i = 1; i <= 100; ++i) {
            Assert.assertEquals(i, playStrategy.nextGuess());
        }
    }
}