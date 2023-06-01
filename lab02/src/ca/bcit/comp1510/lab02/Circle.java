package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * COMP1510 Programming methods Lab02.
 * @author Munyoung cho
 * @version 2023
 */

public class Circle {
    /**
     * constant declare. 
     */
    static final double PI = 3.14159;
    
    /**
     * Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        double radius; 
        
        Scanner myScanner = new Scanner(System.in); 
        radius = myScanner.nextDouble();
        double circumference = 2 * PI * radius; 
        System.out.println(circumference);
        double area = PI * radius * radius;
        System.out.println(area);
      
        myScanner.close();
       
    }

}
