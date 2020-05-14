package com.factory;

public class WrongCommand implements Calculate{

    @Override
    public void calculate(double num1, double num2) {
        System.out.println("Wrong command");
    }
}
