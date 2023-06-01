package q4;

import java.util.Scanner;

/**
 * Write an application that encodes a 5 MIX-character
 * and decode back into 5 MIX-character. 
 *
 * @author Munyoung Cho
 * @version 1.0
 */
public class Pack {
    /**
     * This is the main method that runs the code. 
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        //1. prompt and read the input string 
        Scanner scan = new Scanner(System.in); 
        String userInput; 
        System.out.println("Enter the 5 digits charater: ");
        userInput = scan.nextLine(); 
        
        //2. extract nth character
        char c1 = userInput.charAt(0);
        System.out.println("c1 is " + c1);
        
        char c2 = userInput.charAt(1);
        System.out.println("c2 is " + c2);
        
        char c3 = userInput.charAt(2);
        System.out.println("c3 is " + c3);
        
        final int three = 3; 
        char c4 = userInput.charAt(three);
        System.out.println("c4 is " + c4);
        
        final int four = 4; 
        char c5 = userInput.charAt(four);
        System.out.println("c5 is " + c5);
        
        
        //3. convert the each character to numeric value
        int value1 = c1 - 'A' + 1; 
        System.out.println("converts c1 is " + value1);
        
        int value2 = c2 - 'A' + 1; 
        System.out.println("converts c2 is " + value2);
        
        int value3 = c3 - 'A' + 1; 
        System.out.println("converts c3 is " + value3);
        
        int value4 = c4 - 'A' + 1; 
        System.out.println("converts c4 is " + value4);
        
        int value5 = c5 - 'A' + 1; 
        System.out.println("converts c5 is " + value5);
        
        System.out.println("Convert each charater to numeric value: " 
                + value1 + value2 + value3 
                + value4 + value5);
        
        //4. convert the number to base 56. 
        final int fifty = 56; 
        int multiplication = (int) (((Math.pow(fifty, four) * value1) 
                + (Math.pow(fifty, three) * value2) 
                + (Math.pow(fifty, 2) * value3 
                + (Math.pow(fifty, 1) * value4) 
                + (Math.pow(fifty, 0) * value5)))); 
        
        //5. print the encoded integer. 
        System.out.println("Print the endcoded number: " + multiplication);
        
        //6-7. Decode the value 
        char d1 = (char) (value1 - 1 + 'A'); 
        char d2 = (char) (value2 - 1 + 'A'); 
        char d3 = (char) (value3 - 1 + 'A'); 
        char d4 = (char) (value4 - 1 + 'A'); 
        char d5 = (char) (value5 - 1 + 'A'); 
        
        //8. Print the five decoded characters. 
        System.out.println("Print the five decoded characters: " 
                + d1 + d2 + d3 + d4 + d5);
        
        //close the scan object. 
        scan.close();
       
    }
}
