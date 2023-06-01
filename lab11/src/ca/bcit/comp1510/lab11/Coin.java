package ca.bcit.comp1510.lab11;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Munyoung Cho 
 * @version 2023
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;

    /** The key used to lock and unlock this coin. */
    private int key;

    /** Flag indicating whether this coin is locked or not. */
    private boolean locked;
    
    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip(); 
        locked = false;
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (!locked) {
            face = (int) (Math.random() * 2);
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        
        return faceName;
    }
    
    /**
     * Sets the key used to lock and unlock this coin.
     * @param key The key to use for locking and unlocking this coin.
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     * Locks this coin if the provided key is correct.
     * @param keys The key to use for locking this coin.
     * @return true if this coin was successfully locked, else false.
     */
    public boolean lock(int keys) {
        if (this.key == keys) {
            locked = true;
            return true;
        }
        return false;
    }

    /**
     * Unlocks this coin if the provided key is correct.
     * @param keys The key to use for unlocking this coin.
     * @return true if this coin was successfully unlocked, else false.
     */
    public boolean unlock(int keys) {
        if (this.key == keys) {
            locked = false;
            return true;
        }
        return false;
    }

    /**
     * Create method that whether coin is locked.
     * @return true if this coin is locked, else false
     */
    public boolean locked() {
        return locked;
    }
}
    

