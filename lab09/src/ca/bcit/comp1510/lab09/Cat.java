package ca.bcit.comp1510.lab09;

/**
 * Create program that manages a Cat Hotel.  
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class Cat {
    /**
     * Declare instance variable name. 
     */
    private final String name; 
    
    /**
     * Declare instance variable age. 
     */
    private int age; 
    
    /**
     * Create the constructor 
     * that accept a parameter for each instance variable. 
     * @param name
     *          as a String type
     * @param age
     *          as an integer type
     */
    public Cat(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Cleo"; 
        } else {
            this.name = name; 
        }
        if (age < 0) {
            this.age = 0; 
        } else {
            this.age = age;
        }
    }
    
    /**
     * Create accessor for name. 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Create accessor for age. 
     * @return age. 
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Create mutator for age. 
     * @param age
     *          as an integer type. 
     */
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age; 
        }
    }
    
    /**
     * Create a String for the Cat. 
     * @return toString
     */
    public String  toString() {
        return name + " (" + age + " years old )"; 
    }
}

