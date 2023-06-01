package ca.bcit.comp1510.lab05;

/**
 * COMP1510 Programming methods. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class Sphere {
    /**
    * Instance variable coordinateX. 
    */
    private double coordinateX;
    /**
     * Instance variable coordinateY. 
     */
    
    private double coordinateY;
    /**
     * Instance variable coordinateZ. 
     */
    
    private double coordinateZ;
    /**
     * Instance variable radius. 
     */
    
    private double radius;
    
    //Coordinator
    /**
     * Constuctors parameters.
     * @param coordinateX
     *          a double for X coordinate
     * @param coordinateY
     *          a double for Y coordinate
     * @param coordinateZ
     *          a double for Z coordinate
     * @param radius
     *          a double for radius
     */
    public Sphere(double coordinateX, double coordinateY, 
            double coordinateZ, double radius) {
        this.coordinateX = coordinateX; 
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.radius = radius; 
    }
    
    //accessor and mutator
    /**
     * Returns the x coordinate of sphere as a double. 
     * @return coordinateX
     */
    public double getCoordinateX() {
        return coordinateX;
    }
    
    /**
     * set the x coordinate of sphere as a double. 
     * @param coordinateX
     *          set coordinate
     */
    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }
    
    /**
     * Returns the Y coordinate of sphere as a double. 
     * @return coordinateY
     */
    public double getCoordinateY() {
        return coordinateY;
    }
    
    /**
     * set the Y coordinate of sphere as a double. 
     * @param coordinateY
     *          set coordinateY
     */
    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
    
    /**
     * Return the z coordinate of sphere as a double. 
     * @return z coordinate
     */
    public double getCoordinateZ() {
        return coordinateZ;
    }
    
    /**
     * set the Z coordinate of sphere as a double. 
     * @param coordinateZ
     * 
     */
    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }
    
    /**
     * return the radius of sphere as a double. 
     * @return the radius 
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * set the radius of sphere as a double. 
     * @param radius
     * 
     */
    public void setRadius(double radius) {
        this.radius = radius;
    } 
    
    //create surfaceArea method
    /**
     * Returns the surface area of the sphere. 
     * @return the surface area
     */
    public double surfaceArea() {
        final double coefficient = 4.0; 
        final int power = 2; 
        return coefficient * Math.PI * Math.pow(radius, power); 
    }
    
    //create volume method
    /**
     * Returns the volume of the sphere.
     * @return the volume
     */
    public double volume() {
        final double coefficient = 3.0 / 4.0;
        final int power = 3; 
        return coefficient * Math.PI * Math.pow(coefficient, power);
    }
    
    /**
     * Returns a String representation of this sphere. 
     * @return toString description containing 3 coordinates and radius. 
     */
    public String toString() {
        return "X-coordinate: " + coordinateX + "\n"
                + "Y-coordinate: " + coordinateY + "\n"
                + "Z-coordinate: " + coordinateZ + "\n"
                + "Radius: " + radius
                + "SurfaceArea: " + volume();
                
    }
    
   
    

}
