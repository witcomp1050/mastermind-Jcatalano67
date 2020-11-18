package edu.wit.comp1050;
import java.io.*;
import java.util.*;

public class Code{
    public static String makeCode(String[] p) {
        // int for random element removal
        ArrayList<Character> colorList = new ArrayList<Character>();
        colorList.add(0,'G');
        colorList.add(1,'B');
        colorList.add(2,'Y');
        colorList.add(3,'R');
        colorList.add(4,'O');
        colorList.add(5,'P');
       int rand = (int) ((Math.random()* colorList.size()));
       colorList.remove(rand);
       colorList.remove(rand);
        String solutionToString = colorList.toString();
        return solutionToString;

        }

    public void getSolution() {
        String [] peg = new String[4];
        String pegCode = makeCode(peg);
        System.out.println(pegCode);
    }

    }

