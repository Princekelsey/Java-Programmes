package com.prince;

public class Main {

    public static void main(String[] args) {

        int apple = 18;
        int oranges = 9;
        double applePrice = 12.5;
        double orangePrice = 6;

        boolean moreApples;
        boolean applesAreDearer;

        moreApples = (apple > oranges);
        applesAreDearer = (applePrice > orangePrice);

        System.out.printf("We have more apples: %s %n", moreApples);
        System.out.printf("Apples are Dearer: %s %n", applesAreDearer);

//        System.out.println(apple == oranges);
//        System.out.println(apple != oranges);
//
//        System.out.printf("%d > %d is %s %n", apple, oranges, apple > oranges);
//        System.out.printf("%d < %d is %s %n", apple, oranges, apple < oranges);
//        System.out.printf("%d >= %d is %s %n", apple, oranges, apple >=oranges);
//        System.out.printf("%d <= %d is %s %n", apple, oranges, apple <= oranges);
//
//        System.out.printf("Reducing price: %s %n", (apple > oranges) && (applePrice > orangePrice));

    }
}
