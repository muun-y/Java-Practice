package q3;

import java.util.Scanner; 
/**
 * Calculate the discount in percentage. 
 *
 * @author Munyoung Cho
 * @version 1.0
 */

public class DiscountCalculator {

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //prompt and scan number of cheese purchased
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the number of cheeses purchased: ");
        double numberofCheeses = scan.nextDouble(); 
        
        //prompt and scan the number of new customers
        System.out.println("Enter the number of new customers: ");
        int referrals = scan.nextInt(); 
        
        final int seventyfive = 75; 
        double discount = (double) 
                (Math.min((numberofCheeses + referrals), seventyfive)); 
        System.out.println("The discount is " + discount + "% .");
        
        //close the scan object
        scan.close();
       
    }

}
