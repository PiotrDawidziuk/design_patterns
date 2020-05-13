package com.commandline;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter command: ");
        boolean running = true;

        while (running) {
            String text = input.next().toLowerCase();

            switch (text) {
                case "do":
                    System.out.println("doing");
                    break;
                case "exit":
                    System.out.println("exiting");
                    running = false;
                    break;
            }


        }
    }
}
