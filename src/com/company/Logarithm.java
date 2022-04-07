package com.company;

public class Logarithm implements Operation{

    @Override
    public double calculate(double number, double base) {
        return Math.log(number)/Math.log(base);
    }
}
