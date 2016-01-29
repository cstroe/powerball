package com.github.cstroe.powerball;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class RandomPowerballPickGeneratorTest {
    
    @Test
    public void generate_a_new_pick_each_time() {
        PowerballPickGenerator gen = new RandomPowerballPickGenerator();

        PowerballPick p1 = gen.get();
        PowerballPick p2 = gen.get();

        assertFalse(p1 == p2);
    }
}