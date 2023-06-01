package q1;

import java.util.Scanner;

/**
 * Calculate the monetary amount.
 *
 * @author Munyoung Cho
 * @version 1.0
 */
public class Change {
    /**
     * This is the main method that runs the code. 
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //prompt and scan
        Scanner scan = new Scanner(System.in); 
        System.out.println("Please enter the amount: ");     
        double amount = scan.nextDouble(); 
        
        //change to cents
        final int convertocents = 100; 
        int amount100 = (int) (amount * convertocents); 
        
        //ten dollar bills
        final int tendollar = 1000; 
        System.out.println((amount100 / tendollar) + " ten dollar bills");
        amount100 = amount100 % tendollar;
        
        //fivedollarbills
        final int fivedollar = 500; 
        System.out.println((amount100 / fivedollar) + " five dollar bills");
        amount100 = amount100 % fivedollar;
        
        //toonies
        final int toony = 200;
        System.out.println((amount100 / toony) + " toonies");
        amount100 = amount100 % toony;
        
        //loonies
        final int loony = 100; 
        System.out.println((amount100 / loony) + " loonies");
        amount100 = amount100 % loony;
        
        //quarters
        final int quarter = 25; 
        System.out.println((amount100 / quarter) + " quarters");
        amount100 = amount100 % quarter;
        
        //dimes
        final int dime = 10; 
        System.out.println((amount100 / dime) + " dimes");
        amount100 = amount100 % dime;
        
        //nickles
        final int nickle = 5; 
        System.out.println((amount100 / nickle) + " nickles");
        amount100 = amount100 % nickle;
        
        //penny
        final int penny = 1; 
        System.out.println((amount100 / penny) + " pennies");
        amount100 = amount100 % penny;
        
        //close scan object. 
        scan.close();
        
    }

}
