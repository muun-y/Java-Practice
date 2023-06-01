package ca.bcit.comp1510.lab05;

/**
 * COMP1510 Programming methods. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class Mathematics {
    
    /**
      * Constant variable PI. 
      */
    public static final double PI = Math.PI;
    
    /**
    * Returns the area of the circle with the specified radius.
    *
    * @param radius
    *        of the circle.
    * @return area as a double
    */
    public double getCircleArea(double radius) {
        return radius * radius * PI;
    }
    
    /**
    * Returns the sum of the positive integers between 0 and the specified
    * number inclusive. If the specified number is negative, returns zero.
    *
    * @param number
    *        upper bound
    * @return sum as an integer
    */
    public int sumOfInts(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result = result + i; 
        }
        return result;
    }

    /**
    * Returns true if the specified value is positive, else false.
    *
    * @param number
    *         to test
    * @return true if number is positive, else false.
    */
    public boolean isPositive(int number) {
        boolean result = false; 
        if (number > 0) {
            result = true; 
        } 
        return result;
    }

    /**
    * Returns true if the specified value is even, else false.
    *
    * @param number
    *         to test
    * @return true if number is even, else false.
    */
    public boolean isEven(int number) {
        boolean result = false; 
        if (number % 2 == 0) {
            result = true; 
        }
            
        return result;
    }
    
    /**
    * Returns sum of the even numbers between 0 and the specified value,
    * inclusive. The value can be positive, negative, or zero.
    *
    * @param number
    *        upper bound
    * @return sum of the even numbers between 0 and number
    */
    public int sumOfEvens(int number) {
        int result = 0;
        if (number > 0) {
            for (int i = 0; i <= number; i += 2) {
                result = result + i; 
            }
        } else {
            for (int i = number; i <= 0; i += 2) {
                result = result + i; 
            }
        }

        return result;
    }

}
