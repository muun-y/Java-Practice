package ca.bcit.comp1510.lab05;

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
    
    //create method
    /**
     * Return the Length of Name. 
     * @return the nameLength
     */
    public int nameLength() {
        return firstName.length() + middleName.length() 
                + lastName.length();
    }
    
    /**
     * Return the three initials in uppercase. 
     * @return upperName
     */
    public String upperName() {
        return firstName.substring(0, 1).toUpperCase() 
                + middleName.substring(0, 1).toUpperCase()
                + lastName.substring(0, 1).toUpperCase(); 
    }
    
    /**
     * Return the nth character in the full three part name. 
     * @param n int 
     * @return nthCharacter
     */
    public char nthCharacter(int n) {
        return (firstName + middleName + lastName).charAt(n); 
    }
    
    /**
     * Return a String  consisting of the comma.
     * @return commaName
     */
    public String commaName() {
        return lastName + ", " + firstName + ", " + middleName;
    }
    
    /**
     * Return true if the String is equal. 
     * @param name String
     * @return checkName
     */
    public boolean checkName(String name) {
        boolean  result = false;
        if (firstName.equals(name)) {
            result = true;
        }
        return result;  
    }
    
    /**
    * Returns true if the three parts of name object is true. 
    * @param thisname in Name object
    * @return Name thisname
    */
    public boolean equal(Name thisname) {
        return (firstName + middleName + lastName).equals(
                        thisname.firstName
                        + thisname.middleName
                        + thisname.lastName);
    
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

    


