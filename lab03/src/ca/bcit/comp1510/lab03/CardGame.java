package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * COMP1510 Programming Methods. 
 * @author Munyoung cho
 * @version 2022
 */

public class CardGame {
    
    /** 
     * Rank enumeration.
     */
 
    enum Rank {
      
            /** Ace. */
            ACE,
            /** Two. */
            TWO,
            /** Three. */
            THREE,
            /** Four. */
            FOUR,
            /** Five. */
            FIVE,
            /** Six. */
            SIX, 
            /** Seven. */
            SEVEN,
            /** Eight. */
            EIGHT,
            /** Nine. */
            NINE,
            /** Ten. */
            TEN,
            /** Jack. */
            JACK,
            /** Queen. */
            QUEEN,
            /** King. */
            KING
            
    }
    /** 
    * Suit Enumeration.
    */
    
    enum Suit { 
            /** Hearts. */
            HEARTS,
            /** Diamonds. */
            DIAMONDS,
            /** Clubs. */
            CLUBS,
            /** Spades. */
            SPADES 
    }
        
    /**
    * Add to the main methods. 
    * @param args unused.
    */
            
    public static void main(String[] args) {
        Random generator = new Random();
        int randomRankChoice = generator.nextInt(Rank.values().length);
        int randomSuitChoice = generator.nextInt(Suit.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        Suit randomSuit = Suit.values()[randomSuitChoice];
        System.out.println("The card is " 
               + randomSuit + " " + randomRank + ".");

    }

}
