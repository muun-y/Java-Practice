package ca.bcit.comp1510.lab06;

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
     * @param firstName
     *        String 
     * @param middleName
     *        String
     * @param lastName
     *        String 
     */

    public Name(String firstName, String middleName, String lastName) {

        if (firstName == null || firstName.trim().isEmpty()) {
            this.firstName = "Jane";
        } else {
            this.firstName = formatName(firstName);
        }
        
        if (middleName == null || middleName.trim().isEmpty()) {
            this.middleName = "Smith";
        } else {
            this.middleName = formatName(middleName);
        }
        
        if (lastName == null || lastName.trim().isEmpty()) {
            this.lastName = "Doe";
        } else {
            this.lastName = formatName(lastName);
        }
    }

    private String formatName(String firstName2) {
        return null;
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
     *          a string to name 
     */
    public void setFirstName(String name) {
        firstName = name.substring(0, 1).toUpperCase() 
                + name.substring(1, name.length()).toLowerCase(); 
    }
    
    /**
     * Set middle name.
     * 
     * @param name 
     * 
     */

    public void setMiddleName(String name) {
        middleName = name.substring(0, 1).toUpperCase() 
                + name.substring(1, name.length()).toLowerCase(); 
    }
    /**
     * Set last name. 
     * 
     * @param name 
     * 
     */

    public void setLastName(String name) {
        lastName = name.substring(0, 1).toUpperCase() 
                + name.substring(1, name.length()).toLowerCase(); 
    }
    
    /**
     * Return the full name. 
     * 
     * @return the full name.
     */
    public String toString() {
        return lastName + " " + firstName + " " + middleName; 
    }

    
    /**
     * Returns if the String is equals with firstName. 
     * @param str as a String 
     * 
     * @return compare the name with isEqual 
     */
    public boolean isEqual(String str) {
        return firstName.equals(str); 
    }
    
    /**
     * Returns if the Name object you enter equals to the Name object.
     * @param name as Name object
     * @return isEqualtoNameObj as a boolean 
     */ 
    public boolean isEqualtoNameObj(Name name) {
        return this.firstName.equals(name.getFirstName())
                && this.middleName.equals(name.getMiddleName())
                && this.lastName.equals(name.getLastName());
    }
    
    /**
     * Returns the total length of the full name.

     * @return the name of the length
     */
    public int nameLengths() {
        return firstName.length() + middleName.length() 
            + lastName.length(); 
    }
    
    /**
     * Returns the upper case. 
     * @return the each name part to uppercase
     */
    public String nameUppercase() {
        return firstName.substring(0, 1).toUpperCase()      
                + middleName.substring(0, 1).toUpperCase()
                + lastName.substring(0, 1).toUpperCase();
    }
    
    /**
     * Returns the nth character of the full name. 
     * @param n as a integer
     * @return the get N Character as a character
     */
    public char getCharacter(int n) {
        return toString().charAt(n - 1);

    }
    /**
     * Returns the full name as "last name, first name middle name".
     * 
     * @return fullName as a String
     */
    
    public String fullName() {
        return lastName + ", " + firstName + " " + middleName;
    }
  
 
    
}



