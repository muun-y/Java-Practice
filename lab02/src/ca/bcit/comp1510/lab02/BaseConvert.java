package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Base Convert. 
 * 
 * @author Munyoung cho
 * @version 2022
 */

public class BaseConvert {
    /**
     * Drives the program.  
     * @param args unused
     */

    public static void main(String[] args) {
        
        int base10number; 
        int base; 
        int maximumNumber = 0;
        int place0;
        int place1;
        int place2;
        int place3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Base Conversion Program");
        System.out.print("Please enter a base (2-9): ");
        
        base = scan.nextInt();
        maximumNumber = (int) Math.pow(base, 4) - 1; 
        
        System.out.println("The max base 10 number to convert for the base is" 
                    + maximumNumber);
        System.out.println("Please enter a base 10 nummber to convert: ");
        
        base10number = scan.nextInt(); 
        
        //Do the conversion
        place0 = base10number % base; 
        int placea = place0; 
        
        place1 = (base10number / base) % base; 
        int placeb = place1; 
        
        place2 = ((base10number / base) / base) % base; 
        int placec = place2; 
       
        place3 = (((base10number / base) / base) / base) % base; 
        int placed = place3; 
        
        String baseBNumber = new String(" " + placea + placeb 
                + placec + placed); 
        System.out.println(baseBNumber);
        
        scan.close();
       
    }

}
