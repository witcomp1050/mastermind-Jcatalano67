package edu.wit.comp1050;
import java.io.*;
import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

public class Code{
    public static int[] makeCode(Integer[] c) {
        // int for random element removal
        Set<Integer>codeSet = new LinkedHashSet<Integer>();
        Random rand = new Random();

        while (codeSet.size() < 4) {
            codeSet.add(rand.nextInt(6));
        }
        return convertCode(codeSet);
        }
        public static int[] DupsCode(Integer[] c) {
        Set<Integer> codeSet2 = new HashSet<>();
        Random rand2 = new Random();
            while(codeSet2.size() < 4) {
                codeSet2.add(rand2.nextInt(6));
            }
            return convertCode(codeSet2);
        }

    /**
     * converts the LinkedHashSet to primative int to be used for guess comparison
     * @param
     * @return
     */
    public static  int[] convertCode (Set<Integer> c){
          return ArrayUtils.toPrimitive(c.toArray(new Integer[4]));
        }

    public static int[] getSolution() {
        Integer[] peg = new Integer[4];
        int[] pegCode = makeCode(peg);
        return pegCode;
    }
    public static void getSolution2() {
        Integer[] peg2 = new Integer[4];
        int[] pegCode2 = DupsCode(peg2);
        System.out.println(pegCode2);
    }

    }

