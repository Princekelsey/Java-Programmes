package com.prince;

public class Main {

    public static void main(String[] args) {

        String myString = "This is my string";
        System.out.println("My string is " + myString);
        myString = myString + ", and this is more";
        System.out.println("My string is " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("My string is " + myString);

        // you can also add a String with other primitive data types
    }
}
