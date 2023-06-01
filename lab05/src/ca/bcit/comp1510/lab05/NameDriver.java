package ca.bcit.comp1510.lab05;

/**
 * COMP1510 Programming Methods. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class NameDriver {
    /**
     * Test drive for class Name. 
     * @param args unused
     */
    public static void main(String[] args) {
        
        Name myName = new Name("Munyoung", " ", "Cho"); 
        System.out.println("print out " + myName.nameLength());
        System.out.println("print out " + myName.upperName());
        System.out.println("print out " + myName.nthCharacter(2));
        System.out.println("print out " + myName.commaName());
        System.out.println("print out " + myName.checkName("Munyoung"));
        System.out.println("print out " + myName.equal(myName));
        
                

    }

}
