package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Create a driver class which contains main method. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class TestWalker {
    
    /**
     * Declare the constant variable FIVE. 
     */
    public static final int FIVE = 5; 
    
    /**
     * Declare the constant variable TWOHUND. 
     */
    public static final int TWOHUND = 200; 
    
    /**
     * Declare the constant variable TEN. 
     */
    public static final int TEN = 10;  
    
    /**
     * Main method that drives the program. 
     * @param args unused
     */
    public static void main(String[] args) {
        RandomWalker walker1 = new RandomWalker(TEN, FIVE);
        System.out.println(walker1);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum steps: ");
        int maxSteps = scanner.nextInt();
        System.out.print("Enter boundary size: ");
        int boundary = scanner.nextInt();
        scanner.close();
        
        RandomWalker walker2 = new RandomWalker(maxSteps, boundary);
        System.out.println(walker2.toString());
        
        for (int i = 1; i <= FIVE; i++) {
            walker1.takeStep();
            System.out.println(walker1.toString());
        }
        
        for (int i = 1; i <= FIVE; i++) {
            walker2.takeStep();
            System.out.println(walker2.toString());
        }
        
        RandomWalker walker3 = new RandomWalker(TWOHUND, 0, 0, TEN);
        System.out.println(walker3.toString());
        walker3.walk();
        System.out.println(walker3.toString());
        System.out.println("Maximum distance from origin: " 
            + walker3.getMaximumDistance());
    }
}


