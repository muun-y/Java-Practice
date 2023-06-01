package ca.bcit.comp1510.lab06;

/**
 * A driver for the Name class.
 * 
 * @author Munyoung Cho
 * @version 2023
 */
public class NameDriver {
    /**
     * constant of THREE.
     */
    public static final int THREE = 3; 

    /**
     * Creates and manipulates Name objects.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        
        Name name1 = new Name(null, null, null);

        // Set the first, middle, and last names using mutator methods
        name1.setFirstName("Munyoung");
        name1.setMiddleName(" ");
        name1.setLastName("Cho");

        
        System.out.println("Name: " + name1);
        System.out.println("Full Name: " + name1.fullName());
        System.out.println("Name Length: " + name1.nameLengths());
        System.out.println("Uppercase Name: " + name1.nameUppercase());
        System.out.println("Third Character: " + name1.getCharacter(THREE));
        Name name2 = new Name("Munyoung", "Quincy", "Cho");
        System.out.println("Are name1 and name2 equal? " 
            + name1.isEqualtoNameObj(name2));
        System.out.println("Is the first name of name1 John? " 
            + name1.isEqual("MUNYOUNG"));

    }

}
