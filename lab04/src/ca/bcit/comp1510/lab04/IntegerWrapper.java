package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * COMP1510 Programming methods.
 * 
 * @author Munyoung cho
 * @version 2022
 */

public class IntegerWrapper {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        //3. print the binary, octal, hexadecimal
        Scanner scan = new Scanner(System.in); 
        System.out.println("Please enter a integer number.");
        Integer original = scan.nextInt(); 
        System.out.println("The number you enter is " + original + " .");
        System.out.println("The original number converts to base 2 is " 
                + Integer.toBinaryString(original));
        System.out.println("The original number converts to base 8 is "
                + Integer.toOctalString(original));
        System.out.println("The original number converts to base 16 is " 
                + Integer.toHexString(original));
        
        //4. print the maximum and minimum \
        System.out.println("The maximum possible Java integer values is "
                + Integer.MAX_VALUE);
        System.out.println("The minimum possible Java integer values is "
                + Integer.MIN_VALUE);
        
        //5.convert strings to int
        System.out.println("Please enter two integer, one per line.");
        String number1 = scan.next();
        String number2 = scan.next(); 
        System.out.println("The sum of these two integer is " 
                + (Integer.parseInt(number1)) + Integer.parseInt(number2));
        
        scan.close();
  
    }

}
