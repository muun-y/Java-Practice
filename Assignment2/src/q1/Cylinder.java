package q1; 

public class Cylinder {
    private double radius;
    private double height; 
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height; 
         
    }
     
    public double getRadius() {
        return radius; 
    }
    
    public void setRadius(double radius) {
        this.radius = radius; 
    }
    
    public double getHeight() {
        return height; 
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double volume() {
        return  Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double surfaceArea() {
        return 2 * Math.PI * radius *(radius +height);       
    }
    
    public String toString() {
        return "Cylinder with radius " + radius 
                + " and height " + height; 
    }

}
