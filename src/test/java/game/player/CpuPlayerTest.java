package game.player;

import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import game.strategy.PlayStrategy;

public class CpuPlayerTest {

    private Player player;

    @Mock
    private PlayStrategy playStrategy;

    @Before
    public void setUp() {
        initMocks(this);
        player = new CpuPlayer(playStrategy);
    }

    @Test
    public void shouldReturnInitNumberWithinRange() {
        int beginRange = 1;
        int endRange = 100;

        for (int i = 0; i < 1000; ++i) {
            int choice = player.getChoice();

            Assert.assertTrue(choice >= beginRange);
            Assert.assertTrue(choice <= endRange);
        }
    }

    @Test
    public void shouldInvokeStrategy() {

        Mockito.when(playStrategy.nextGuess())
                .thenReturn(33);

        int actual = player.getGuess();

        Assert.assertEquals(33, actual);
        Mockito.verify(playStrategy, Mockito.times(1))
                .nextGuess();
    }

    @Test
    public void checkStatus() {

        player.updateStatus("less");

        Mockito.verify(playStrategy, Mockito.times(1))
                .updateStatus("less");

    }

}