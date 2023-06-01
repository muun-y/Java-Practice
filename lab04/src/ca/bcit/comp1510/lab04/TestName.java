package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * COMP1510 Programming Methods. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class TestName {
    
    /**
     * Test class Name. 
     * @param args unused
     * 
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String first = scan.nextLine();
        String middle = scan.nextLine();
        String last = scan.nextLine();
        Name myName = new Name(first, middle, last);
        
        System.out.println(myName.toString());
        
        scan.close();
    }
        
    

}
