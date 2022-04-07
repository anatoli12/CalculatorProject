package com.company;

public class Division extends Calculator implements Operation{

    @Override
    public double calculate(double x, double y) {
        return x/y;
    }
}
