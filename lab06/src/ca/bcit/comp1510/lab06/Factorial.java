package ca.bcit.comp1510.lab06;

import java.util.Scanner;
/**
 * COMP1510 Programming methods.
 * 
 * @author Munyoung cho
 * @version 2022
 */

public class Factorial {
    
    /**
  *  method for non-negative integer.  
  * @param scan n
  * @return int value
  */
    public static int readInt(Scanner scan) {
        int n;
        do {
            while (!scan.hasNextInt()) {
                scan = new Scanner(System.in);
                System.out.println("A number is required! "
                        + "Please enter non-negative integer");
            }
            n = scan.nextInt();
            if (n < 0) {
                System.out.println("A non-negative integer is required! "
                        + "Please re-enter non-negative value for factorial.");
            }
        } while (n < 0);
        return n;
    }
    /**
     * Drives a Factorial program. 
     * @param args unused
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter non-negative integer for factorial!");
        int factorial = 1; 
        int n = readInt(scan);
        int inputN = n; 
        
        while (inputN > 0) {
            factorial *= inputN; 
            inputN--;
        }
        
        System.out.println("The factoiral of " 
            + n + " (written" + n + "!)is " + factorial + ".");
            
       
    }
    
        
}

