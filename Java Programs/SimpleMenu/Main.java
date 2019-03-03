package com.prince;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userChoice;

        System.out.println("Please choose one of the following options");
        System.out.println("1. Cappucino");
        System.out.println("2. Latte");
        System.out.println("3. Americano");
        System.out.println("4. Mocha");
        System.out.println("5. Macchiato");
        System.out.println("6. Expresso");
        System.out.println("Q. Quit the program");
        do {
            userChoice = keyboard.nextLine();
            System.out.println("You choose " + userChoice);
        } while (!userChoice.equalsIgnoreCase("q"));
        keyboard.close();


    }
}
