package ca.bcit.comp1510.lab10;

import java.util.Objects;

/**
 * Implement Comparable and use it to sort a list of Names. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class Name implements Comparable<Name> {
    /**
     * Declare instance variable first as final. 
     */
    private final String first; 

    /**
     * Declare instance variable middle as final. 
     */
    private final String middle;

    /**
     * Declare instance variable last as final. 
     */
    private final String last; 
    
    /**
     * First constructor that takes first, middle and last names. 
     * @param first
     *          as a String type
     * @param middle
     *          as a String type
     * @param last
     *          as a String type
     */
    public Name(String first, String middle, String last) {
        if (first == null || last == null) {
            throw new IllegalArgumentException("First and "
                    + "last names must not be null."); 
        }

        if (first.trim().isEmpty() || last.trim().isEmpty()) {
            throw new IllegalArgumentException("First and last names "
                    + "must not be empty."); 
        }

        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    /**
     * Second constructor that takes first and last names. 
     * @param first
     *          as a String type. 
     * @param last
     *          as a String type.
     */
    public Name(String first, String last) {
        this(first, null, last); 
    }
    
    /**
     * Create accessor for first name. 
     * @return first name
     */
    public String getFirst() {
        return first;
    }
    
    /**
     * Create accessor for middle name. 
     * @return middle name
     */
    public String getMiddle() {
        return middle;
    }
    
    /**
     * Create accessor for last name. 
     * @return last name
     */
    public String getLast() {
        return last;
    }
    
    /**
     * compareTo method to compare with other names. 
     * @param other
     *          as a object of Name class
     * @return lastCmp and firstCmp
     */
    public int compareTo(Name other) {
        int lastCmp = last.compareTo(other.last);
        if (lastCmp != 0) {
            return lastCmp;
        }
        int firstCmp = first.compareTo(other.first);
        if (firstCmp != 0) {
            return firstCmp;
        }
        return Objects.compare(middle, other.middle, String::compareTo);
    }
    
    /**
     * toString method to.  
     * @return the compare other.
     */
    public String toString() {
        return first + (middle == null ? "" : " " + middle) + " " + last;
    }
}
   


