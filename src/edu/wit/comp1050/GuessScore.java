package edu.wit.comp1050;
import javafx.application.Application;
import  edu.wit.comp1050.CodeMaker;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.stream.IntStream;
import edu.wit.comp1050.CodeClass;
import edu.wit.comp1050.CodeMaker;

public class GuessScore {
    public GuessScore(){

    }
    public int[] scoreGuess(int[] code, int[] guess) {
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
        if (blackPegs == 4) {
            return score;
        }
        return score;
    }
}


