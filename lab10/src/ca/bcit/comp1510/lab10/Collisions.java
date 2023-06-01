package ca.bcit.comp1510.lab10;

/**
 * Create a Collisions program. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class Collisions {
    
    /**
     * Declare the constant variable TENM. 
     */
    public static final int TENM = 100000; 
    
    /**
     * Declare the constant variable MINUS_THREE. 
     */
    public static final int MINUS_THREE = -3; 
    
    /**
     * Declare the constant variable THREE. 
     */
    public static final int THREE = 3; 
    
    /**
     * Declare the constant variable TWOHUNDM. 
     */
    public static final int TWOHUNDM = 2000000; 
    
    
    /**
     * Main method to drive the class. 
     * @param args unused
     */
    public static void main(String[] args) {
        RandomWalker walker1 = new RandomWalker(TENM, MINUS_THREE, 0, TWOHUNDM);
        RandomWalker walker2 = new RandomWalker(TENM, THREE, 0, TWOHUNDM);
        
        int collisions = 0;
        
        for (int i = 0; i < TENM; i++) {
            walker1.takeStep();
            walker2.takeStep();
            
            if (walker1.getCurrentX() == walker2.getCurrentX() 
                    && walker1.getCurrentY() == walker2.getCurrentY()) {
                collisions++;
            }
        }
        
        System.out.println("Number of collisions: " + collisions);
    }
    
    /**
     * Method that returns true when two RandomWalker objects 
     * passed as parameters are in the same position;. 
     * @param one
     *  
     * @param two
     *  
     * @return the true when two objects are in same position
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        return (one.getCurrentX() == two.getCurrentX()) 
                && (one.getCurrentY() == two.getCurrentY());
    }
}
