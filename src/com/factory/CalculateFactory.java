package com.factory;

public class CalculateFactory {

    public Calculate getCalculation(String type){

        Calculate obj = null;

        if(type.toLowerCase().equals("add")){
            obj = new Add();
        }
        else if (type.toLowerCase().equals("subtract")){
            obj = new Subtract();
        }
        else if (type.toLowerCase().equals("multiply")){
            obj = new Multiply();
        }
        else if (type.toLowerCase().equals("divide")){
            obj = new Divide();
        }
        else {
            obj = new WrongCommand();
        }

        return obj;
    }
}
