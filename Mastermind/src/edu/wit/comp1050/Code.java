package edu.wit.comp1050;
import java.io.*;
import java.util.*;

public class Code{
    public static Object [] makeCode(Object[] p) {
        ArrayList<Character> colorList = new ArrayList<Character>();
        colorList.add(0,'G');
        colorList.add(1,'B');
        colorList.add(2,'Y');
        colorList.add(3,'R');
        colorList.add(4,'O');
        colorList.add(5,'P');
        Collections.shuffle(colorList);
        Object [] solution = colorList.toArray();

        return solution;

        }
    public int scoreGuess() {
        return 0;
    }
    public char getSolution() {
        return 0;
    }
    public static void main(String[] args) {
        Object[] peg = new Object[4];
        Object [] pegCode = makeCode(peg);
        System.out.println(Arrays.toString(pegCode));

    }
}
