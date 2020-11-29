package edu.wit.comp1050;
import javafx.application.Application;
import  edu.wit.comp1050.Code;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;
/*
public class Main extends Code  {
    public static void main(String[] args) {
        int guessMin = 0;
        int guessMax = 10;
        Scanner welcome = new Scanner(System.in);
        System.out.println("welcome to Mastermind please press Start or Quit to cancel game (S or Q) ");
        String gameStart = welcome.next();
        while(gameStart.equals("Q")){
            System.exit(0);
        }
        do {
            System.out.println(Arrays.toString(_solution1));
            int[] g = new int[4];
            int[] guess = guessGet(g);
            int[] firstGuess = scoreGuess(_solution1, guess);
            int whitePeg = firstGuess[0];
            int blackPeg = firstGuess[1];
            System.out.println(Arrays.toString(firstGuess));
            guessMin++;
            if(guessMin >= guessMax && whitePeg <= 4 ) {
                System.out.println("You have lost, please try again!");
            }
        }while(guessMin <= guessMax && !gameStart.equals("Q"));

    }

    public static int[] scoreGuess(int[] code, int[] guess) {
        int[] tempCode = new int[4];
        int[] tempGuess = new int[4];
        for (int i = 0; i < 4; i++) {
            tempCode[i] = code[i];
            tempGuess[i] = guess[i];
        }


        int blackPegs = 0;
        for (int i = 0; i < code.length; i++) {
            if (tempCode[i] == (tempGuess[i])) {
                blackPegs++;
                tempCode[i] = -1;
                tempGuess[i] = -1;
            }
        }

        int whitePegs = 0;
        for (int i = 0; i < code.length; i++) {
            if (tempCode[i] == -1) {
                continue;
            }
            for (int j = 0; j < code.length; j++) {
                if (tempGuess[j] == -1) {
                    continue;
                }
                if (tempCode[i] == tempGuess[j]) {
                    whitePegs++;
                    tempCode[i] = -1;
                    tempGuess[j] = -1;
                }
            }
        }
        int[] score = new int[2];
        score[0] = blackPegs;
        score[1] = whitePegs;
        boolean youWin = false;
        if (blackPegs == 4) {
            youWin = true;
            System.out.println("You Win!");
            return score;
        }
        return score;
    }

    static int[] guessGet(int[] g) {
        int[] guess = new int[4];
        Scanner startOrQuit = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            System.out.println("Please input your guess");
            for (int i = 0; i < guess.length; i++) {
                guess[i] = input2.nextInt();
            }
        return guess;
    }
    public static int[] _solution1 = getSolution();




}
*/
