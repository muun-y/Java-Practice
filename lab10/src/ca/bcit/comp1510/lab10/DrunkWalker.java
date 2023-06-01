package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * DrunkWalker program that simulates a drunken walker. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class DrunkWalker {
    
    /**
     * Main method to drive the DrunkWalker program. 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the boundary size: ");
        int boundary = scanner.nextInt();

        System.out.print("Enter the number of steps: ");
        int maxSteps = scanner.nextInt();

        System.out.print("Enter the number of drunks to simulate: ");
        int numDrunks = scanner.nextInt();

        scanner.close();

        int numFalls = 0;

        for (int i = 0; i < numDrunks; i++) {
            RandomWalker drunk = new RandomWalker(maxSteps, 0, 0, boundary);

            while (drunk.moreSteps() && drunk.inBounds()) {
                drunk.takeStep();
            }

            if (!drunk.inBounds()) {
                numFalls++;
            }
        }

        System.out.printf("Number of tests: %d%n", numDrunks);
        System.out.printf("Number of falls: %d%n", numFalls);
    }

}


