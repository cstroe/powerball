package com.github.cstroe.powerball;

public abstract class Ball {
    protected int value;

    protected Ball(int value, int lowLimit, int highLimit) {
        if(value < lowLimit || value > highLimit) {
            throw new IllegalArgumentException("Ball value can is out of bounds. Must be " + lowLimit + "-" + highLimit + " but was " + value);
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if(value < 10) {
            return " " + Integer.toString(value);
        } else {
            return Integer.toString(value);
        }
    }
}
