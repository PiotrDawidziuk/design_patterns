package com.factory;

public class Add implements Calculate{

    @Override
    public void calculate(double a, double b) {
        System.out.println(a+" + "+b+" = " + (a+b));
    }
}
