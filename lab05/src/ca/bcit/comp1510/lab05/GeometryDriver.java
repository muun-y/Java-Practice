package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * COMP1510 Programming methods. 
 * 
 * @author Munyoung cho
 * @version 2022
 */

public class GeometryDriver {
    /**
     * drives the program. 
     * @param args
     * 
     */
    public static void main(String[] args) {
        //use a deciamlformat
        DecimalFormat df = new DecimalFormat("###.###");
        
        //prompt the user to enter the radius and coordinates. 
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Enter the radius: "); 
        double radius = scan.nextDouble();
        
        System.out.println("Enter the X-coordinate: "); 
        double coordinateX = scan.nextDouble(); 
        
        System.out.println("Enter the Y-coordinate: "); 
        double coordinateY = scan.nextDouble(); 
        
        System.out.println("Enter the Z-coordinate: "); 
        double coordinateZ = scan.nextDouble();
     
        
        //create Sphere object
        Sphere sphere = new Sphere(radius, coordinateX, 
                coordinateY, coordinateZ); 
        System.out.println("Volume and Surface Area are " 
                + df.format(sphere.volume()) + "and" 
                + df.format(sphere.surfaceArea()) + ".");
        
        //prompt the edge length and centre coordinates
        System.out.println("Enter the edge length: "); 
        double edgelength = scan.nextDouble();
        
        System.out.println("Enter the X-coordinate: "); 
        coordinateX = scan.nextDouble(); 
        
        System.out.println("Enter the Y-coordinate: "); 
        coordinateY = scan.nextDouble(); 
        
        System.out.println("Enter the Z-coordinate: "); 
        coordinateZ = scan.nextDouble();
        
        //create Cube object
        Cube cube = new Cube(edgelength, coordinateX, 
                coordinateY, coordinateZ); 
        System.out.println("Suface Area and Volume are" 
                + df.format(cube.surfaceArea()) 
                + df.format(cube.volume()) 
                + "\nFacediagonal and Spacediagonal are " 
                + df.format(cube.faceDiagonal()) + "and" 
                + df.format(cube.spaceDiagonal()) + ".");
        
        //prompt the radius and height for a right circular cone
        System.out.println("Enter the raidus: ");
        radius = scan.nextDouble(); 
        System.out.println("Enter the height: ");
        double height = scan.nextDouble(); 
        
        //create Cone object
        Cone cone = new Cone(radius, height); 
        System.out.println("Volume is " + df.format(cone.volume()) + ".");
        System.out.println("Slant height is " 
               + df.format(cone.slantHeight())
               + "\nSurface Area is " 
               + df.format(cone.surfaceArea()) + ".");
        scan.close();
    }

}
