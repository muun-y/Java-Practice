package ca.bcit.comp1510.lab10;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Driver class for Name class. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class NameDriver {
    
    /**
     * Main method to drive the class. 
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<Name> names = new ArrayList<>();
        names.add(new Name("Sohee", "Hwang"));
        names.add(new Name("Yongeun", "Kwon"));
        names.add(new Name("Kenneth", "Ahn"));
        names.add(new Name("Marvin", "Sio"));
        names.add(new Name("Munyoung", "Cho"));
        names.add(new Name("Yunsang", "Jung"));
        names.add(new Name("David", "Cho"));
        
        System.out.println("Unsorted names:");
        for (Name name : names) {
            System.out.println(name);
        }
        
        Collections.sort(names);
        
        System.out.println("\nSorted names:");
        for (Name name : names) {
            System.out.println(name);
        }
    }
}
