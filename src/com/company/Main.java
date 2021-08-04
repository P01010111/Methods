package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000,8,200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;

        }
        return -1;
    }
}
/*  PUSH CHANGES TO GITHUB
    git add .
    git commit -m "insert a suitable message"
    git push
*/