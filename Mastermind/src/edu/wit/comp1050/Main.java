package edu.wit.comp1050;
import javafx.application.Application;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main extends Code implements Guess{
    private ArrayList<String> _solution = getSolution();
    private ArrayList<String> _guess = Guess.guessGet();

    public static void main(String[] args) {
        Main game = new Main();
        game.printAnswers();
    }
    public static int scoreGuess() {
        int score = 0;

        return 0;

    }

    public void printAnswers(){
        System.out.println(Guess.guessGet());
        System.out.println(getSolution());
    }
}
