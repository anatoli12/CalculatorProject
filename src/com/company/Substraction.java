package com.company;

public class Substraction extends Calculator implements Operation{
    @Override
    public double calculate(double x, double y) {
        return x-y;
    }
}
