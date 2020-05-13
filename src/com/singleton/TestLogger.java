package com.singleton;

public class TestLogger {
    public static void main(String[] args) {

        Logger obj1 = Logger.getInstance();
        System.out.println("Hash code of obj1: "+obj1.hashCode()+" Number of Logger objects: "+Logger.getInstancesCreated());
        System.out.println("Number of getInstsance function used: "+Logger.getGetInstanceUsed());
        Logger obj2 = Logger.getInstance();
        System.out.println("Hash code of obj2: "+obj2.hashCode()+" Number of Logger objects: "+Logger.getInstancesCreated());
        System.out.println("Number of getInstsance function used: "+Logger.getGetInstanceUsed());
        Logger obj3 = Logger.getInstance();
        System.out.println("Hash code of obj3: "+obj3.hashCode()+" Number of Logger objects: "+Logger.getInstancesCreated());
        System.out.println("Number of getInstsance function used: "+Logger.getGetInstanceUsed());

    }
}
