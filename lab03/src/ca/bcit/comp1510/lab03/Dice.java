package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * COMP1510 Programming methods.  
 * @author Munyoung cho
 * @version 2022
 */

public class Dice {
    /**
     * Simulating Dice. 
     * @param args unused
     */

    public static void main(String[] args) {
        //1. Generate a random number between 1 and the max value
        Random number = new Random();
        int dieof4Side = number.nextInt(4) + 1;
        int dieof6Side = number.nextInt(6) + 1;
        int dieof8Side = number.nextInt(8) + 1;
        int dieof10Side = number.nextInt(10) + 1;
        int dieof12Side = number.nextInt(12) + 1;
        int dieof20Side = number.nextInt(20) + 1;
        
        //2. Printout the result 
        System.out.println("4-sided die: " + dieof4Side);
        System.out.println("6-sided die: " + dieof6Side);
        System.out.println("8-sided die: " + dieof8Side);
        System.out.println("10-sided die: " + dieof10Side);
        System.out.println("12-sided die: " + dieof12Side);
        System.out.println("20-sided die: " + dieof20Side);
        System.out.println("Total is " 
                + (dieof4Side + dieof6Side + dieof8Side 
                + dieof10Side + dieof12Side + dieof20Side) 
                + ".");
       
    }

}
