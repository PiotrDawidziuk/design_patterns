package com.factory;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("Enter add, divide, multiply or subtract to get result");

        CalculateFactory calculateFactory = new CalculateFactory();
        Calculate obj = calculateFactory.getCalculation(input.next());
        obj.calculate(num1, num2);

    }

}
