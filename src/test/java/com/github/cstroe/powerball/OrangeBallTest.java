package com.github.cstroe.powerball;

import org.junit.Test;

public class OrangeBallTest {

    @Test
    public void value_gets_returned() {
        OrangeBall ob = new OrangeBall(2);
        assert ob.getValue() == 2;
    }

    @Test(expected = IllegalArgumentException.class)
    public void disallow_low_values() {
        new OrangeBall(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void disallow_high_values() {
        new OrangeBall(36);
    }

    @Test
    public void valid_numbers() {
        for(int i = 1; i <= 35; i++) {
            new OrangeBall(i);
        }
    }

}