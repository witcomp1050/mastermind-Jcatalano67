package edu.wit.comp1050;
import javafx.application.Application;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main extends Code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // user input will soon be click to fill peg
        System.out.println("Please input guess");
        String guess = input.next();
        String[] guessSubs = guess.split(" ");
        //takes input, puts it into List then array of objects to compare with solution
        List<String> guessList = Arrays.asList(guessSubs);
        guessList.toArray();

        String firstGuess = guessList.toString();
        System.out.println(firstGuess);
        Main game = new Main();
        game.getSolution();

    }
    public static int scoreGuess(String[] guess) {
        return 0;

    }

}
