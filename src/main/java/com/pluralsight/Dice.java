package com.pluralsight;

public class Dice {
    private int minValue = 1;
    private int maxValue = 6;
    public Dice(){
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public int roll(){
        return this.minValue + (int)(Math.random() * this.maxValue);
    }
}
