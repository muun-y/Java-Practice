package ca.bcit.comp1510.lab11;

/**
 * Driver class for Coin. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class CoinDriver {
    
    /**
     * Create main method to drive the program. 
     * @param args unused
     */
    public static void main(String[] args) {
        final int key = 1234; 
        Coin c = new Coin();
        c.setKey(key);
        c.lock(key);

        // Try to flip a locked coin
        c.flip();

        // Print coin status
        System.out.println("Coin is locked: " + c.locked());
        System.out.println("Coin face: " + c.toString());

        // Unlock coin
        c.unlock(key);

        // Flip unlocked coin
        c.flip();

        // Print coin status
        System.out.println("Coin is locked: " + c.locked());
        System.out.println("Coin face: " + c.toString());
    }

}


