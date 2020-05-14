package com.factory;

public class Multiply implements Calculate {
    @Override
    public void calculate(double a, double b) {
        System.out.println(a+" x "+b+" = "+ (a*b));
    }
}
