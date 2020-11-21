package edu.wit.comp1050;
import java.io.*;
import java.util.*;

public class Code{
    public static ArrayList<String> makeCode(ArrayList<String> p) {
        // int for random element removal
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add(0,"G");
        colorList.add(1,"B");
        colorList.add(2,"Y");
        colorList.add(3,"R");
        colorList.add(4,"O");
        colorList.add(5,"P");
       int rand = (int) ((Math.random()* colorList.size()));
       colorList.remove(rand);
       colorList.remove(rand);
        return colorList;

        }

    public ArrayList<String> getSolution() {
        ArrayList<String> peg = new ArrayList<>(4);
        ArrayList<String> pegCode = makeCode(peg);
        return pegCode;
    }

    }

