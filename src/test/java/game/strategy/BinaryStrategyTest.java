package game.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryStrategyTest {

    private  PlayStrategy playStrategy;

    @Before
    public void setUp(){

        playStrategy = new BinaryStrategy();
    }

    @Test
    public void checkFirstInitGuess(){
        int actual = playStrategy.nextGuess();
        Assert.assertEquals(50,actual);
    }

    @Test
    public void shouldguess27 () {
        int actual = playStrategy.nextGuess();
        Assert.assertEquals(50, actual);
        playStrategy.updateStatus("LESS");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(25,actual);
        playStrategy.updateStatus("MORE");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(37, actual);
        playStrategy.updateStatus("LESS");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(31, actual);
        playStrategy.updateStatus("LESS");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(28, actual);
        playStrategy.updateStatus("LESS");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(26, actual);
        playStrategy.updateStatus("MORE");
    }

    @Test
    public void shouldguess72 () {
        int actual = playStrategy.nextGuess();
        Assert.assertEquals(50, actual);
        playStrategy.updateStatus("MORE");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(75, actual);
        playStrategy.updateStatus("LESS");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(62, actual);
        playStrategy.updateStatus("MORE");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(68, actual);
        playStrategy.updateStatus("MORE");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(71, actual);
        playStrategy.updateStatus("MORE");
        actual = playStrategy.nextGuess();
        Assert.assertEquals(73, actual);
        playStrategy.updateStatus("LESS");

    }

}