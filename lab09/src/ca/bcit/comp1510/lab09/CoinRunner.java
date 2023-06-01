package ca.bcit.comp1510.lab09;

/**
 * Create a program that includes for loop to flip the coin 100 times. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class CoinRunner {
    /**
     * Declare the constant variable TEN. 
     */
    public static final int TEN = 10; 
    
    /**
     * Main method to run the coin.java. 
     * @param args unused
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        int longestRun = 0;
        int currentRun = 0;
        int previousFace = -1;

        for (int i = 0; i < TEN; i++) {
            coin.flip();

            if (coin.isHeads()) {
                currentRun++;
                if (previousFace != Coin.HEADS) {
                    currentRun = 1;
                }
            } else {
                if (currentRun > longestRun) {
                    longestRun = currentRun;
                }
                currentRun = 0;
            }

            previousFace = Coin.HEADS;
            System.out.println(coin);
        }

        if (currentRun > longestRun) {
            longestRun = currentRun;
        }

        System.out.println("The longest run of heads is " + longestRun);
    }

}


