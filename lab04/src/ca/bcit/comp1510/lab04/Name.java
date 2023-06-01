package ca.bcit.comp1510.lab04;

/**
 * COMP1510 Programming Method. 
 * 
 * @author Munyoung cho
 * @version 2023
 */

public class Name {
    //2. variables
    /**
     * firstName variable.
     */
    
    private String firstName;
    /**
     * middleName variable.
     */
    
    private String middleName; 
    /**
     * lastName variable.
     */
    
    private String lastName; 
    
    //3. Constructor 
    
    /**
     * Make a constructor. 
     * @param first
     *        String 
     * @param middle
     *        String
     * @param last
     *        String 
     */
    
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last; 
    }
   
    //4.accessors
    /**
    * Return first name.
    * 
    * @return the first name.
    */
    public String getFirstName() {
        return firstName;
       
    }
    
    /**
    * Return middle name.
    * 
    * @return the middle name.
    */
     
    public String getMiddleName() {
        return middleName;
    }
    /**
    * Return last name.
    * 
    * @return the last name. 
    */
    
    public String getLastName() {
        return lastName; 
    } 
   
    //4. mutators 
    /**
    * Set first name.
    * 
    * @param name
    * 
    */
    public void setFirstName(String name) {
        firstName = name; 
    }
    /**
     * Set middle name.
     * 
     * @param name 
     * 
     */
    
    public void setMiddleName(String name) {
        middleName = name; 
    }
    /**
     * Set last name. 
     * 
     * @param name 
     * 
     */
    
    public void setLastName(String name) {
        lastName = name; 
    }
    
    //5. Create toString() method
    /**
     * Return the full name. 
     * 
     * @return the full name.
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName; 
    }
   
}

    


