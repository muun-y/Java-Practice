package ca.bcit.comp1510.lab05;

/**
 * COMP1510 Programming methods. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class Cube {
    /**
     * instance variable X-coordinate.
     */
    private double coordinateX; 
    
    /**
     * instance variable Y-coordinate.
     */
    private double coordinateY; 
    
    /**
     * instance variable Z-coordinate.
     */
    private double coordinateZ;
    
    /**
     * instance variable Edge length. 
     */
    private double edgelength; 
    
    //constructor
    /**
     * constructors parameter. 
     * @param coordinateX
     * 
     * @param coordinateY
     * 
     * @param coordinateZ
     * 
     * @param edgelength
     * 
     */
    public Cube(double coordinateX, double coordinateY, 
            double coordinateZ, double edgelength) {
        this.setCoordinateX(coordinateX);
        this.setCoordinateY(coordinateY);
        this.setCoordinateZ(coordinateZ); 
        this.setEdgelength(edgelength); 
    }
    //accessor and mutator
    
    /**
     * Returns the X coordinate of cube as a double.  
     * @return the coordinateX
     */
    public double getCoordinateX() {
        return coordinateX;
    }
    
    /**
     * Set coordinateX.
     * @param coordinateX
     * 
     */
    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }
    
    /**
     * Returns the Y coordinate of cube as a double.
     * @return the coordinateY
     */
    public double getCoordinateY() {
        return coordinateY;
    }
    
    /**
     * Set coordinateY.
     * @param coordinateY
     * 
     */
    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
    
    /**
     * Returns the Z coordinate of cube as a double.
     * @return the coordinateZ
     */
    public double getCoordinateZ() {
        return coordinateZ;
    }
    
    /**
     * Set coordinateZ.
     * @param coordinateZ
     * 
     */
    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }
    
    /**
     * Returns the edge length of cube as a double.
     * @return the edgelength
     */
    public double getEdgelength() {
        return edgelength;
    }

    /**
     * Set edgelength.
     * @param edgelength
     * 
     */
    public void setEdgelength(double edgelength) {
        this.edgelength = edgelength;
    }
    
    //String method
    
    /**
     * Returns a String representation of the cube.
     * @return a String representation of the cube.
     */
    public String toString() {
        return "X-coordinate: " + coordinateX + "\n"
                + "Y-coordinate: " + coordinateY + "\n"
                + "Z-coordinate: " + coordinateZ + "\n"
                + "Edge Length: " + edgelength + "\n";       
    }
    
    //create surfaceArea method
    /**
    * Returns the surface area of the cube.
    * @return the surface area
    */
    public double surfaceArea() {
        final double coefficient = 6.0;
        final int power = 2; 
        return coefficient * Math.pow(edgelength, power);
    }
    
    //create volume method
    /**
     * Returns the volume of the cube.
     * @return the volume
     */
    public double volume() {
        final int power = 3; 
        return Math.pow(edgelength, power); 
    }
    
    //create face diagonal method
    /**
     * Returns the face diagonal of the cube.
     * @return the face diagonal
     */
    public double faceDiagonal() {
        return Math.sqrt(2) * edgelength; 
    }
    
    //create space diagonal method
    /**
     * Returns the space diagonal of the cube.
     * @return the space diagonal
     */
    public double spaceDiagonal() {
        final int three = 3; 
        return Math.sqrt(three) * edgelength; 
    }
   
}
