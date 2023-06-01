package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * Class to implement a simple robot to model a random walker. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class RandomWalker {
    /**
     * Declare the constant variable THREE. 
     */
    public static final int THREE = 3; 
 
    /**
     * Declare the constant variable FOUR. 
     */
    public static final int FOUR = 4; 
    
    /**
     * Declare the instance variable current X.
     */
    private int currentX; 
    
    /**
     * Declare the instance variable current Y.
     */
    private int currentY; 
    
    /**
     * Declare the instance variable maxSteps.
     */
    private int maxSteps; 
    
    /**
     * Declare the instance variable currentSteps.
     */
    private int currentSteps;
    
    /**
     * Declare the instance variable boundary.
     */
    private int boundary;
    
    /**
     * Declare the instance variable maxDistance.
     */
    private int maxDistance; 
    
    /**
     * Declare the instance variable random.
     */
    private Random rand = new Random();
   
    /**
     * First verison of constructor that accpets two integers. 
     * @param maxSteps
     *          as an integer type. 
     * @param boundary
     *          as an integer type. 
     */
    public RandomWalker(int maxSteps, int boundary) {
        this.currentX = 0;
        this.currentY = 0;
        this.maxSteps = maxSteps;
        this.currentSteps = 0;
        this.boundary = boundary;
        this.maxDistance = 0;

    }

    /**
     * Second verison of constructor that accpets four integers. 
     * @param maxSteps
     *          as an integer type.
     * @param currentX
     *          as an integer type.
     * @param currentY
     *          as an integer type.
     * @param boundary
     *          as an integer type.
     */
    public RandomWalker(int maxSteps, int currentX, 
            int currentY, int boundary) {
        this.maxSteps = maxSteps; 
        this.boundary = boundary; 
        this.currentX = currentX; 
        this.currentY = currentY;
        this.currentSteps = 0; 
        this.maxDistance = 0;
        this.rand = new Random(); 
    }
    
    /**
     * toString that prints out the coordinates and the current step number. 
     * @return the coordinates and current step
     */
    public String toString() {
        return "Position: (" + currentX + ", " + currentY + ") "
                + "Steps taken: " + currentSteps;
    }
    
    /**
     * Method that simulate taking a single step. 
     */
    public void takeStep() {
        int direction = rand.nextInt(FOUR);
        switch (direction) {
            case 0: currentX++; break;
            case 1: currentX--; break;
            case 2: currentY++; break;
            case THREE: currentY--; break;
            default: break; 
        }
        currentSteps++;
        updateMaxDistance(); 
    }

    private void updateMaxDistance() {
        maxDistance = max(maxDistance, Math.abs(currentX) + Math.abs(currentY));
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
    
    /**
     * Method that returns true or false 
     * according to the size of currentSteps and maxSteps. 
     * @return  true if the number of steps taken 
     *          is less than the max number of steps
     */
    public boolean moreSteps() {
        return currentSteps < maxSteps;
    }
    
    /**
     * Mehod that returns true or false 
     * depend on the RandomWalker's current position. 
     * @return true if RandomWalker's current 
     *         coordinates are within its square boundary
     */
    public boolean inBounds() {
        return Math.abs(currentX) <= boundary && Math.abs(currentY) <= boundary;
    }
    
    /**
     * Method that returns maximum distance. 
     * @return the maxDistance
     */
    public int getMaximumDistance() {
        return maxDistance;
    }
    
    /**
     * Method that accpets no parameters and returns nothing. 
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    /**
     * Create accessor for currentX. 
     * @return currentX
     */
    public int getCurrentX() {
        return currentX;
    }
    
    /**
     * Create accessor for cuurentY. 
     * @return currentY
     */
    public int getCurrentY() {
        return currentY;
    }
    
   
}

