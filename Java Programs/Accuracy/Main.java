package com.prince;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

//        double result1 = 0.1 * 8;
//        double result2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
//        System.out.printf("Result1 is %f %n", result1);
//        System.out.printf("Result2 is %f %n", result2);
//
//        double difference = result1 - result2;
//        System.out.printf("Difference is %.99f %n", difference);

        BigDecimal oneTenth = BigDecimal.valueOf(0.1);

        BigDecimal result1 = oneTenth.multiply(BigDecimal.valueOf(7));
        BigDecimal result2 = oneTenth.add(oneTenth
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth));
        BigDecimal difference2 = result1.subtract(result2);
        System.out.printf("The difference is %.99f %n", difference2);

    }
}
