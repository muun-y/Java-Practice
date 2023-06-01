package ca.bcit.comp1510.lab05;

/**
 * COMP1510 Programming methods.  
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class Cone {
    /**
     * Instance variable radius. 
     */
    private double radius; 
    
    /**
     * Instance variable height. 
     */
    private double height;
    
    //create constructor
    /**
     * Create constructor. 
     * @param radius
     * 
     * @param height
     * 
     */
    public Cone(double radius, double height) {
        
    }
    
    //accessor and mutator
    /**
     * Return the radius. 
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Set the radius. 
     * @param radius
     * 
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Return the height. 
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set the height.
     * @param height
     * 
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    //create volume method
    /**
     * Return the volume of the cone.  
     * @return the volume
     */
    public double volume() {
        final double coefficient = 1.0 / 3.0; 
        final int power = 2; 
        return coefficient * Math.PI * Math.pow(radius, power) * height; 
    }
    
    //create slant height method
    /**
     * Return the Slant Height of the cone. 
     * @return the Slant Height.
     */
    public double slantHeight() {
        final int power = 2; 
        return Math.sqrt(Math.pow(radius, power) + (Math.pow(height, power))); 

    }
    
    //create surfaceArea method
    /**
     * Return the surface area of the cone.
     * @return the surface area
     */
    public double surfaceArea() {
        final int power = 2; 
        return Math.PI * Math.pow(radius, power) + Math.PI * radius 
                * (Math.sqrt(Math.pow(radius, power) 
                        + (Math.pow(height, power)))); 
    }
    
    //create String method
    /**
     * Return the String method composed of information in the Cone. 
     * @return the String method
     */
    public String toString() {
        return "radius: " + radius + "\n" 
                + "heigth: " + height + "\n"; 
                
    }
}
