package com.prince;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotalValue = (myMinValue/2);
        System.out.println("myTotalValue =" + myTotalValue);

        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue =" + myNewByteValue);

        //short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue =" + myShortValue);

        //long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
        long myNewLongValue = (myLongValue/2);
        System.out.println("myNewLongValue =" + myNewLongValue);
    }
}
