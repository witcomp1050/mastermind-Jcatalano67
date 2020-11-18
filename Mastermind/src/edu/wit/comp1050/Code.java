package edu.wit.comp1050;
import java.io.*;
import java.util.*;

public class Code{
    public static Object[] makeCode(Object[] p) {
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
        Object [] solution = colorList.toArray();


        return solution;

        }

    public void getSolution() {
        Object[] peg = new Object[4];
        Object [] pegCode = makeCode(peg);
        System.out.println(Arrays.toString(pegCode));
        // have list take off too before solution
    }

    }

