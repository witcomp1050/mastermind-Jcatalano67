package edu.wit.comp1050;
import java.io.*;
import java.util.*;
import org.apache.commons.lang3.ArrayUtils;
// class to generate code and store it
public class CodeMaker {
    public  CodeMaker() {
        // int for random element removal
        pegSet = new LinkedHashSet<>();
        Random rand = new Random();

        while (pegSet.size() < 4) {
            pegSet.add(rand.nextInt(6));
        }
        System.out.println(pegSet.toString());
        convertCode(pegSet);
    }

/**
 * converts the LinkedHashSet to primative int to be used for guess comparison
 * @param
 * @return
 */
      void convertCode (Set<Integer> tempPegSet){

          int [] code = ArrayUtils.toPrimitive(tempPegSet.toArray(new Integer[4]));
          _solution  = new CodeClass(code);

        }
        public CodeClass solutionGetter(){
         return _solution;
        }
  public void set_solution(CodeClass solution){
         this._solution = solution;
}

    private Set<Integer> pegSet;
    private CodeClass _solution;


    }

