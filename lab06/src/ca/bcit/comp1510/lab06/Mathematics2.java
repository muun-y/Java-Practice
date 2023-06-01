package ca.bcit.comp1510.lab06;

/**
 * COMP1510 Programming methods_Mathematics2.
 * 
 * @author Munyoung cho
 * @version 2023
 */

public class Mathematics2 {
    
    /** Constant for foot to kilometers ratio. */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /** Constant for KILO. */
    public static final double KILO = 3280.84; 
    
    /** Constant for TEN. */
    public static final int TEN = 10; 
    
    /** Constant for ELEVEN. */
    public static final int ELEVEN = 11; 
    
    /** Constant for FIFTEEN. */
    public static final int FIFTEEN = 15; 
   
    /**
     * Returns the square area with the edgelength. 
     * @param edgeLength
     *      of the square. 
     * @return Square area as a double
     */
    public double getSquareArea(double edgeLength) {
        return edgeLength * edgeLength; 
    }
    
    /**
     * Return the sum of two values. 
     * @param first
     *        operand
     * @param second
     *        operand
     * @return sums of operands. 
     */

    public double add(double first, double second) {
        return first + second;
    }
    
    /**
    * Returns the product of the specified values.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return product of the operands
    */
    
    public double multiply(double first, double second) {
        return first * second;
    }

    /**
    * Returns the difference of the specified values.
    *
    * @param first
    *        operand
    * @param second
    *        operand
    * @return difference of the operands
    */
    public double subtract(double first, double second) {
        double resultOfSubtract = first - second; 
        return resultOfSubtract;
    }
    
    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param first
    *        operand
    * @param second
    *        operand
    * @return quotient of the operands
    */
    public double divide(double first, double second) {
        if (second == 0) {
            return 0.0; 
        } else {
            return first / second; 
        }
    }

    /**
     * Returns the absolute value of the specified integer.
     * @param number
     *        to test
     * @return absolute value of number
     */
    public int absoluteValue(int number) {
        return Math.abs(number);
    }
    
    /**
    * Converts the specified number of feet to kilometres.
    * @param feet to convert
    * @return kilometres in the specified number of feet
    */
    public double convertFeetToKilometres(double feet) {
        return  feet / KILO;
    }
    
    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. 
    * @param bound the upper bound
    * @param divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        if (bound > 0) {
            for (int i = 0; i <= bound; i++) {
                if (i % divisor == 0) {
                    sum += i; 
                }
            }
        } else {
            for (int i = 0; i >= bound; i--) {
                if (i % divisor == 0) {
                    sum += i; 
                } 
            }
        }
        return sum; 
    }
    
    /**
     * Returns a random number between 10 and 20 inclusive,
     * but NOT 15.
     * @return random number in range [10, 20] excluding 15.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * ELEVEN) + TEN;
        } while (randomNumber == FIFTEEN);
        return randomNumber;
    }

}


