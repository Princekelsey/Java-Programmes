package com.prince;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 3000;
        int levelCompleted = 5;
        int bonus = 100;

//
//        if (score <5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        }else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        }else{
//            System.out.println("Got here");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);

        }

//    either you create new variables
//        boolean newGameOver = true;
//        int score2 = 10000;
//        int level2 = 8;
//        int bonus2 = 200;
//
//        if (newGameOver) { // or gameOver instead of writing gameOver == true
//            int finalScore = score2 + (level2 * bonus2);
//            System.out.println("Your final score is " + finalScore);

        // or you reuse the old variables and change their values

         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        if (gameOver) { // or gameOver instead of writing gameOver == true
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);

        }

        }
    }

