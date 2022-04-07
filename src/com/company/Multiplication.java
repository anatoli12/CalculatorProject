package com.company;

public class Multiplication extends Calculator implements Operation{

    @Override
    public double calculate(double x, double y) {
        return x*y;
    }
}
