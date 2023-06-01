package ca.bcit.comp1510.lab11;

/**
 * Java interface for Lackable class. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public interface Lockable {
    
    /**
     * establishes the key used to unlock.
     * @param key as an integer type
     */
    void setKey(int key);
    
    /**
     * locks the implementing object if the correct key is provided. 
     * @param key as an integer
     * @return true if the object is locked
     */
    boolean lock(int key);
    
    /**
     * unlocks the implementing object if the correct key is provided. 
     * @param key as an integer type
     * @return true if the object is unlocked
     */
    boolean unlock(int key);
    
    /**
     * Method that return the true and false, locked method. 
     * @return if the implementing object is locked.
     */
    boolean locked();
}
