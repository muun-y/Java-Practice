package q2;

import java.util.Scanner;

/**
 * Application that calculates an approximation to the square root
 * and prints the result.  
 *
 * @author Munyoung Cho
 * @version 1.0
 */

public class Sqrt {
    /**
     * This is the main method that runs the code. 
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        // prompt and scan 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the amount: ");
        double a = scan.nextDouble(); 
        
        //estimates1 
        double s = (double) ((a + 1) / 2); 
        System.out.println("the result of s is " + s);
       
        //estimates2
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //estimates3
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //estimates4
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //estimates5
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //estimates6
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //estimates7 
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //estimates8
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //estimates9 
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //estimates10
        s = (double) (s + a / s) / 2; 
        System.out.println("the result of s is " + s);
        
        //close scan object
        scan.close(); 
        
    }

}
