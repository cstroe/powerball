package im.wh.powerball;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhiteBallTest {

    @Test
    public void value_gets_returned() {
        WhiteBall ball = new WhiteBall(1);
        assertEquals(ball.getValue(),1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void disallow_low_value() {
        new WhiteBall(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void disallow_high_value() {
        new WhiteBall(60);
    }

    @Test
    public void valid_numbers() {
        for(int i = 1; i <= 59; i++) {
            new WhiteBall(i);
        }
    }
}