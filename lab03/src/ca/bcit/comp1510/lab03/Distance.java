package ca.bcit.comp1510.lab03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * COMP1510 Programming methods. 
 * @author Munyoung cho
 * @version 2022
 */

public class Distance {
    /**
     * Calculating the distance between two points. 
     * @param args unused 
     */
    public static void main(String[] args) {
        //4. Use  a Scanner object to ask the user for the points 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter x and y value "
                + "of the first point seperating by space: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Please enter x and y value "
                + "of the second point seperating by space: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        //5. Calculating the distance between two points
        double distance = 
                Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("The distance between these two point is "
                + distance + ".");
        
        //7. It works for points in all 4 quadrants. 
        
        DecimalFormat dF = new DecimalFormat("#.##");
        String formatedResult = dF.format(distance);
        System.out.println("The formated distance is " + formatedResult + ".");
        
        //8. 
        // i) Yes, it print out '0' when it is small value. 
        
        
        scan.close(); 
    }

}
