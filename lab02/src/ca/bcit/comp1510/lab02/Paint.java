package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * COMP1510 Programming Methods.
 * 
 * @author Munyoung cho
 * @version 2023
 */

public class Paint {
    /**
     * paint the room. 
     * @param args unused
     */
    static final double COVERAGE = 400;
    /**
     * constant declare. 
     * @param args unused
     */

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); 
        double length;
        length = myScanner.nextDouble();
        double width;
        width = myScanner.nextDouble();
        double height;
        height = myScanner.nextDouble();
        double coats;
        coats = myScanner.nextDouble();
        
        
        double surfaceArea = 2 * (width * height + length * height) 
                + length * width; 
        double coverageNeeded = surfaceArea * coats; 
        double cansOfPaintNeeded = coverageNeeded / COVERAGE; 
        System.out.println("How many cans they need to buy: " 
                + cansOfPaintNeeded);
       
        myScanner.close();
       

    }

}
