package q1;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Munyoung Cho
 * @version 1.0
 */
public class Multi {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //create two Cylinder object
        Cylinder c1 = new Cylinder(2,5); 
        Cylinder c2 = new Cylinder(3,4); 
        
        //Print the initial state of two cylinders
        System.out.println("Cylinder 1: " +  c1);
        System.out.println("Cylinder 2: " + c2);
        
        //update the value 
        c1.setRadius(4); 
        c1.setHeight(3); 
        c2.setRadius(5); 
        c2.setRadius(7); 
        
        //Print the final state of the cylinders
        System.out.println("Cylinder 1 after update: " + c1);
        System.out.println("Cylinder 2 after update: " + c2);
        
        //Print the volume and surface area of two cylinders
        System.out.println("Cylinder 1 volume: " + c1.volume());
        System.out.println("Cylinder 1 surface area: " + c1.surfaceArea());
        System.out.println("Cylinder 2 volume: " + c2.volume());
        System.out.println("Cylinder 2 surface area: " + c2.surfaceArea());
    }

}
