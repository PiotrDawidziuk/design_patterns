package com.singleton;

public class Logger {

    private static Logger logger;
    private static int instancesCreated = 0;
    private static int getInstanceUsed = 0;

    public static int getInstancesCreated() {
        return instancesCreated;
    }

    public static int getGetInstanceUsed() {
        return getInstanceUsed;
    }

    private Logger(){

    }

    public static Logger getInstance(){
        if (logger == null){
            logger = new Logger();
            instancesCreated++;
        }
        getInstanceUsed++;
        return logger;
    }
}
