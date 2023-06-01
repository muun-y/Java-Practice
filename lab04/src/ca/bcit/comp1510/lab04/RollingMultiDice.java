package ca.bcit.comp1510.lab04;

/**
 * Test the creation and use of a user-defined class.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Munyoung Cho 
 * @version 2017
 */
public class RollingMultiDice {
    /**
     * Driver program creates two Die objects and rolls them.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {

        MultiDie die1;
        MultiDie die2;
        int sum;
        
        final int six = 6; 
        final int five = 5; 
        die1 = new MultiDie(six);
        die2 = new MultiDie(five);
        System.out.println("1 Die One: " + die1 + ", Die Two: " + die2);
        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        die1.roll();
        die2.setFaceValue(five);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

          
        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
        System.out.println(die1);
    }
}

