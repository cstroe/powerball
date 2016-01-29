package com.github.cstroe.powerball;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BallTest {

    @Test
    public void to_string_space_padding() {
        {
            Ball b2 = new BallInstance(2, 0, 2);
            assertEquals(" 2", String.valueOf(b2));
        }
        {
            Ball b13 = new BallInstance(13, 0, 13);
            assertEquals("13", String.valueOf(b13));
        }
    }

    private class BallInstance extends Ball {
        public BallInstance(int value, int lowLimit, int highLimit) {
            super(value, lowLimit, highLimit);
        }
    }
}