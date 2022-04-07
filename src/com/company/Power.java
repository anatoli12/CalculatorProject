package com.company;

public class Power extends Calculator implements Operation{

    @Override
    public double calculate(double x, double y) {
        return Math.pow(x,y);
    }
}
