package ca.bcit.comp1510.lab04;

/**
 * Represents one die (singular of dice) with faces showing values between 1 and
 * 6.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Munyoung Cho
 * @version 2022
 */

public class MultiDie {
    /** Maximum face value. */
    public final int max;
    

    /** Current value showing on the die. */
    private int faceValue;
   
    /**
     * numsides. 
     * @param numSides
     *        into a max
     */
    public MultiDie(int numSides) {
        max = numSides; 
        faceValue = roll();
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max
                ) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
        
        //1. No, there is no need for getter and setter for max.
        //2. I can have getters and setter for max. 
        //3. It doesn't make sense because max is keep changing 
        //        through roll method. 
        //4. max's being final says that the abstraction of a  Multidie object
        //is that represents a physical die that has a fixed number of sides.
        //5. Yes, max is an instance variable. 

         
    }
}

