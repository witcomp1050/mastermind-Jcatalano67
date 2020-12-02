package edu.wit.comp1050;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import org.apache.commons.lang3.ArrayUtils;
import java.util.*;

public class Controller  {

    public void submitGuess(){
        minGuess++;
        try {
            int[] userGuess = ArrayUtils.toPrimitive(InputSetter.toArray(new Integer[4]));
            GuessScore score = new GuessScore();
            int[] getScore = score.scoreGuess(solutionParam, userGuess);
            String printedScore = Arrays.toString(getScore);
            gameConsole.setText(printedScore + "(Black,White Pegs)");
            if (InputSetter.size() >= 4) {
                InputSetter.clear();
            }
            if(minGuess == maxGuess){
                gameConsole.setText("you have Lost!");
            }
            if(getScore[0] == 4){
                gameConsole.setText("You win!");
            }
        }catch (NullPointerException e) {
            System.out.println("Each guess must have four Pegs" );
        }
    }
    public void quit() {
        System.exit(0);
    }
    public void fillPegO () {
        count++;
        System.out.println(count);
        if(count == 0){
            InputSetter.add(0);
            cr.setFill(Color.ORANGE);
        }
        if(count == 1){
            cr.setFill(Color.ORANGE);
            InputSetter.add(0);
        }
        if(count == 2){
            cr1_2.setFill(Color.ORANGE);
            InputSetter.add(0);
        }
        if(count == 3){
            cr1_3.setFill(Color.ORANGE);
            InputSetter.add(0);
        }
        if(count == 4){
            cr1_4.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 5) {
            cr2_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 6) {
            cr2_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 7 ) {
            cr2_3.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 8) {
            cr2_4.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 9) {
            cr3_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 10) {
            cr3_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 11) {
            cr3_3.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 12) {
            cr3_4.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 13) {
            cr4_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 14) {
            cr4_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 15) {
            cr4_3.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 16) {
            cr4_4.setFill(Color.ORANGE);
            InputSetter.add(0);}


        if(count == 17) {
            cr5_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 18) {
            cr5_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 19) {
            cr5_3.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 20) {
            cr5_4.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 21) {
            cr6_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 22) {
            cr6_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 23) {
            cr6_3.setFill(Color.ORANGE);
            InputSetter.add(0);

        }

        if(count == 24) {
            cr6_4.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 25) {
            cr7_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 26) {
            cr7_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 27) {
            cr7_3.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 28) {
            cr7_4.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 29) {
            cr8_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 30) {
            cr8_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 31) {
            cr8_3.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 32) {
            cr8_4.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 33) {
            cr9_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 34) {
            cr9_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 35) {
            cr9_3.setFill(Color.ORANGE);
            InputSetter.add(0);
        }

        if(count == 36) {
            cr9_4.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 37) {
            cr10_1.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 38) {
            cr10_2.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 39) {
            cr10_3.setFill(Color.ORANGE);
            InputSetter.add(0);

        }
        if(count == 40) {
            cr10_4.setFill(Color.ORANGE);
            InputSetter.add(0);
        }
        System.out.println(InputSetter);


    }
    public void fillPegB(){
        count++;
        System.out.println(count);
        if(count == 0){
            InputSetter.add(1);
            cr.setFill(Color.BLUE);
        }
        if(count == 1) {
            cr.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 2){
            InputSetter.add(1);
            cr1_2.setFill(Color.BLUE);
        }
        if(count == 3){
            cr1_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 4){
            cr1_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 5) {
            cr2_1.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 6) {
            cr2_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 7 ) {
            cr2_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 8) {
            cr2_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 9) {
            cr3_1.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 10) {
            cr3_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 11) {
            cr3_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 12) {
            cr3_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 13) {
            cr4_1.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 14) {
            cr4_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 15) {
            cr4_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 16) {
            cr4_4.setFill(Color.BLUE);
            InputSetter.add(1);}

        if(count == 17) {

            InputSetter.add(1);
        }
        if(count == 18) {
            cr5_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 19) {
            cr5_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 20) {
            cr5_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 21) {
            cr6_1.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 22) {
            cr6_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 23) {
            cr6_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }

        if(count == 24) {
            cr6_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 25) {
            cr7_1.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 26) {
            cr7_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 27) {
            cr7_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 28) {
            cr7_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 29) {
            cr8_1.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 30) {
            cr8_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 31) {
            cr8_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 32) {
            cr8_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 33) {
            cr9_1.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 34) {
            cr9_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 35) {
            cr9_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 36) {
            cr9_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }

        if(count == 37) {
            cr10_1.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 38) {
            cr10_2.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 39) {
            cr10_3.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        if(count == 40) {
            cr10_4.setFill(Color.BLUE);
            InputSetter.add(1);
        }
        System.out.println(InputSetter);
    }
    public void fillPegG(){
        count++;
        System.out.println(count);
        if(count == 0){
            InputSetter.add(2);
            cr.setFill(Color.GREEN);
        }
        if(count == 1) {
            cr.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 2){
            cr1_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 3){
            cr1_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 4){
            cr1_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 5) {
            cr2_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 6) {
            cr2_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 7 ) {
            cr2_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 8) {
            cr2_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 9) {
            cr3_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 10) {
            cr3_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 11) {
            cr3_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 12) {
            cr3_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 13) {
            cr4_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 14) {
            cr4_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 15) {
            cr4_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 16) {
            cr4_4.setFill(Color.GREEN);
            InputSetter.add(2);}

        if(count == 17) {
            cr5_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 18) {
            cr5_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 19) {
            cr5_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 20) {
            cr5_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 21) {
            cr6_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 22) {
            cr6_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 23) {
            cr6_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 24) {
            cr6_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 25) {
            cr7_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 26) {
            cr7_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 27) {
            cr7_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 28) {
            cr7_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 29) {
            cr8_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 30) {
            cr8_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 31) {
            cr8_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 32) {
            cr8_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 33) {
            cr9_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 34) {
            cr9_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 35) {
            cr9_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 36) {
            cr9_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }

        if(count == 37) {
            cr10_1.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 38) {
            cr10_2.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 39) {
            cr10_3.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        if(count == 40) {
            cr10_4.setFill(Color.GREEN);
            InputSetter.add(2);
        }
        System.out.println(InputSetter);
    }

    public void fillPegP() {
        count++;
        System.out.println(count);
        if(count == 0){
            InputSetter.add(3);
            cr.setFill(Color.PURPLE);
        }
        if(count == 1) {
            cr.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 2){
            cr1_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 3){
            cr1_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 4){
            cr1_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 5) {
            cr2_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 6) {
            cr2_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 7 ) {
            cr2_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 8) {
            cr2_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 9) {
            cr3_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 10) {
            cr3_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 11) {
            cr3_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 12) {
            cr3_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 13) {
            cr4_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 14) {
            cr4_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 15) {
            cr4_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 16) {
            cr4_4.setFill(Color.PURPLE);
            InputSetter.add(3);}

        if(count == 17) {
            cr5_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 18) {
            cr5_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 19) {
            cr5_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 20) {
            cr5_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 21) {
            cr6_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 22) {
            cr6_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 23) {
            cr6_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }

        if(count == 24) {
            cr6_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 25) {
            cr7_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 26) {
            cr7_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 27) {
            cr7_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 28) {
            cr7_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 29) {
            cr8_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 30) {
            cr8_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 31) {
            cr8_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 32) {
            cr8_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 33) {
            cr9_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 34) {
            cr9_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 35) {
            cr9_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 36) {
            cr9_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }

        if(count == 37) {
            cr10_1.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 38) {
            cr10_2.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 49) {
            cr10_3.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        if(count == 40) {
            cr10_4.setFill(Color.PURPLE);
            InputSetter.add(3);
        }
        System.out.println(InputSetter);
    }
    public void fillPegR(){
        count++;
        System.out.println(count);
        if(count == 0){
            InputSetter.add(4);
            cr.setFill(Color.RED);
        }
        System.out.println(count);
        if (count == 1) {
            cr.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 2) {
            cr1_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 3) {
            cr1_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 4) {
            cr1_4.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 5) {
            cr2_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 6) {
            cr2_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 7) {
            cr2_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 8) {
            cr2_4.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 9) {
            cr3_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 10) {
            cr3_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 11) {
            cr3_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 12) {
            cr3_4.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 13) {
            cr4_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 14) {
            cr4_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 15) {
            cr4_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 16) {
            cr4_4.setFill(Color.RED);
            InputSetter.add(4);
        }

        if (count == 17) {
            cr5_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 18) {
            cr5_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 19) {
            cr5_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 20) {
            cr5_4.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 21) {
            cr6_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 22) {
            cr6_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 23) {
            cr6_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 24) {
            cr6_4.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 25) {
            cr7_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 26) {
            cr7_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 27) {
            cr7_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 28) {
            cr7_4.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 29) {
            cr8_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 30) {
            cr8_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 31) {
            cr8_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 32) {
            cr8_4.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 33) {
            cr9_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 34) {
            cr9_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 35) {
            cr9_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 36) {
            cr9_4.setFill(Color.RED);
            InputSetter.add(4);
        }

        if (count == 37) {
            cr10_1.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 38) {
            cr10_2.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 39) {
            cr10_3.setFill(Color.RED);
            InputSetter.add(4);
        }
        if (count == 40) {
            cr10_4.setFill(Color.RED);
            InputSetter.add(4);
        }
        System.out.println(InputSetter);
    }
    public void pegFillY() {
        count++;
        System.out.println(count);
        if(count == 0){
            InputSetter.add(5);
            cr.setFill(Color.YELLOW);
        }
        System.out.println(count);
        if(count == 1) {
            cr.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 2){
            cr1_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 3){
            cr1_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 4){
            cr1_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 5) {
            cr2_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 6) {
            cr2_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 7 ) {
            cr2_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 8) {
            cr2_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 9) {
            cr3_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 10) {
            cr3_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 11) {
            cr3_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 12) {
            cr3_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 13) {
            cr4_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 14) {
            cr4_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 15) {
            cr4_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 16) {
            cr4_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 17) {
            cr5_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 18) {
            cr5_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 19) {
            cr5_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 20) {
            cr5_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 21) {
            cr6_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 22) {
            cr6_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 23) {
            cr6_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 24) {
            cr6_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 25) {
            cr7_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 26) {
            cr7_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 27) {
            cr7_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 28) {
            cr7_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 29) {
            cr8_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 30) {
            cr8_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 31) {
            cr8_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 32) {
            cr8_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 33) {
            cr9_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 34) {
            cr9_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 35) {
            cr9_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 36) {
            cr9_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }

        if(count == 37) {
            cr10_1.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 38) {
            cr10_2.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 39) {
            cr10_3.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        if(count == 40) {
            cr10_4.setFill(Color.YELLOW);
            InputSetter.add(5);
        }
        System.out.println(InputSetter);
    }
    @FXML
    int orange;
    int blue;
    int green;
    int purple;
    int red;
    int yellow;
    ArrayList<Integer> InputSetter = new ArrayList<Integer>();
    CodeMaker solution = new CodeMaker();
    CodeClass solutionCode = solution.solutionGetter();
    int[] solutionParam = solutionCode.getPegs();
    int count = 0;
    int minGuess = 0;
    int maxGuess = 10;
    public Circle cr;
    public Circle cr1_2;
    public Circle cr1_3;
    public Circle cr1_4;
    public Circle cr2_1;
    public Circle cr2_2;
    public Circle cr2_3;
    public Circle cr2_4;
    public Circle cr3_1;
    public Circle cr3_2;
    public Circle cr3_3;
    public Circle cr3_4;
    public Circle cr4_1;
    public Circle cr4_2;
    public Circle cr4_3;
    public Circle cr4_4;
    public Circle cr5_1;
    public Circle cr5_2;
    public Circle cr5_3;
    public Circle cr5_4;
    public Circle cr6_1;
    public Circle cr6_2;
    public Circle cr6_3;
    public Circle cr6_4;
    public Circle cr7_1;
    public Circle cr7_2;
    public Circle cr7_3;
    public Circle cr7_4;
    public Circle cr8_1;
    public Circle cr8_2;
    public Circle cr8_3;
    public Circle cr8_4;
    public Circle cr9_1;
    public Circle cr9_2;
    public Circle cr9_3;
    public Circle cr9_4;
    public Circle cr10_1;
    public Circle cr10_2;
    public Circle cr10_3;
    public Circle cr10_4;
    public Button Choice_O;//O
    public Button Choice_B;//B
    public Button Choice_G;//G
    public Button Choice_P; //P
    public Button Choice_R;//R
    public Button Choice_Y;//Y
    public Button buttonGuesser;
    public Circle blackOrWhite1_1;
    public Circle blackOrWhite1_2;
    public Circle blackOrWhite1_3;
    public Circle blackOrWhite1_4;
    public Circle blackOrWhite2_1;
    public Circle blackOrWhite2_2;
    public Circle blackOrWhite2_3;
    public Circle blackOrWhite2_4;
    public Circle blackOrWhite3_1;
    public Circle blackOrWhite3_2;
    public Circle blackOrWhite3_3;
    public Circle blackOrWhite3_4;
    public Circle blackOrWhite4_1;
    public Circle blackOrWhite4_2;
    public Circle blackOrWhite4_3;
    public Circle blackOrWhite4_4;
    public Circle blackOrWhite5_1;
    public Circle blackOrWhite5_2;
    public Circle blackOrWhite5_3;
    public Circle blackOrWhite5_4;
    public Circle blackOrWhite6_1;
    public Circle blackOrWhite6_2;
    public Circle blackOrWhite6_3;
    public Circle blackOrWhite6_4;
    public Circle blackOrWhite7_1;
    public Circle blackOrWhite7_2;
    public Circle blackOrWhite7_3;
    public Circle blackOrWhite7_4;
    public Circle blackOrWhite8_1;
    public Circle blackOrWhite8_2;
    public Circle blackOrWhite8_3;
    public Circle blackOrWhite8_4;
    public Circle getBlackOrWhite9_1;
    public Circle getBlackOrWhite9_2;
    public Circle getBlackOrWhite9_3;
    public Circle getBlackOrWhite9_4;
    public Circle getBlackOrWhite10_1;
    public Circle getBlackOrWhite10_2;
    public Circle getBlackOrWhite10_3;
    public Circle getBlackOrWhite10_4;
    public TextField gameConsole;
}